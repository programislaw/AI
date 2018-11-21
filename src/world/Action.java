/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import java.util.List;

/**
 *
 * @author Bak
 */
public class Action {
    
    protected Item subject;
    protected ParamTypeEnum paramValue;
    protected Class<?> valueType;
    protected Action onYes;
    protected Action onNo;

    public Action(Item subject, ParamTypeEnum paramValue, Class<?> valueType, Action onYes, Action onNo) {
        this.subject = subject;
        this.paramValue = paramValue;
        this.valueType = valueType;
        this.onYes = onYes;
        this.onNo = onNo;
    }
    
    public boolean make(){
        return false;
    }
    
}
