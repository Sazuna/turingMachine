package interpreter;

public class HeadPositionException extends Exception {
	public HeadPositionException()
	{
		super("Position of the head reached end of tape.");
	}
}
