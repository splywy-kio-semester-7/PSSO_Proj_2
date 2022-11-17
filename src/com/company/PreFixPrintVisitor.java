package com.company;

public class PreFixPrintVisitor implements AbstractVisitorAspect.Visitor  {


    public void visit(AbstractVisitorAspect.BinaryOperator node)  {
        BinaryOperatorNode binaryOperatorNode = (BinaryOperatorNode) node;
        //print out this node
        System.out.print(binaryOperatorNode.getLabel());
        //print out left subtree
        if (binaryOperatorNode.getLeft() != null) binaryOperatorNode.getLeft().accept(this);
        //print out right subtree
        if (binaryOperatorNode.getRight() != null) binaryOperatorNode.getRight().accept(this);
    }


    public void visit(AbstractVisitorAspect.Numeric node)  {
        NumericNode numericNode = (NumericNode) node;
        System.out.print(numericNode.getLabel());
    }
}
