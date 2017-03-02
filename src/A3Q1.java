
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kw = new City();

        //create a robot
        Robot jet = new Robot(kw, 1, 1, Direction.EAST);

        //Create walls 
        new Wall(kw, 1, 5, Direction.WEST);
        //Create things
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 3);

        //Algorithm to make the robot stop at a thing OR a wall
        while (!jet.canPickThing() == true && jet.frontIsClear() == true) {
            jet.move();
        }
    }
}
