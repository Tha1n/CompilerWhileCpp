# WhileToCpp

Cette archive contient un compilateur de __WHILE__ vers __CPP__. Il a été réalisé par _Sébastien Blin, Pierre-Henri Collin, Kevin Ledy, Alexandre Quettier, Benjamin Vion_.

# Dépendances

Afin de pleinement utiliser notre compilateur vous aurez besoin de :

+ Un environnement __Java__ fonctionnel.
+ Un compilateur __c++__ (_g++_ de préférence)

# Architecture

+ _bin/_ contient la __libWh__ et le __.jar__ de l'application
+ _CPP/_ contient la __libWh__
+ _demo/_ contient un ensemble de programmes __WHILE__
+ _documentation/_ contient la documentation du projet
+ _Rapport/_ contient les rapports personnels et le rapport global du projet
+ _whileComp/src/_ contient le code du générateur
+ _whileComp.tests/src/_ contient nos tests

# Utilisation

Dans le dossier _bin_:
`java -jar whc.jar INPUT.wh`

De plus les options `-o` (pour préciser un fichier de sortie) et `-debug` (afin de voir ce que fait plus précisément le compilateur)

# Exemple

```cpp
[AmarOk@TARSI ~/Projets/ESIR/COMP/ProjetCompilation/bin]java -jar whc.jar ../demo/swap.wh -debug
Generate 3@ code
[DBG]f += v_2 := v_1

[DBG]f += v_3 := v_0

[DBG]f += <:=, v_0,v_2, _>

[DBG]f += <:=, v_1,v_3, _>

Generate Cpp code
#include "BinTree.h"
#include <iostream>
#include <vector>

std::vector<BinTree> f0(std::vector<BinTree> args)
{
	//Read
BinTree v_0 = args.size() < 0? BinTree() : args.at(0);
BinTree v_1 = args.size() < 1? BinTree() : args.at(1);
//Instructions
//<AFF, v_2, v_1,_>
BinTree v_2 = v_1;

//<AFF, v_3, v_0,_>
BinTree v_3 = v_0;

//<AFF, v_0, v_2,_>
v_0 = v_2;

//<AFF, v_1, v_3,_>
v_1 = v_3;


//write
std::vector<BinTree> retour;
retour.push_back(v_0);
retour.push_back(v_1);
return retour;
}


int main(int argc, char *argv[]) {
std::vector<BinTree> entry;
argc > 1? entry.push_back(BinTree(argv[1])) : entry.push_back(BinTree());
argc > 2? entry.push_back(BinTree(argv[2])) : entry.push_back(BinTree());

std::vector<BinTree> result = f0(entry);
	for(auto bT : result)
		std::cout << bT << std::endl;
	return 0;
}

Now, you can run : /bin/g++ BinTree.* default.cpp -std=c++11 -o default
```

# Exemples

Vous pouvez touver des exemples de code __WHILE__ dans _demo/_
