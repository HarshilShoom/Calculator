package Harshil.Calculator;

import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> menu = new ArrayList<String>() {{
		add("0. Exit");
		add("1. Add");
		add("2. Subtract");
		add("3. Multiply");
		add("4. Divide");
	}};
	
	static void Print(String str) {
    	System.out.print(str);
    }
    
    static void Println(String str) {
    	System.out.println(str);
    }
    
    static int GetNumber1() {
    	Print("Enter number 1 : ");
    	return sc.nextInt();
    }
    
    static int GetNumber2() {
    	Print("Enter number 2 : ");
    	return sc.nextInt();
    }
	
    public static void main( String[] args )
    {	
    	boolean isExit = false;
    	
        do {
        	for(String item : menu) {
        		Println(item);
        	}
        	Print("Enter the operation number you want to perform : ");
        	switch(sc.nextInt()){
        		case 0:
        			isExit = true;
        			break;
        		case 1:
        			Println("Ans = " + Calculator.Add(GetNumber1(), GetNumber2()));
        			break;
        		case 2:
        			Println("Ans = " + Calculator.Subtract(GetNumber1(), GetNumber2()));
        			break;
        		case 3:
        			Println("Ans = " + Calculator.Multiply(GetNumber1(), GetNumber2()));
        			break;
        		case 4:
        			Println("Ans = " + Calculator.Divide(GetNumber1(), GetNumber2()));
        			break;
        		default:
        			Println("Wrong Input please try again");
        			break;
        	}
        }
        while(!isExit);
    }
    
}
