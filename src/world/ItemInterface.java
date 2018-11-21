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
public interface ItemInterface {
    
    
    ActionStatusEnum whenEaten(Item actor);
    ActionStatusEnum whenKilling(Item actor);
    ActionStatusEnum whenMoving(Item actor);
    
}
