package xxxxx;

import java.text.ParseException;
import world.Human;
import world.Man;
import world.World;


public class XXXXX {

    public static void main(String[] args) throws ParseException {
        XXXXX xxxxx = new XXXXX();
        xxxxx.init();
    }
    
    public void init() throws ParseException {

    System.out.println("Start");
    
    //System.out.println("Tworzę świat");
    World world = World.get();
    world.print(world);

    //System.out.println("Tworzę poprlacje");
    Human.getPopulation();
    world.print(world);

    //System.out.println("Uruchamiam Świat");
    for (int i = 0; i < 20; i++) {
        Human.getPopulation().run();
        world.print(world);
    }

    }
    
}
