/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

/**
 *
 * @author Bak
 */
public class Param {

    static Item getUpFrom(Item item) throws WorldLimitatException {
       return World.get().getItem(item.getPlace().getX()-1, item.getPlace().getY());
    }
    static Item getUpRightFrom(Item item) throws WorldLimitatException {
       return World.get().getItem(item.getPlace().getX()-1, item.getPlace().getY()+1);
    }
    static Item getRightFrom(Item item) throws WorldLimitatException {
       return World.get().getItem(item.getPlace().getX(), item.getPlace().getY()+1);
    }
    static Item getDownRightFrom(Item item) throws WorldLimitatException {
       return World.get().getItem(item.getPlace().getX()+1, item.getPlace().getY()+1);
    }
    static Item getDownFrom(Item item) throws WorldLimitatException {
       return World.get().getItem(item.getPlace().getX()+1, item.getPlace().getY());
    }
    static Item getDownLeftFrom(Item item) throws WorldLimitatException {
       return World.get().getItem(item.getPlace().getX()+1, item.getPlace().getY()-1);
    }
    static Item getLeftFrom(Item item) throws WorldLimitatException {
       return World.get().getItem(item.getPlace().getX(), item.getPlace().getY()-1);
    }
    static Item getUpLeftFrom(Item item) throws WorldLimitatException {
       return World.get().getItem(item.getPlace().getX()-1, item.getPlace().getY()-1);
    }

    static public Item getFrom(ParamTypeEnum paramValue, Item item) throws WorldLimitatException {
        if (null != paramValue) switch (paramValue) {
            case UP:
                return getUpFrom(item);
            case UPRIGHT:
                return getUpRightFrom(item);
            case RIGHT:
                return getRightFrom(item);
            case DOWNRIGHT:
                return getDownRightFrom(item);
            case DOWN:
                return getDownFrom(item);
            case DOWNLEFT:
                return getDownLeftFrom(item);
            case LEFT:
                return getLeftFrom(item);
            case UPLEFT:
                return getUpLeftFrom(item);
            default:
                return null;
        }
        return null;
    }
    
    
}
