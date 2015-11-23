#ifndef BINTREE_H
#define BINTREE_H

#include <string>

class BinTree
{
public:
    //TODO operator=
        BinTree();
        BinTree(std::string node);
        ~BinTree();

        constexpr static BinTree* NIL = nullptr;
        static bool isNIL(const BinTree* tree);
        static BinTree* hd(BinTree* tree);
        static BinTree* tl(BinTree* tree);
        static bool toBool(BinTree* tree);

private:
    std::string _node;
    BinTree *_left;
    BinTree *_right;
};

#endif
