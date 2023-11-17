package design.pens;

import design.inks.Ink;
import design.nibs.Nib;
import design.pens.writingstrategies.WritingStrategy;

public class FountainPen extends Pen{
    private Ink ink;
    private Nib nib;

    public FountainPen(WritingStrategy writingStrategy) {
        super(writingStrategy);
    }
}
