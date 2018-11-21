/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import static world.ParamTypeEnum.UP;
import static world.ParamTypeEnum.values;

/**
 *
 * @author Bak
 */
public enum ItemEnum {
    
    MAN(0),TREE(1),WOOD(2),ANIMAL(3),FOOD(4),WATER(5),ROCK(6);
    
    int value;
    
    ItemEnum(int value){
        this.value = value;
    }
    
        public int getValue() {
        return value;
    }
    
    public static ItemEnum getEnum(int value) {
        for (ItemEnum item : values()) {
            if (item.value == value) {
                return item;
            } 
        }
        return null;
    }
}
