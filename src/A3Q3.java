
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kw = new City();

        //create a robotSE
        RobotSE jet = new RobotSE(kw, 1, 1, Direction.EAST);

        //create the enclosed area
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);

        //place things
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 1);

        //cleanup algorithm
        while (true) {
            while (jet.frontIsClear() == true) {
                jet.move();
                if (jet.canPickThing()) {
                    jet.pickThing();
                }
            }
            if (!jet.frontIsClear() == true) {

                if (jet.getDirection() == Direction.EAST) {
                    jet.turnRight();
                    // move down next row
                    if (jet.frontIsClear() == true) {
                        jet.move();
                        jet.turnRight();
                        if (jet.canPickThing() == true) {
                            jet.pickThing();
                        }
                    } else {
                        break;
                    }


                } else if (jet.getDirection() == Direction.WEST) {
                    jet.turnLeft();
                    // move to next row
                    if (jet.frontIsClear() == true) {
                        jet.move();
                        jet.turnLeft();
                        if (jet.canPickThing() == true) {
                            jet.pickThing();
                        }
                    } else {
                        break;
                    }

                }


            }


        }

        while (!jet.frontIsClear() == true) {
            if (jet.getDirection() == Direction.SOUTH) {
                jet.turnRight();
            }
            while (jet.getAvenue() > 1) {
                jet.move();
                if (jet.getAvenue() == 1) {
                    jet.turnRight();
                }
            }
            while (jet.getStreet() > 1) {
                jet.move();
                if (jet.getStreet() == 1) {
                    jet.turnRight();
                    break;
                }
            }

        }
    }
}

