#include "BinTree.h"
#include <iostream>
#include <vector>

std::vector<BinTree> f0(std::vector<BinTree> args)
{
	//Read
BinTree v_0 = args.size() < 0? BinTree() : args.at(0);
//Instructions
//<AFF, v_1, nil,_>
BinTree v_1;

//<AFF, v_0, v_1,_>
v_0 = v_1;


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
