#include "BinTree.h"

int main()
{
  BinTree test = BinTree("salut");
  BinTree* t = BinTree::NIL;

 if(BinTree::isNIL(BinTree::tl(t)))
 {
     printf("ok");
 }

 if(BinTree::toBool(t))
 {
     printf("NOK");
 }
 else
 {
     printf("Ok");
 }

  return 0;
}
