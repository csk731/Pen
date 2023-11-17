package design.pens;

import design.pens.writingstrategies.WritingStrategy;
import design.refills.Refill;

public class PinPointPen extends Pen implements Refillable{
    private Refill refill;

    public PinPointPen(WritingStrategy writingStrategy) {
        super(writingStrategy);
    }

    @Override
    public void refill() {
        System.out.println("PinPoint Pen refill changed");
    }
}
