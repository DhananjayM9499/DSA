package Assignment.third;
import java.util.Scanner;

class isPalindrome{
  public static boolean isPalindrome(String s, int i){
    if(i > s.length()/2)
    {
      return true ;
    }
 
    return s.charAt(i) == s.charAt(s.length()-i-1) && isPalindrome(s, i+1) ;
 
  }
 
  public static void main (String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the string to check : ");
    String str = scan.next();
    if (isPalindrome(str, 0))
    { System.out.println("True"); }
    else
    { System.out.println("False"); }
    scan.close();
 
  }
}