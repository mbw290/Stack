import java.util.*;
import javax.swing.*;

public class mattStack
{

	public static void main(String[] args) 
	{
		Stack operandStack = new Stack(); //Declares new object from the class method from text
		String math=JOptionPane.showInputDialog(null,"Enter math expression: ");
		double num1;
		double num2;
		String thisToken;
		StringTokenizer tokens = new StringTokenizer(math);//This will tokenize the input math from user
		double result=0;
		while (tokens.hasMoreTokens())
		{	
			thisToken=tokens.nextToken();
			//First we will check if the input is a number, if so we push it to the stack
			if (!thisToken.equals("+") && !thisToken.equals("-") && !thisToken.equals("*") && !thisToken.equals("/"))
				{
				num1=Double.parseDouble(thisToken);
                operandStack.push(num1);
        		}
        		
        		//If the input is not a number, then it must be an operand which we will perform based on the last two elements
        		//which we will fetch (pop) from the stack
        		 else {
     
                num1 = operandStack.pop();
                num2 = operandStack.pop();
               
                    if (thisToken.equals("+"))
                    {
                    	result = num1 + num2;
                    }
                    
          
                    if (thisToken.equals("-"))
                    {
                    	result = num1 - num2;
                    }
                    
                    
                    if (thisToken.equals("*"))
                    {
                    	 result = num1 * num2;
                    }
                 
                  
                    if (thisToken.equals("/"))
                    {
                    	result = num1 / num2;
                    }
                    
                   
                     operandStack.push(result);
                     System.out.println(result);
                }
		}
	}
}

