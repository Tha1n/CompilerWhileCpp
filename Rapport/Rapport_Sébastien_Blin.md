# Rapport Personnel Compilation : Sébastien Blin

## 1er délivrable

Durant la partie Pretty Printer, je me suis occupé de 4 parties :

+ En tant que Chef validation, j'ai passé les premières heures à mettre en place la manière dont nous allons faire les tests unitaires et l'architecture du git. La durée de réalisation du premier délivrable étant assez courte j'ai regretté de ne pas avoir plus d'automatisation dans nos tests. En effet j'aurais préféré voir un git sur plusieurs branches (au moins une branche de développement, une production) et mettre en place __Travis CI__ pour automatiser les builds et le lancement des tests unitaires.
+ L'interface d'entrée _Whpp.java_
+ La rédaction de la documentation pour cette partie avec Benjamin Vion
+ La relecture et l'aide au debug pendant que les autres s'occupaient de réparer notre grammaire et du coeur du pretty printer.

## 2ème délivrable

Pour les tests, j'ai laissé Pierre-Henri et Alexandre s'en occuper (sauf les stress tests), je me suis occupé de réparer nos erreurs du pretty printer.  
Je me suis alors occupé de commencer le générateur de code 3 adresses et j'ai rédigé la __libWh__.  
J'ai rédigé avec l'aide de Benjamin la documentation pour la traduction `While->Code 3 adresses` puis `Code 3 adresses->Cpp`. Puis, nous avons tous programmé le generateur de code 3 adresses.

## 3ème délivrable

Je me suis occupé de tout le générateur `Code 3 adresses->Cpp`  (_CppGenerator.xtend_), c'est-à-dire de comment passer du code 3 adresses au code _Cpp_ et de fixer les bugs que l'on découvrait sur le générateur précédent où sur la __libWh__ (notamment quelques problèmes avec un pointeur mal géré qui donnait des _segmentation fault_).
