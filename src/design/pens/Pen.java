package design.pens;

import design.pens.writingstrategies.WritingStrategy;

public abstract class Pen {
    private String name;
    private String brand;
    private float price;
    private WritingStrategy writingStrategy;

    public Pen(WritingStrategy writingStrategy) {
        this.writingStrategy = writingStrategy;
    }

    public void write(){
        writingStrategy.write();
    }
}
