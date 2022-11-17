package com.company;

public class PostFixPrintVisitor implements AbstractVisitorAspect.Visitor  {


    public void visit(AbstractVisitorAspect.BinaryOperator node)  {
        BinaryOperatorNode binaryOperatorNode = (BinaryOperatorNode) node;
        //print out left subtree
        if (binaryOperatorNode.getLeft() != null) binaryOperatorNode.getLeft().accept(this);
        //print out right subtree
        if (binaryOperatorNode.getRight() != null) binaryOperatorNode.getRight().accept(this);
        //print out this node
        System.out.print(binaryOperatorNode.getLabel());

    }


    public void visit(AbstractVisitorAspect.Numeric node)  {
        NumericNode numericNode = (NumericNode) node;
        System.out.print(numericNode.getLabel());
    }
}
