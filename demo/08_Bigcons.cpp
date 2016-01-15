#include "BinTree.h"
#include <iostream>
#include <vector>

std::vector<BinTree> f0(std::vector<BinTree> args)
{
	//Read
BinTree v_0 = args.size() < 0? BinTree() : args.at(0);
//Instructions
//<AFF, v_2, v_3,_>
BinTree v_3;

//<AFF, v_4, v_5,_>
BinTree v_5;

//<AFF, v_7, v_8,_>
BinTree v_8;

//<AFF, v_10, v_11,_>
BinTree v_11;

//<AFF, v_13, v_14,_>
BinTree v_14;

//<AFF, v_16, v_17,_>
BinTree v_17;

//<CONS, v_1, v_2,v_4>
BinTree v_1 = BinTree::cons(v_2, v_4);
//<CONS, v_6, v_7,v_1>
BinTree v_6 = BinTree::cons(v_7, v_1);
//<CONS, v_9, v_10,v_6>
BinTree v_9 = BinTree::cons(v_10, v_6);
//<CONS, v_12, v_13,v_9>
BinTree v_12 = BinTree::cons(v_13, v_9);
//<CONS, v_15, v_16,v_12>
BinTree v_15 = BinTree::cons(v_16, v_12);
//<AFF, v_0, v_15,_>
v_0 = v_15;


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
