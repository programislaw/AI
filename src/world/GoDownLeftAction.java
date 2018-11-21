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
class GoDownLeftAction extends GoAction {

    public GoDownLeftAction(Item subject) {
        super(subject);
    }
    
    @Override
    public boolean make() {
        return makeTo(1, -1);
    }
}
