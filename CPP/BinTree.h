#ifndef BINTREE_H
#define BINTREE_H

#include <string>

class BinTree
{
public:
    //TODO operator=
        BinTree();
        BinTree (const BinTree & bt);
        BinTree(std::string node);
        ~BinTree();

        constexpr static BinTree* NIL = nullptr;
        static bool isNIL(const BinTree* tree);
        static BinTree* hd(BinTree* tree);
        static BinTree* tl(BinTree* tree);
        static bool toBool(BinTree* tree);

        //surcharge opérateurs
        BinTree operator =(BinTree const & other);
        BinTree operator ==(BinTree const & other);

private:
    std::string _node;
    BinTree *_left;
    BinTree *_right;
};

#endif
