package interpreter;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Interpreter extends TuringMachine {

	
	/*
	public String appel(Stack<String> next)
	{
		String instruction = next.pop();
		while (instruction.startsWith("%"))
		{
			instruction = next.pop();
		}
		
		switch(instruction)
		{
			case "G":
		}
			
	}*/
	public void call(String[] currentLine, Stack<String> nextLines)
	{
		/*
		String currentLine = nextLines[0];
		String [] mots = currentLine.split(" ");
		System.out.println(instruction);
		System.out.println(mots[0]);
		return instruction;*/
		if (currentLine.length == 0)
		{
			currentLine = nextLines.pop().split(" ");
			//nextLines.remove(0);
		}

		String word = currentLine[0];
		switch(word)
		{
		case "G":
			try {
				gauche(currentLine, nextLines);
			} catch (HeadPositionException e) {
				e.printStackTrace();
			}
		case "D":
			try {
				droite(currentLine, nextLines);
			} catch (HeadPositionException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void gauche(String[] currentLine, Stack<String> nextLines) throws HeadPositionException
	{
		this.position --;
		if (position < 0)
		{
			throw new HeadPositionException();
		}
		call(currentLine, nextLines);
	}
	public void droite(String[] currentLine, Stack<String> nextLines) throws HeadPositionException
	{
		this.position ++;
		if (position >= TAPE_SIZE)
		{
			throw new HeadPositionException();
		}
		call(currentLine, nextLines);
	}
	
	public Stack<String> load(String file)
		
		String text = new Scanner(getClass().getClassLoader().getResourceAsStream(file), "UTF-8").useDelimiter("\\A").next();

		return null;
	}
	
	
	public String gauche(String next)
	{
		return next;
	}
	
	public static void main(String[] args)
	{
		Interpreter i = new Interpreter();
		i.load("01.1.TS");
		//i.call("G 1 G 1 G 0 G 1\n%\nboucle");
	}
}
