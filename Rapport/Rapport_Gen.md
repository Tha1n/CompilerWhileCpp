__[COMP]__ Rapport projet __WHILE__ vers __CPP__

_Sébastien Blin, Pierre-Henri Collin, Kevin Ledy, Alexandre Quettier,  Benjamin Vion_

# Description générale

Ce rapport décrit comment nous avons choisi d'implémenter la traduction du langage __WHILE__ vers __CPP__.

# Schéma de traduction

Dans notre projet, nous visions donc la conversion du langage __While__ vers le langage __C++__. Pour parvenir à cette conversion, nous avons du établir très tôt une liste des correspondances entre les structures __While__ et les composants que nous offre le __C++__. Toutefois, avant cette transcription, il a été nécessaire de passer du code __While__ vers du code 3 adresses afin de simplifier la tâche.

## Correspondance While --> C++
### Structure de données
Comme nous le savons, en __While__, il n'existe qu'un seul type de structure de données. Cette structure est un arbre binaire. Il a donc été décidé dès le départ que nous représenterions cette structure de données par une classe __C++__ _BinTree_. Cette classe va donc regrouper toutes les méthodes nécessaires à l'exécution d'un code __While__. On trouve ainsi des méthodes permettant de tester si le _BinTree_ est à _nil_, si c'est un symbole ou encore une variable. On trouve également des méthodes d'accès sur les attributs de la classe et qui permettent donc d'accéder aux attributs _head_ et _tail_.
En revanche, on trouve dans cette classe _BinTree_ une méthode qui correspond à une commande de __While__, la méthode _cons_. Cette méthode va donc prendre 2 _BinTree_ pour n'en former qu'un (les deux _BinTree_ en entrée devenant les _head_ et _tail_ du nouvel arbre). Cette méthode ainsi que les précédentes sont déclarés en _static_ en __C++__, pour que ces méthodes soient utilisables sans instancier un seul objet puisqu'elles caractérisent un _BinTree_ en général et non un objet.

### Structures de contrôle
Pour ces traductions, nous reprenons simplement les structures existantes en __C++__. Un _if_ __While__ est donc traduit vers un _if_ __C++__. En utilisant les méthodes permettant de tester des conditions (_isNil_ notamment), on exécute la boucle le nombre de fois nécessaire.

## Code 3A
Avant de procéder à la génération du __C++__, nous avons réalisé une transcription du __While__ en code 3 adresses. Nous présentons dans la suite de ce document le code 3 adresses que nous avons choisi pour nos structures.

### Tableau de correspondances

While | Code 3 adresses
---|---
X = nil | < nil, X, \_, \_ >
nop | < nop, \_, \_, \_ >
X = (cons A B) | < cons, v_1, A, B > < :=, X,v\_1, \_ >
X = (cons A B C) | < cons, v\_1, B, C > < cons, v\_6, A, v\_1 > < :=, X,v\_6, \_ >
X = (hd Y) | < hd, X, Y, \_ >
X = (tl Y) | < tl, X, Y,\_ >
X = Y =? Z | < =?, X, Y, Z >
X := Y | < :=, X, Y, \_  >
X := (foo Y) |  < call, X, foo, Y >
if cond then codeThen else codeElse | < IF l\_0 l\_1, \_, cond, \_ >
while cond then code od | < WHILE l\_0, \_, cond, \_ >
for cond then code od | < WHILE l\_0, \_, cond, \_ >
foreach elem in ensemb do cmds od | < FOREACH l\_0, \_, elem, ensemb >

### Justifications des codes 3 adresses

Le code 3 adresses que nous avons choisi est un code que nous avons voulu simple et efficace. Pour les instructions simples comme les affectations, le _nop_, les tests d'égalités, nous avons repris le code 3 adresses que _M. Ridoux_ nous a montré en cours de compilation.

Justification des codes 3 adresses :

+ __< CONS, v\_1, B, C > < CONS, v\_6, A, v\_1 > < :=, X, v\_6, \_ >__ : Cette représentation découle des choix précédents pour notre pretty printer ou nous avions limiter un cons à seulement 2 opérandes. Il fallait donc automatiquement remplacer `cons A B C` par `cons A (cons B C)`. De la même façon, ici nous isolons des paires de variables pour faciliter la génération de code.
+ __< CALL, X, foo, Y >__ : Dans cette représentation, nous isolons en premier, les variables où l'on va stocker le résultat de la méthode (ici X) et en second les variables qui sont passées en paramètres (ici Y).
+ __< IF l\_0 l\_1, \_, cond, \_ >__ : Les labels l\_0 et l\_1 contiendront respectivement le code du _Then_ et le code du _Else_. Ils seront exécutés suivant l'évaluation de la condition _cond_
+ __< WHILE l\_0, \_, cond, \_ >__ : Exactement le même principe que pour le _if_, l'évaluation de la condition conditionne l'exécution du code situé au label l\_0. Le code 3 adresses du _while_ est également utilisé pour représenter un _for_ par commodité.
+ __< FOREACH l\_0, \_, elem, ensemb >__ : Ici encore, la même utilisation des labels est faite tant qu'on garantie l'évaluation de la condition.


# Architecture logicielle

Ce projet est découpé en 2 parties distinctes. La première, la plus grosse est composé de tout le code servant à traduire le __WHILE__ vers du __CPP__ Ces parties sont présentes dans les dossiers _whileComp*_. Celle-ci est divisée en plusieurs sous parties :

+ _whileComp/src/_ contient les interfaces d'entrées, c'est-à-dire _whpp.java_ pour le pretty printer et _whc.java_ pour le compilateur
+ _whileComp/src/org/xtext/example_ contient le fichier de définition de la grammaire
+ _whileComp/src/org/xtext/generator_ contient les générateurs comme le PrettyPrinter, le générateur de code 3 adresses (_ThreeAddGenerator.xtend_) et le générateur de code C++ (_CppGenerator.xtend_) ainsi que le fichier appellé lors de la sauvegarde d'un fichier sur une instance Eclipse (_WhileCppGenerator.xtend_).
+ _whileComp/src/SymbolTable_ contient nos classes utiles pour la génération et les tests (telles que la table des symboles, la représentation d'une fonction, etc.).
+ _whileComp.tests/src/_ contient nos tests unitaires du PrettyPrinter, de la table des symboles et du ThreeAddGenerator (Nos tests seront développés plus loin).

La seconde partie contient le code servant lors de l'exécution d'un programme __WHILE__, c'est-à-dire la __libWh__. Cette bibliothèque est présente dans le dossier _CPP_ et contient le fichier _BinTree.h_ et _BinTree.cpp_. Cette bibliothèque peut-être liée de 2 façons à notre programme __WHILE__. Soit en la donnant comme bibliothèque à g++, soit comme fichier du projet. Nous avons opté pour la seconde méthode. Ainsi nous avons juste à appeler `g++ -o test BinTree.* FICHIERWHILETRADUIT.cpp -std=c++11` notre fichier traduit incluant cette bibliothèque (`#include "BinTree.h"`)

Pour récapituler :

1. Nous appelons notre programme via `java -jar whc.jar FICHIER.wh -o FICHIER.cpp`
2. La classe _Whc_ récupère le contenu du fichier d'entrée et le donne à traiter au _ThreeAddGenerator_
3. Ce générateur va alors vérifier que le fichier est correct et générer le code 3 adresses du code __WHILE__. Il redonne alors à la classe _Whc_ une liste de Fonctions (un objet fonction contenant la table des symboles et une liste de quadruplet), une map entre les noms de fonctions du code __WHILE__ et leurs équivalents __Cpp__, la liste des labels créés (contenant des quadruplets) et les erreurs trouvées dans le fichier __WHILE__.
4. La classe _Whc_ passe alors ces résultats à la classe _CppGenerator_. Ce générateur va alors traduire les quadruplets générés en code __Cpp__, inclure les bonnes bibliothèques, générer la fonction main et retourner le code généré
5. Enfin la classe _Whc_ écrit le code généré dans le fichier de sortie et compile avec `g++`


# Les outils de productivité

## Git

Pour gérer les différentes versions du compilateur, nous avons utilisé l'outil __Git__.
Ainsi nous avions accès à la fois à la documentation et aux sources du projet.
Mais ce qui nous intéressait particulièrement était les _Issues_ qui permettent de créer des posts où l'on peut débattre sur un sujet, parler de bugs, etc.

Nous nous en sommes donc servis en faisant différents types d'issues :

- ToDoList : pour énumérer les tâches à faire et qui prenait quoi
- Comptes-Rendus-Réunions : prises de notes ou commentaires émisdurant les réunions d'avancement du projet, qui nous permettaient après coup de revenir dessus
- Des exemples de traduction de WHILE vers C++ pour toujours savoir vers où nousallions. Nous avons essayé de couvrir le maximum de cas
-  Autres : ces issues étaient plutôt temporaires car le débat portait soit sur la grammaire au départ du projet, soit d'un problème technique, d'une manière de concevoir, etc

D'ailleurs __Git__ nous a aussi aidé dans le versionnage, car plusieurs bugs ont pu être débusqués et réparés en regardant les différences entre deux versions.
Par conséquent, __Git__ a été un outil très important afin de mener à bien ce projet, tant sur l'aspect programmation que conception ou débats et questions.

Par contre, il y a de nombreuses fonctions utiles de __GIt__ que nous n'avons pas utilisé comme donner des noms de versions, ou le développement sur plusieurs branches (ce qui aurait été plus logique). Enfin on aurait modifié la gestion des TODO List en les écrivant plus précisément depuis le début, ça nous aurait évité d'oublier des trucs comme `=?` ou `not`.

## Validation du projet

### Couverture des tests

Notre stratégie de tests s'articule autour de 4 grandes parties qui suivent l'avancée du projet : tout d'abord nous avons un fichier de test (chemin : _whileComp.tests/src/whileComp/tests_) qui a pour but de tester le bon fonctionnement du PrettyPrinter (_PrettyPrinterTest.xtend_). Ce fichier contient plusieurs types de test :
+ Vérifier que le PrettyPrinter affiche correctement le code While conformément aux exigences de Mr. Ridoux. Nous avons testé l'affichage pour la structure __while__, les __cons__, les __list__.
+ Vérifier que si on applique le PrettyPrinter sur lui-même, on obtient le même résultat
+ Vérifier `whpp-1(f) = whpp-1(whpp(f))`
+ Vérifier `whpp(f) = whpp(whpp-1(f))`
+ Réaliser des stress tests (en largeur, en longueur et en profondeur)

Le second fichier de test a pour mission de vérifier le bon fonctionnement de la table de symbole.

Le troisième fichier de test a pour but de tester le passage du code __While__ au code 3 adresses :

Pour ce qui est du passage du code 3 adresses au code __C++__, nous n'avons pas réalisé de fichier de test. Nous avons testé _à la main_ que la traduction se réalise correctement.
Pour cela, nous avons créé un répertoire (_demo_) qui contient un ensemble de fichiers __While__ avec des fonctions simples et d'autres plus compliqués, puis après avoir lancé le générateur de code __C++__, on compare le résultat avec la spécification que nous avons défini dans le schéma de traduction.
