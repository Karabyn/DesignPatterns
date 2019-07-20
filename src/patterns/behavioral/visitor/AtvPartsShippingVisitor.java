package patterns.behavioral.visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Fender fender) {
        shippingAmount += 15;
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 25;
    }

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 20;

    }

    @Override
    public void visit(PartsOrder partsOrder) {
        List<AtvPart> parts = partsOrder.getParts();
        if (parts.size() > 3) {
            shippingAmount -= 5;
        }
    }
}
