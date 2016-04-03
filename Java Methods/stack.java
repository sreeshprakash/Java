import java.util.*;
class Solution{
   public static void main(String []argh){
      Scanner sc = new Scanner(System.in);
      boolean found = false;

    while (sc.hasNextLine()) {
        Stack myStack = new Stack();
        String input=sc.nextLine();
        //Complete the code
        int len = input.length();
        String c = "x";
        for (int i = 0; i < len; i++){
            found = false;
            c = input.substring(i, i + 1);
            if (!myStack.empty()){
                if ((c.equals(")"))&&(myStack.peek().equals("("))){
                    myStack.pop();
                    found = true;
                }

                if ((c.equals("]"))&&(myStack.peek().equals("["))){
                    myStack.pop();
                    found = true;
                }

                if ((c.equals("}"))&&(myStack.peek().equals("{"))){
                    myStack.pop();
                    found = true;
                }

                if (!found){
                    myStack.push(c);}
            } else{
                myStack.push(c);}       
        }

        if (myStack.empty()){System.out.println("true");
        }else{System.out.println("false");}
    }

   }
}