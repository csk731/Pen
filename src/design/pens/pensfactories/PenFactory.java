package design.pens.pensfactories;

import design.pens.*;

public class PenFactory {
    public static Pen getPen(PenType type){
        if(type.name().equals(PenType.BALL.name())){
            return new BallPen(WritingStrategyFactory.getWritingStrategy(type));
        }
        else if(type.name().equals(PenType.FOUNTAIN.name())){
            return new FountainPen(WritingStrategyFactory.getWritingStrategy(type));
        }
        else if(type.name().equals(PenType.PINPOINT.name())){
            return new PinPointPen(WritingStrategyFactory.getWritingStrategy(type));
        }
        else if(type.name().equals(PenType.GEL.name())){
            return new GelPen(WritingStrategyFactory.getWritingStrategy(type));
        }
        return null;
    }
}
