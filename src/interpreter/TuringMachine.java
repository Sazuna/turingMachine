package interpreter;

public class TuringMachine {
	
	protected final int TAPE_SIZE = 100;
	
	protected int tape[] = new int[TAPE_SIZE];
	
	protected int position = TAPE_SIZE / 2;
}
