#include "BinTree.h"

BinTree::BinTree()
{
    _node = "";
    _left = NIL;
    _right = NIL;
}

BinTree::BinTree(std::string node)
{
    _node = node;
    _left = NIL;
    _right = NIL;
}

BinTree::~BinTree()
{

}

bool BinTree::isNIL(const BinTree* tree)
{
    return tree == NIL;
}

BinTree* BinTree::hd(BinTree* tree)
{
    if(isNIL(tree))
      return tree;
    else
    {
        //TODO
        return tree;
    }
}

BinTree* BinTree::tl(BinTree* tree)
{
    if(isNIL(tree))
      return tree;
    else
    {
        //TODO
        return tree;
    }
}

bool BinTree::toBool(BinTree* tree)
{
    if(isNIL(tree))
      return false;
    return true;
}
