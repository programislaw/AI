/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bak
 */
class GoAction extends Action {

    public GoAction(Item subject) {
        super(subject, null, null, null, null);
    }

    @Override
    public boolean make() {
        throw new RuntimeException("Action GoAction needs to have defined subject as Man.");
    }
    
    protected boolean makeTo(int x, int y) {
        try {
            if (subject == null || !(subject instanceof Man)) {
                throw new RuntimeException("Action GoAction needs to have defined subject as Man.");
            }
            
            int fromX = subject.getPlace().getX();
            int fromY = subject.getPlace().getY();
            int toX = fromX+x;
            int toY = fromY+y;
            
            if (World.get().getPlace(toX, toY).getItem() == null) {
                Place fromPlace = World.get().getPlace(fromX, fromY);
                fromPlace.setItem(null);
                Place toPlace = World.get().getPlace(toX, toY);
                subject.setPlace(toPlace);
                toPlace.setItem(subject);
            }
        } catch (WorldLimitatException ex) {
            System.out.println("World Boundery Limit");
            return false;
        }
        return true;
    }
}

