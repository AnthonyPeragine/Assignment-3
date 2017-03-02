
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kw = new City();
        //create a robot
        RobotSE jet = new RobotSE(kw, 2, 1, Direction.SOUTH);
        //create the box
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 0, Direction.NORTH);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.WEST);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 5, Direction.EAST);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 0, Direction.SOUTH);


        //algorithm
        //moves to initial wall
        while (jet.frontIsClear() == true) {
            jet.move();
        }
        int counter = 0;
        while (true) {

            //checks wall while moving north
            while (jet.getDirection() == Direction.NORTH && counter < 1) {


                if (jet.frontIsClear() == true) {
                    jet.turnRight();
                    if (jet.frontIsClear() == true) {
                        jet.move();
                        counter++;
                    }
                } else {
                    jet.turnLeft();
                    jet.move();
                }


            }
            //checks wall while moving south
            while (jet.getDirection() == Direction.SOUTH && counter < 1) {


                if (jet.frontIsClear() == true) {
                    jet.turnRight();
                    if (jet.frontIsClear() == true) {
                        jet.move();
                        counter++;
                    }
                } else {
                    jet.turnLeft();
                    jet.move();
                }


            }
            //checks wall while moving east
            while (jet.getDirection() == Direction.EAST && counter < 1) {


                if (jet.frontIsClear() == true) {
                    jet.turnRight();
                    if (jet.frontIsClear() == true) {
                        jet.move();
                        counter++;
                    }
                } else {
                    jet.turnLeft();
                    jet.move();
                }


            }
            //checks wall while moving west
            while (jet.getDirection() == Direction.WEST && counter < 1) {


                if (jet.frontIsClear() == true) {
                    jet.turnRight();
                    if (jet.frontIsClear() == true) {
                        jet.move();
                        counter++;
                    }
                } else {
                    jet.turnLeft();
                    jet.move();
                }


            }
        }
    }
}
