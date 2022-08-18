//**************************************************************
// ParenMatch.java
//
// Determines whether or not a string of characters contains
// matching left and right parentheses.
//**************************************************************

import java.util.*;
import java.util.Scanner;

public class ParenMatch {
	public static void main(String[] args) {
		Stack s = new Stack();
		String line; // the string of characters to be checked
		Scanner scan = new Scanner(System.in);

		System.out.println("\nParenthesis Matching");
		System.out.print("Enter a parenthesized expression: ");
		line = scan.nextLine();

		boolean ok = true;// this sets the default boolean for the error check to true

		for (int i = 0; i < line.length() & ok; i++) // loop is in place to continue so long as variable i remains less
														// than the length AND boolean ok remains true
		{
			String character = line.substring(i, i + 1); // initializes String character and sets the value to the character with the
													// index of i

			if (character.equals("(")) // if the value of String character = ( then push the ( onto the stack
				s.push(character);
			
			else if (character.equals(")")) // else if the value of String character = ) then pop the ( from the stack
				
				if (s.empty()) // if the stack has no ( to pop then it returns a message and then changes the
							   // boolean ok to false in order to bypass the loop
							   //Also, the displays where your extra parentheses is and all of the characters that preceed
				{
					System.out.println("Extra right parenthesis");
					System.out.println(line.substring(0, i + 1));
					ok = false;
					
				}
				
				else // otherwise if the stack is not empty then it will pop the top value on the
						// stack
					s.pop();
		}

		if (ok) // if ok was never changed to false
			if (s.empty()) // if the stack is empty, then a message will display saying that the expression
						   // had equal parentheses
				System.out.println("Parentheses Match");
			else // otherwise, if the stack is not empty, then a message will display that there
				 // are more right parentheses than left parentheses
				System.out.println("More left parentheses than right");
	}
}
