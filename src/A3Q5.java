
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
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
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kw = new City();
        kw.showThingCounts(true);
        //create a robot
        RobotSE jet = new RobotSE(kw, 1, 1, Direction.EAST);
        //place 10 things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);

        //algorithm
        int counter = 0;
        while (counter < 10) {
            if (jet.canPickThing() && jet.getDirection() == Direction.EAST) {
                jet.pickThing();
                jet.move();
                jet.putThing();
                jet.turnAround();
                counter++;
            } else {
                jet.move();
                jet.turnAround();
            }


        }
        jet.turnAround();

    }
}
