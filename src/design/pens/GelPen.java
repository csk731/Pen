package design.pens;

import design.pens.writingstrategies.WritingStrategy;
import design.refills.Refill;

public class GelPen extends Pen implements Refillable{

    private Refill refill;

    public GelPen(WritingStrategy writingStrategy) {
        super(writingStrategy);
    }

    @Override
    public void refill() {
        System.out.println("GelPen refill changed");
    }
}
