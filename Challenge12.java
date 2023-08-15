package DPC;
 import java.util.Deque;   
    import java.util.LinkedList;   
    import java.util.Scanner;   
public class Challenge12 {  
        public static void main(String[] args)   
        {   
            String inputStr;   
            Deque<Character> deque = new LinkedList<>();   
            Scanner sc = new Scanner(System.in);    
            System.out.print("Enter an expression to check whether it is balanced or not: \n");   
            inputStr = sc.nextLine();    
            sc.close();     
            for(char ch : inputStr.toCharArray()) {   
                // add element to deque if ch = '{', ch = '[', or ch = '('   
                if(ch == '{' || ch == '[' || ch == '(') {   
                    deque.add(ch);   
                } else {   
                    // if deque is not empty   
                    if(! deque.isEmpty()) {   
                        if((deque.peekFirst() == '{' && ch == '}')   
                           || (deque.peekFirst() == '[' && ch == ']')   
                           || (deque.peekFirst() == '(' && ch == ')')) {   
                               deque.removeFirst();   
                           }   
                    }else {   
                        System.out.println("\nUnbalanced Parenthesis.");   
                    }   
                }   
            }   
            System.out.println("\nBalanced Parenthesis.");   
        }   
    }   
