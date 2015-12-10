#include "BinTree.h"

#include <iostream>

int main()
{
  BinTree *test = new BinTree("1");
  BinTree *test2 = new BinTree("2");
  BinTree *test3 = BinTree::cons(test, test2);
  BinTree* t = BinTree::NIL;

  std::cout << *test << std::endl;
  std::cout << *test2 << std::endl;
  std::cout << *test3 << std::endl;
  std::cout << *BinTree::hd(test3) << std::endl;
  std::cout << *BinTree::tl(test3) << std::endl;
  std::cout << *t << std::endl;

 if(BinTree::isNIL(BinTree::tl(t)))
     printf("ok");

 if(BinTree::toBool(t))
     printf("NOK");
 else
     printf("Ok");

  return 0;
}
