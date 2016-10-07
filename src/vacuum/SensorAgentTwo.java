package vacuum;

import java.util.Random;

/**
 * Created by Alex on 10/5/2016.
 */
public class SensorAgentTwo extends AbstractAgent{
    /**
     * Returns the agent's action in response to the dirtiness state of the
     * current square.
     */
    public int x = 6;
    public Action secondToLastAction;
    public Action lastAction;
    public static int open = 0;
    public static int noLEFT = 1;
    public static int noRIGHT = 2;
    public static int noUP = 3;
    public static int noDOWN = 4;
    public  Action react(boolean dirty) {
        if (dirty) {
            return Action.SUCK;
        }
        return chooseRandom();
    }
    public void sense_obstacle(boolean isObstacle) {
        if (isObstacle) {
            isObstacle = true;
        }
    }

    public Action chooseRandom() {
        Random num = new Random();
        int randInt = num.nextInt(4);
        switch (randInt) {
            case 0:
                secondToLastAction = lastAction;
                lastAction = Action.LEFT;
                return Action.LEFT;
            case 1:
                secondToLastAction = lastAction;
                lastAction = Action.UP;
                return Action.UP;
            case 2:
                secondToLastAction = lastAction;
                lastAction = Action.RIGHT;
                return Action.RIGHT;
            case 3:
                secondToLastAction = lastAction;
                lastAction = Action.DOWN;
                return Action.DOWN;
        }

        if(x==1) {
            num = new Random();
            randInt = num.nextInt(3);

            switch (randInt) {
                case 0:
                    secondToLastAction = lastAction;
                    lastAction = Action.DOWN;
                    return Action.DOWN;
                case 1:
                    secondToLastAction = lastAction;
                    lastAction = Action.UP;
                    return Action.UP;
                case 2:
                    secondToLastAction = lastAction;
                    lastAction = Action.RIGHT;
                    return Action.RIGHT;
            }
        }
        if(x==2) {
            num = new Random();
            randInt = num.nextInt(3);

            switch (randInt) {
                case 0:
                    secondToLastAction = lastAction;
                    lastAction = Action.LEFT;
                    return Action.LEFT;
                case 1:
                    secondToLastAction = lastAction;
                    lastAction = Action.UP;
                    return Action.UP;
                case 2:
                    secondToLastAction = lastAction;
                    lastAction = Action.DOWN;
                    return Action.DOWN;
            }
        }
        if(x==3) {
            num = new Random();
            randInt = num.nextInt(3);

            switch (randInt) {
                case 0:
                    secondToLastAction = lastAction;
                    lastAction = Action.LEFT;
                    return Action.LEFT;
                case 1:
                    secondToLastAction = lastAction;
                    lastAction = Action.DOWN;
                    return Action.DOWN;
                case 2:
                    secondToLastAction = lastAction;
                    lastAction = Action.RIGHT;
                    return Action.RIGHT;
            }
        }
        if(x==4) {
            num = new Random();
            randInt = num.nextInt(3);

            switch (randInt) {
                case 0:
                    secondToLastAction = lastAction;
                    lastAction = Action.LEFT;
                    return Action.LEFT;
                case 1:
                    secondToLastAction = lastAction;
                    lastAction = Action.UP;
                    return Action.UP;
                case 2:
                    secondToLastAction = lastAction;
                    lastAction = Action.RIGHT;
                    return Action.RIGHT;
            }
        }
        return Action.SUCK;
    }
}
