/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author SAKHUMZI.NONTLANGA
 */
class Factorial {
     static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }  
	 
	  int factorial1(int n1)
	  {
	  
	    return (n1 == 1 || n1 == 0) ? 1 : n1 * factorial(n1 - 1);
	  
	  }
}
