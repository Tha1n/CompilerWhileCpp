#include "BinTree.h"

BinTree::BinTree()
{
    _node = "";
    _left = NIL;
    _right = NIL;
}

BinTree::BinTree (const BinTree & bt)
{
  this->_node = bt._node;
  this->_left = bt._left;
  this->_right = bt._right;
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
        return tree->_left;
}

BinTree* BinTree::tl(BinTree* tree)
{
    if(isNIL(tree))
      return tree;
    else
        return tree->_right;
}

BinTree* BinTree::cons(BinTree* left, BinTree* right)
{
    BinTree* rtTree = new BinTree();
    rtTree->_left = left;
    rtTree->_right = right;
    return rtTree;
}

bool BinTree::toBool(BinTree* tree)
{
    if(isNIL(tree))
      return false;
    return true;
}

BinTree BinTree::operator =(BinTree const & other)
{
    if (this != &other)
    {
      this->_node = other._node;
      this->_left = other._left;
      this->_right = other._right;
    }

    return *this;
}

bool BinTree::operator ==(BinTree const & other)
{
  //Teste si a.m_heure == b.m_heure etc.
   if (this->_node == other._node && this->_left == other._left && this->_right == other._right)
       return true;
   else
       return false;
}

std::string BinTree::toString() const
{
    if(isNIL(this))
        return "NIL";
    else
        return "[" + _node + "," + _left->toString() + "," + _right->toString() + "]";
}

std::ostream& operator <<(std::ostream& os, const BinTree& bT)
{
    os << bT.toString();
    return os;
}
