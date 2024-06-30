package Day_8.ExpressionComparison;
import java.util.*;
public class ExpressionComparison {
    public static String areSimilarExpressions(String exp1, String exp2) {
        exp1 = exp1.replaceAll("\\s", "");
        exp2 = exp2.replaceAll("\\s", "");
        exp1 = exp1.replaceAll("-", "(-1)*");
        exp1 = exp1.replaceAll("-", "(-1)*");

        long result1 = evaluateExpression(exp1);
        long result2 = evaluateExpression(exp2);
        if (result1 == result2) {
            return "Yes";
        } else {
            return "No";
        }
    }
    private static long evaluateExpression(String expression) {
        Stack<Long> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        long operand = 0;
        long result = 0;
        int sign = 1;
        for (char ch : expression.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                operand = ch - 'a' + 1;
                result += sign * operand;
            } else if (ch == '(') {
                    operatorStack.push(ch);
                }else if (ch == ')') {
                    operatorStack.pop();
                } else if (ch == '+') {
                    sign = 1;

                } else if (ch == '*') {
                    sign = -1;
                }

            }
            return result;
        }
        public static void main (String[]args){
            String exp1 = "(a+b+c)*";
            String exp2 = "-a-b-c";
            System.out.println("Output: " + areSimilarExpressions(exp1, exp2));
            exp1 = "(c+l+a)";
            exp2 = "c-b-a";
            System.out.println("Output: " + areSimilarExpressions(exp1, exp2));
            exp1 = "a-b(c-d)";
            exp2 = "a-b-c-d";
            System.out.println("Output: " + areSimilarExpressions(exp1, exp2));
        }
    }


