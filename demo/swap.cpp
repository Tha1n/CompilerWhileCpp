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
