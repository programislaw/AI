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
public class ifAction extends Action {

    public ifAction(Item subject, ParamTypeEnum paramValue, Class<?> valueType, Action onYes, Action onNo) {
        super(subject, paramValue, valueType, onYes, onNo);
    }

    @Override
    public boolean make(){
        try {
            Item paramItem = Param.getFrom(paramValue, subject);
            if (subject == null || !(subject instanceof Man) || (paramItem == null && valueType != null )) {
                throw new RuntimeException("Action ifAction needs to have defined subject as Man and paramType.");
            }
            if ((paramItem != null && paramItem.getClass() == valueType) || (paramItem == null && valueType == null) ) {
                if (onYes != null) {
                    return onYes.make();
                } else {
                    return true;
                }
            } else {
                if (onNo != null) {
                    return onNo.make();
                } else {
                    return true;
                }
            }
        } catch (WorldLimitatException ex) {
            System.out.println("World Boundery Limit");
            return false;
        }
    }
    
}
