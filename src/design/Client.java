package design;

import design.pens.Pen;
import design.pens.PenType;
import design.pens.pensfactories.PenFactory;

public class Client {
    public static void main(String[] args) {
        Pen pen= PenFactory.getPen(PenType.FOUNTAIN);
        pen.write();
    }
}
