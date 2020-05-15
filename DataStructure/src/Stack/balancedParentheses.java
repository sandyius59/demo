/**********************************************************************
* @Execution : default node : cmd> balancedParentheses.jav
* 
* 
* @Purpose : to check parentheses balanced or not 
* 
* @description : Balanced parentheses means that each opening symbol has
* a corresponding closing symbol and the pairs of parentheses are properly
* nested
* 
* @overview :  
* @author : Sandeep kumar maurya  <sandeepkumarraj58@gmail.com>
* @version : 1.0
* @since : 27/03/2020
*
***********************************************************************/
package Stack;
//create class 
public class balancedParentheses 
{
	static class stack
	{
		int top = -1;
		char item[]=new char[100];
		
		void push(char x)
		{
			if(top == 99)
			{
				System.out.print("stack is full");
			}
			else
				item[++top]=x;
		}
		char pop()
		{
			if(top==-1)
			{
				System.out.println("stack underflows");
				return '\0';
			}
			else
			{
				char element =item[top];
				top--;
				return element;
			}
		}
		//to check is empty or not
		boolean isEmpty()
		{
			return (top ==-1) ? true :false;
		}
		static boolean isMatchingPair(char character1, char character2) 
			{ 
		       if (character1 == '(' && character2 == ')') 
		         return true; 
		       else if (character1 == '{' && character2 == '}') 
		         return true; 
		       else if (character1 == '[' && character2 == ']') 
		         return true; 
		       else
		         return false; 
		    }
		static boolean areParenthesisBalanced(char exp[]) 
	    { 
	       stack st=new stack(); 
	       for(int i=0;i<exp.length;i++) 
	       { 
	          if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') 
	            st.push(exp[i]); 
	          if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') 
	          { 
	             if (st.isEmpty()) 
	               { 
	                   return false; 
	               }  
	             else if ( !isMatchingPair(st.pop(), exp[i]) ) 
	               { 
	                   return false; 
	               } 
	          } 
	            
	       } 
	       if (st.isEmpty()) 
	           return true;
	        else
	           {   
	               return false; 
	           }
	    }
		//create main method and pass value 
		public static void main(String[] args)  
	    { 
	        char exp[] = {'{','(',')','}','[',']'}; 
	          if (areParenthesisBalanced(exp)) 
	            System.out.println("Balanced "); 
	          else
	            System.out.println("Not Balanced ");   
	    } 
		
		
	}
}