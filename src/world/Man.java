/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Bak
 */
public class Man extends Item {

    private DNA dna;
    
    public Man(Place place) {
        super(place);
        this.itemEnum = ItemEnum.MAN;
        this.dna = new DNA(this);
    }

    
    @Override
    public void action() {
        dna.evaluate();
    }

    @Override
    public ActionStatusEnum whenEaten(Item actor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ActionStatusEnum whenKilling(Item actor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ActionStatusEnum whenMoving(Item actor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//---------------------------------------------------------------------------//
    public class DNA {
        private List<Action> actions;
        private Man man;

        public DNA(Man man) {
            this.man = man;
            actions = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                actions.add(generateAction());
            }

        }
        
        private Action generateAction() {
            ParamTypeEnum paramValueYes = RandomizeParam();
            ParamTypeEnum paramValueNo = RandomizeParam();
            Action onYes = EatAction(Man,)//GoActionFactory.getAction(man, paramValueYes);
            Action onNo = GoActionFactory.getAction(man, paramValueNo);

            return new ifAction(man, paramValueYes, Man.class, onYes, onNo);
        }
        
        private ParamTypeEnum RandomizeParam() {
            int random = (int )(Math.random() * 7 + 1);
            ParamTypeEnum param = ParamTypeEnum.getEnum(random);
            return param;
        }

        public void evaluate() {
            for (Action action : dna.actions) {
                if (action.make()) {
                    break;
                } else {
                    int w = 1;
                }
            }
        }

    }

}
