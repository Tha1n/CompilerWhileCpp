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

//<CONS, v_1, v_2,v_4>
BinTree v_1 = BinTree::cons(v_2, v_4);
//<AFF, v_0, v_1,_>
v_0 = v_1;


//write
std::vector<BinTree> retour;
retour.push_back(v_0);
return retour;
}
