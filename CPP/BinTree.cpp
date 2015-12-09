#include "BinTree.h"

BinTree::BinTree()
{
    _node = "";
    _left = NIL;
    _right = NIL;
}

BinTree (const BinTree & bt)
{
  this._node = bt._node;
  this._left = bt._left;
  this._right = bt._right;
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
        this._left = tree;
        return tree;
    }
}

BinTree* BinTree::tl(BinTree* tree)
{
    if(isNIL(tree))
      return tree;
    else
    {
        this._right = tree;
        return tree;
    }
}

bool BinTree::toBool(BinTree* tree)
{
    if(isNIL(tree))
      return false;
    return true;
}

BinTree operator =(BinTree const & other)
{
  //TODO
    if (this != &other)
    {
      this._node = other._node;
      this._left = other._left;
      this._right = other._right;
    }

    return *this;
}

BinTree operator ==(BinTree const & a, BinTree const & b)
{
  //Teste si a.m_heure == b.m_heure etc.
   if (a._node == b._node && a._left == b._left && a._right == b._right)
       return true;
   else
       return false;
}
