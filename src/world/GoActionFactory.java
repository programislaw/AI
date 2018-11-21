/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import static world.Param.getUpFrom;

/**
 *
 * @author Bak
 */
public class GoActionFactory {

    public GoActionFactory() {
    }

    public static Action getAction(Item subject, ParamTypeEnum paramValue) {
        if (null != paramValue) switch (paramValue) {
            case UP:
                return new GoUpAction(subject);
            case UPRIGHT:
                return new GoUpRightAction(subject);
            case RIGHT:
                return new GoRightAction(subject);
            case DOWNRIGHT:
                return new GoDownRightAction(subject);
            case DOWN:
                return new GoDownAction(subject);
            case DOWNLEFT:
                return new GoDownLeftAction(subject);
            case LEFT:
                return new GoLeftAction(subject);
            case UPLEFT:
                return new GoUpLeftAction(subject);
            default:
                return null;
        }
        return null;
    }
    
}
