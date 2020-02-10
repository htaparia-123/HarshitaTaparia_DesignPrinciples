import java.util.Scanner; 
import java.io.*;

class Driver
 {
   public static void main(String args[])
     {
	Scanner sc=new Scanner(System.in);
	char operator;
	double result;
	result=0.0;
	System.out.println(" \nEnter the operator(+,-,*,/):  ");
        operator= sc.next().charAt(0);
	Calculator c=new Calculator(15.2, 3.3);
	switch(operator)
	{
		case '+': result= c.add();
		break;

		case '-': result= c.subtract();
		break;

  		case '*': result= c.multiply();
		break;

		case '/': result= c.divide();
		break;

		default: System.out.println(" \nWrong choice");
	}
	
	System.out.println( "Result of "+ operator +" = "+ result);
	}
  }




