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
    public static int open = 0;
    public static int noLEFT = 1;
    public static int noRIGHT = 2;
    public static int noUP = 3;
    public static int noDOWN = 4;
    Random choice = new Random();
    int randChoice = choice.nextInt(5);
    public  Action react(boolean dirty) {
        if (dirty) {
            return Action.SUCK;
        }
        return chooseRandom();
    }

    public Action chooseRandom() {
        Random num = new Random();
        int randInt = num.nextInt(4);
        int x = 6;
        switch (randInt) {
            case 0:
                return Action.LEFT;
            case 1:
                return Action.UP;
            case 2:
                return Action.RIGHT;
            case 3:
                return Action.DOWN;
        }

        if(x==1) {
            num = new Random();
            randInt = num.nextInt(3);

            switch (randInt) {
                case 0:
                    return Action.DOWN;
                case 1:
                    return Action.UP;
                case 2:
                    return Action.RIGHT;
            }
        }
        if(x==2) {
            num = new Random();
            randInt = num.nextInt(3);

            switch (randInt) {
                case 0:
                    return Action.LEFT;
                case 1:
                    return Action.UP;
                case 2:
                    return Action.DOWN;
            }
        }
        if(x==3) {
            num = new Random();
            randInt = num.nextInt(3);

            switch (randInt) {
                case 0:
                    return Action.LEFT;
                case 1:
                    return Action.DOWN;
                case 2:
                    return Action.RIGHT;
            }
        }
        if(x==4) {
            num = new Random();
            randInt = num.nextInt(3);

            switch (randInt) {
                case 0:
                    return Action.LEFT;
                case 1:
                    return Action.UP;
                case 2:
                    return Action.RIGHT;
            }
        }
        return Action.LEFT;
    }
}
