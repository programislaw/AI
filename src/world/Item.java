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
public abstract class Item implements ItemInterface {
    
    protected Place place;
    protected ItemEnum itemEnum;

    public Item(Place place) {
        this.place = place;
    }

    public ItemEnum getItemEnum() {
        return itemEnum;
    }

    @Override
    public String toString() {
        return itemEnum.name();
    }

    public void action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
    
    
}
