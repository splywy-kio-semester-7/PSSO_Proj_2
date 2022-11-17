package com.company;

public aspect VisitorAspect extends AbstractVisitorAspect{
    declare parents: TreeNode implements Visitable;
    declare parents: BinaryOperatorNode implements BinaryOperator;
    declare parents: NumericNode implements Numeric;
}
