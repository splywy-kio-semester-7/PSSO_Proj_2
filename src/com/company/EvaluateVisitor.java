package com.company;

import java.util.Stack;

public class EvaluateVisitor implements AbstractVisitorAspect.Visitor {

    private Stack<Integer> stack = new Stack<>();

    public int getValue() {
        return stack.peek();
    }

    public void visit(AbstractVisitorAspect.BinaryOperator node)  {
        BinaryOperatorNode binaryOperatorNode = (BinaryOperatorNode) node;
        if (binaryOperatorNode.getLeft() != null) binaryOperatorNode.getLeft().accept(this);
        if (binaryOperatorNode.getRight() != null) binaryOperatorNode.getRight().accept(this);
        int right = stack.pop();
        int left = stack.pop();
        stack.push( binaryOperatorNode.compute(left, right) );

    }

    public void visit(AbstractVisitorAspect.Numeric node)  {
        NumericNode numericNode = (NumericNode) node;
        stack.push(numericNode.getValue());
    }
}
