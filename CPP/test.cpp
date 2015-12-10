#include "BinTree.h"

#include <iostream>

int main()
{
  BinTree *test = new BinTree("1");
  BinTree *test2 = new BinTree("2");
  BinTree *test3 = BinTree::cons(test, test2);
  BinTree* t = BinTree::NIL;

  std::cout << "test " << *test << std::endl;
  std::cout << "test2 " << *test2 << std::endl;
  std::cout << "test3 " << *test3 << std::endl;
  std::cout << "hd(test) " << *BinTree::hd(test3) << std::endl;
  std::cout << "tl(test) " << *BinTree::tl(test3) << std::endl;
  std::cout << "t " << *t << std::endl;

 if(BinTree::isNIL(BinTree::tl(t)))
     printf("tl(NIL) = NIL\n");

 if(BinTree::isNIL(BinTree::hd(t)))
      printf("hd(NIL) = NIL\n");

 if(!BinTree::toBool(t))
     printf("NIL = false\n");

 if(BinTree::toBool(test))
      printf("!NIL = true\n");

  return 0;
}
