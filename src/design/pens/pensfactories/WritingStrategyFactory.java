package design.pens.pensfactories;

import design.pens.PenType;
import design.pens.writingstrategies.*;

public class WritingStrategyFactory {
    public static WritingStrategy getWritingStrategy(PenType type){
        if(type.name().equals(PenType.BALL.name())){
            return new BallPenWritingStrategy();
        }
        else if(type.name().equals(PenType.FOUNTAIN.name())){
            return new FountainPenWritingStrategy();
        }
        else if(type.name().equals(PenType.PINPOINT.name())){
            return new PinPointPenWritingStrategy();
        }
        else if(type.name().equals(PenType.GEL.name())){
            return new GelPenWritingStrategy();
        }
        return null;
    }
}
