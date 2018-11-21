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
public enum ParamTypeEnum {

    UP(0),UPRIGHT(1),RIGHT(2),DOWNRIGHT(3),DOWN(4),DOWNLEFT(5),LEFT(6),UPLEFT(7); 

    int value;
    
    ParamTypeEnum(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public static ParamTypeEnum getEnum(int value) {
        for (ParamTypeEnum param : values()) {
            if (param.value == value) {
                return param;
            } 
        }
        return null;
    }
}
