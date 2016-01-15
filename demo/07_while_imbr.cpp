#include "BinTree.h"
#include <iostream>
#include <vector>

std::vector<BinTree> f0(std::vector<BinTree> args)
{
	//Read
BinTree v_0 = args.size() < 0? BinTree() : args.at(0);
//Instructions
//<AFF, v_1, x,_>
BinTree x;

//<WHILE l_0, _, v_1,_>
while (BinTree::isTrue(v_1)) {
//<AFF, v_2, y,_>
BinTree y;

//<WHILE l_1, _, v_2,_>
while (BinTree::isTrue(v_2)) {
//<AFF, v_3, z,_>
BinTree z;

//<WHILE l_2, _, v_3,_>
while (BinTree::isTrue(v_3)) {
//<NOP, _, _, _>
}
}
}

//write
std::vector<BinTree> retour;
retour.push_back(v_0);
return retour;
}


int main(int argc, char *argv[]) {
std::vector<BinTree> entry;
argc > 1? entry.push_back(BinTree(argv[1])) : entry.push_back(BinTree());

std::vector<BinTree> result = f0(entry);
	for(auto bT : result)
		std::cout << bT << std::endl;
	return 0;
}
