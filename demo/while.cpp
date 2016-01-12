#include "BinTree.h"
#include <iostream>
#include <vector>

std::vector<BinTree> f0(std::vector<BinTree> args)
{
        //Read
BinTree v_0 = args.size() < 0? BinTree() : args.at(0);
//Instructions
//<AFF, v_1, v_0,_>
BinTree v_1 = v_0;

//<WHILE l_0, _, v_1,_>
while (BinTree::isTrue(v_1)) {
//<NOP, _, _, _>
}

//write
std::vector<BinTree> retour;
retour.push_back(v_0);
return retour;
}
