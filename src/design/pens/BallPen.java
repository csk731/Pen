package design.pens;

import design.pens.writingstrategies.WritingStrategy;

public class BallPen extends Pen implements Refillable {
    public BallPen(WritingStrategy writingStrategy) {
        super(writingStrategy);
    }

    @Override
    public void refill() {
        System.out.println("BallPen refill changed");
    }
}
