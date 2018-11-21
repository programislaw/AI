/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bak
 */
public class Human {
    
    private static List<Man> manList;
    private static Human population;

    private Human() {
    }

    public static Human getPopulation() {
        if(population == null) {
            try {
                population = new Human();
                manList = new ArrayList<>();
                
                manList.add(addMan(5,5));
                manList.add(addMan(5,4));
                manList.add(addMan(4,5));
                manList.add(addMan(4,4));
            } catch (WorldLimitatException ex) {
                System.err.println("OK");
            }
        }
        return population;
    }
    
    private static Man addMan(int x, int y) throws WorldLimitatException {
        Place place = World.get().getPlace(x, y);
        Man man = new Man(place);
        World.get().setItem(x, y, man);
        return man;
    }

    public void run() {
        for (Man man : manList) {
            man.action();
        }
    }
}
