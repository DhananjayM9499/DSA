package Assignment.fourth;

import java.util.Scanner;

public class FirstLetterCapital1  
{  
public static void main(String args[])   
{  
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string to capitalise");
	String str= scan.next();
   System.out.println("The capitalized string is : "+capitaFirstLetter(str));
   scan.close();
}  

public static final String capitaFirstLetter(String str)   
{  
if (str == null || str.length() == 0) return str;  
return str.substring(0, 1).toUpperCase() + str.substring(1);  
}  
}