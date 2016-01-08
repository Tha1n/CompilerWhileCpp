#ifndef BINTREE_H
#define BINTREE_H

#include <string>
#include <iostream>

class BinTree
{
public:
        BinTree();
        BinTree (const BinTree & bt);
        BinTree(std::string node);
        ~BinTree();

        constexpr static BinTree* NIL = nullptr;
        static bool isNIL(const BinTree* tree);
        static bool isSymb(const BinTree* tree);
        static bool isVar(const BinTree* tree);
        static BinTree* hd(BinTree* tree);
        static BinTree* tl(BinTree* tree);
        static BinTree* cons(BinTree* left, BinTree* right);
        static bool isTrue(BinTree* tree);

        //surcharge opérateurs
        BinTree operator =(BinTree const & other);
        bool operator ==(BinTree const & other);

        friend std::ostream& operator<<(std::ostream & out, const BinTree& bT);

private:
    std::string toString() const ;

    std::string *_node;
    BinTree *_left;
    BinTree *_right;
};

#endif
