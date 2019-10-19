package stackdemo;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        int choice = 0;
              for (int i = 1; i < 5; i++)
            Iterator it1 = stack.listIterator();

             stack.push((" plate: " + i));
            stack.push("plate1");
            stack.push("plate2");
            stack.push("plate3");
            Iterator it = stack.listIterator();
            while (it.hasNext()) {

                System.out.println(stack.pop());
                System.out.println(stack.pop());
            }
        }
    }
}
