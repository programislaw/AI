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
public class World {
    
    private List<List<Place>> world;
    
    private static int worldWidth = 10;
    private static int worldHeight = 10;
    
    private static World singleton;
    
    private World() {
        world = new ArrayList<>();
        for (int i = 0; i < worldWidth; i++) {
            List<Place> placeList = new ArrayList<>();
            world.add(placeList);
            for (int j = 0; j < worldHeight; j++) {
                Place place = new Place(i, j, null);
                placeList.add(place);
            }
        }
    }
    
    public static World get() {
        if (singleton == null) {
            singleton = new World();
        } 
        return singleton;
    }
    
    public static void print(World world) {
        for (int i = 0; i < worldWidth; i++) {
            List<Place> placeList = world.world.get(i);
            System.err.println("");
            for (int j = 0; j < worldHeight; j++) {
                Place place = placeList.get(j);
                if (place.getItem() != null) {
                    if (null != place.getItem().getItemEnum()) switch (place.getItem().getItemEnum()) {
                        case MAN:
                            System.err.print("O");
                            break;
                        default:
                            System.err.print(" ");
                            break;
                    }
                } else {
                    System.err.print("-");
                }
            }
        }
        System.err.println("");
    }

    public void setItem(int x, int y, Item item) {
        Place place = world.get(x).get(y);
        place.setItem(item);
    }



    Item getItem(int x, int y) throws WorldLimitatException {
        if (x <0 || y<0 || x>=worldWidth || y>=worldHeight) {
            throw new WorldLimitatException("WorldLimitatException");
        }
        Place place = world.get(x).get(y);
        return place.getItem();
    }

    Place getPlace(int x, int y) throws WorldLimitatException {
        if (x <0 || y<0 || x>=worldWidth || y>=worldHeight) {
            throw new WorldLimitatException("WorldLimitatException");
        }
        return world.get(x).get(y);
    }
}
