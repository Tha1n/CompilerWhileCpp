#include "BinTree.h"
#include <iostream>
#include <vector>

std::vector<BinTree> f0(std::vector<BinTree> args)
{
	//Read
BinTree v_0 = args.at(0);
//Instructions
//<NOP, _, _, _>

//write
std::vector<BinTree> retour;
retour.push_back(v_0);
return retour;
}


int main(int argc, char *argv[]) {
if(argc < 2) {
		std::cout << "Not enough arg\n";
		return -1;
}
	std::vector<BinTree> entry;
	entry.push_back(BinTree(argv[1]));

std::vector<BinTree> result = f0(entry);
	for(auto bT : result)
		std::cout << bT << std::endl;
	return 0;
}
