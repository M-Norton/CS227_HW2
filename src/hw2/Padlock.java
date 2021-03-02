package hw2;
import java.util.Random;



/**
 * * A dial padlock.  Numbers on the dial 0 - 359.  0 at 12 o-clock.
 * The dial is directly attached to the first lock disk1 (front disk).
 * disk3 has a mechanical tooth directly behind 0 on the dial.
 * disk3 moves disk2(middle disk) with mechanical tooth.
 * disk2 moves disk1(back disk) with mechanical tooth.
 * 
 * Each disk has a notch "offset" at 'D' degrees from the tooth.
 * 
 * When all three disks current position is equal to its offset position, the lock 
 * Offset values are determined by the combination. (X,Y,Z).
 * 
 * A model of a typical combination lock with a rotating dial.
 * @author Matt Norton
 * 
 */
public class Padlock {
	/**
	 * The current position in degrees of the front disc (disc3).
	 */
	private int positionDisc3;
	
	/**
	 * The current position in degrees of the middle disc (disc2).
	 */
	private int positionDisc2;
	
	/**
	 * The current position in degrees of the back disc (disc1).
	 */
	private int positionDisc1;
	
	/**
	 *  The current status of the lock, true if open.
	 */
	private boolean isLockOpen;
	
	/**
	 * The width of the tooth on each disc, expressed in degrees of rotation.
	 */
	public static final int TOOTH = 2;
	
	
	/**
	 * Constructs a model of a combination lock with rotating dial, and the given combination.
	 * @param n1 The first number in the combo.
	 * @param n2 The second number in the combo.
	 * @param n3 The last number in the combo.
	 */
	Padlock (int n1, int n2, int n3) {
		isLockOpen = true;
		positionDisc3 = 0;
		positionDisc2 = TOOTH;
		positionDisc1 = 2 * TOOTH;
	}
	
	
	/**
	 * Closes the lock, regardless of whether the discs are aligned.
	 */
	public void close() {
		// TODO
	}
	
	
	/**
	 * Returns the current position of the given disc (1, 2, or 3).
	 * @param which disc position to be returned
	 * @return the position of the disc in degrees as an integer.
	 */
	public int getDiscPosition(int which) {
		// TODO
		return 0;
	}
	
	
	/**
	 * Returns true if the three discs are aligned in position for the lock to open.
	 * @return Returns true if the three discs are aligned in position for the lock to open.
	 */
	public boolean isAligned() {
		// TODO
		return false;
	}
	
	
	/**
	 * returns true if the lock is currently open.
	 * @return
	 */
	
	public boolean isOpen() {
		// TODO
		return false;
	}
	
	/**
	 * Opens the lock, if possible.
	 */
	public void open() {
		// TODO
	}
	
	
	/**
	 * Sets the disc positions to randomly generated, valid values
	 * @param rand // TODO
	 */
	public void randomizePositions(Random rand) {
		// TODO
	}

	
	/**
	 * Sets the disc positions to given values (as closely as possible)
	 */
	public void setPositions(int n1, int n2, int n3) {
		// TODO
	}
	
	
	/**
	 * Turns the dial the dial the given number of degrees, positive counterclockwise, negative clockwise.
	 * @param givenDegrees The given number of degrees to turn.  Positive counterclockwise, negative clockwise.
	 */
	public void turn(int givenDegrees) {
		// TODO
	}
	
	
	/**
	 * Turns the dial counter clock-wise until the given number is at the top.
	 * @param givenPosition The position that the dial will be turned to CCW.
	 */
	public void turnLeftTo(int givenPosition) {
		// TODO
	}
	
	
	/**
	 * Turns the dial clock-wise until the given number is at the top.
	 * @param givenPosition The position that the dial will be turned to CW.
	 */
	public void turnRightTo(int givenPosition) {
		// TODO
	}
	
}
