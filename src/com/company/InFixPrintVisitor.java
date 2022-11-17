package com.company;

public class InFixPrintVisitor implements AbstractVisitorAspect.Visitor  {

    public void visit(AbstractVisitorAspect.BinaryOperator node)  {
        //print out left subtree
        BinaryOperatorNode binaryOperatorNode = (BinaryOperatorNode) node;
        System.out.print("(");
        if (binaryOperatorNode.getLeft() != null) binaryOperatorNode.getLeft().accept(this);
        //print out this node
        System.out.print(" " + binaryOperatorNode.getLabel() + " ");
        //print out right subtree
        if (binaryOperatorNode.getRight() != null) binaryOperatorNode.getRight().accept(this);
        System.out.print(")");
    }


    public void visit(AbstractVisitorAspect.Numeric node)  {
        NumericNode numericNode = (NumericNode) node;
        System.out.print(numericNode.getLabel());
    }
}
