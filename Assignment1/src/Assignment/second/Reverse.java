package Assignment.second;

import java.util.Scanner;

class Reverse
{
   
    public static String reverse(String str)
    {
      
        if (str == null || str.equals("")) {
            return str;
        }
 
        
      
 
        char[] temp = new char[str.length()];
 
       
        for (int i = 0; i < str.length(); i++) {
            temp[str.length() - i - 1] = str.charAt(i);
        }
 
        
        return String.copyValueOf(temp);
    }
 
    public static void main(String[] args)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the the string you want to reverse ");
    	
        String str = scan.next();
 
        System.out.println("The original string is " + str);
        str = reverse(str);
 
        System.out.println("The reversed string is " + str);
        scan.close();
    }
}
