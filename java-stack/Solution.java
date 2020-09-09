//Problem: https://www.hackerrank.com/challenges/java-stack/problem

import java.util.*;

class Solution{
	
	public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(balanced(input));
        } 
    }
    static boolean balanced(String input)
    {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i<input.length(); i++){
            String a=input.substring(i,i+1);
            if (a.equals("(") || a.equals(("[")) || a.equals(("{"))){
                stack.push(a);
            }
            else if (stack.empty()){
                return false;
            }
            else{
                String b = stack.pop();
                if((b.equals("(") && !a.equals(")")) || (b.equals("{") && !a.equals("}")) || (b.equals("[") && !a.equals("]"))){
                    return false;
                }
            }
        }
        return stack.empty(); 
    }
}