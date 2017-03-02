
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kw = new City();
        kw.showThingCounts(true);
        //create a robot
        RobotSE jet = new RobotSE(kw, 0, 1, Direction.SOUTH);

        //places piles of things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);

        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);

        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);

        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);

        //algorithm
        while (true) {
            if (jet.countThingsInBackpack() == 0 && jet.getDirection() == Direction.SOUTH) {
                jet.move();
                if (jet.canPickThing()) {
                    jet.pickAllThings();
                    jet.turnLeft();
                }else{
                    break;
                }
            }

            while (jet.countThingsInBackpack() > 0) {
                jet.putThing();
                jet.move();
            }
            if (jet.getDirection() == Direction.EAST) {
                jet.turnAround();

            }
            while (jet.getStreet() > 0 && jet.getAvenue() > 1) {
                jet.move();
            }
            jet.turnLeft();
        }
    }
}
