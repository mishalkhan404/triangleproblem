/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleproblem;

/**
 *
 * @author 4star
 */
public class Triangleproblem {

    
   static public String TriangleCheck(final int a,final int b,final int c) {
	       if ((a <= 0 || b <= 0 || c <= 0) || (a > 100 || b > 100 || c > 100))
	                return("invalid ");
	            else if (a >= (b + c) || c >= (b + a) || b >= (a + c))
	                return("Not a triangle");
	            
	            else if (a == b && b == c)
	                return("Equilateral");
	            else if ((a == b && b != c) || (a != b && c == a) || (c == b && c != a))
	               return("Isosceles");
	                else
	                return("Scalene");
	            //else if (a != b && b != c && c != a)
	   }
    
}
