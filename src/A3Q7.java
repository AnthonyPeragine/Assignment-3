
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kw = new City();
        //create a robot
        RobotSE jet = new RobotSE(kw, 3, 3, Direction.SOUTH);

        //create the 4 squares
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.EAST);

        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 1, 5, Direction.EAST);

        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.EAST);

        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 5, 4, Direction.WEST);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 5, 5, Direction.EAST);

        //algorithm
        //first square
        for (int first = 0; first < 12; first++) {
            jet.move();
            if (jet.getStreet() == 6 && jet.getAvenue() == 3) {
                jet.turnLeft();
            }
            if (jet.getStreet() == 6 && jet.getAvenue() == 6) {
                jet.turnLeft();
            }
            if (jet.getStreet() == 3 && jet.getAvenue() == 6) {
                jet.turnLeft();
            }

        }
        //second square
        for (int second = 0; second < 12; second++) {
            jet.move();
            if (jet.getStreet() == 3 && jet.getAvenue() == 0) {
                jet.turnLeft();
            }
            if (jet.getStreet() == 6 && jet.getAvenue() == 0) {
                jet.turnLeft();
            }
            if (jet.getStreet() == 6 && jet.getAvenue() == 3) {
                jet.turnLeft();
            }
        }
        //third square
        for (int third = 0; third < 12; third++) {
            jet.move();
            if (jet.getStreet() == 0 && jet.getAvenue() == 3) {
                jet.turnLeft();
            }
            if (jet.getStreet() == 0 && jet.getAvenue() == 0) {
                jet.turnLeft();
            }
            if (jet.getStreet() == 3 && jet.getAvenue() == 0) {
                jet.turnLeft();
            }
        }
        //final square
        for (int fourth = 0; fourth < 12; fourth++) {
            jet.move();
            if (jet.getStreet() == 3 && jet.getAvenue() == 6) {
                jet.turnLeft();
            }
            if (jet.getStreet() == 0 && jet.getAvenue() == 6) {
                jet.turnLeft();
            }
            if (jet.getStreet() == 0 && jet.getAvenue() == 3) {
                jet.turnLeft();
            }
        }




    }
}
