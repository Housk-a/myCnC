//package vacuum;

//import java.util.Random;

/** An agent for the vacuum world.
public class ReflexAgent extends AbstractAgent{
	/**
	 * Returns the agent's action in response to the dirtiness state of the
	 * current square.

    public  Action react(boolean dirty) {
	if (dirty) {
	    return Action.SUCK;
	}
	return chooseRandom();
    }

    public Action chooseRandom(){
		Random num = new Random();
		int randInt = num.nextInt(4);

		switch(randInt) {
			case 0:
				return Action.LEFT;
			case 1:
				return Action.UP;
			case 2:
				return Action.RIGHT;
			case 3:
				return Action.DOWN;
		}
		return Action.LEFT;
	}
}
*/
