import java.util.Stack;

public class Reversepolish {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int sub2 = stack.pop();
                    int sub1 = stack.pop();
                    stack.push(sub1 - sub2);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int div2 = stack.pop();
                    int div1 = stack.pop();
                    stack.push(div1 / div2);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    // Main method to test the code in VS Code
    public static void main(String[] args) {
        Reversepolish sol = new Reversepolish();
        
        // Sample input
        String[] tokens = {"2", "1", "+", "3", "*"}; // (2 + 1) * 3 = 9
        int result = sol.evalRPN(tokens);

        System.out.println("Result: " + result); // Output should be 9
    }
}
