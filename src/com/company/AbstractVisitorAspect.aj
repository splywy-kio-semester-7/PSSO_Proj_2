package com.company;

public abstract aspect AbstractVisitorAspect {

    protected interface Visitable {

    }
    protected interface BinaryOperator extends Visitable {

    }
    protected interface Numeric extends Visitable {

    }
    public interface Visitor {
        public void visit(BinaryOperator binaryOperatorNode);
        public void visit(Numeric numericNode);
    }

    public void Visitable.accept(Visitor visitor){

    }
    public void BinaryOperator.accept(Visitor visitor){
        visitor.visit(this);
    }
    public void Numeric.accept(Visitor visitor) {
        visitor.visit(this);
    }
}
