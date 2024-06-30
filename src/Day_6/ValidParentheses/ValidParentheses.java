package Day_6.ValidParentheses;
public class ValidParentheses {
    public static boolean isValid(String s) {
        int balance = 0;
        for (char ch : s.toCharArray()) {
            if(ch=='('){
                balance++;
            }else if (ch==')')
            {
                balance--;
                if (balance<0) {
                    return false;
                }
                }
            }
        return balance==0;

        }

    public static void main(String[] args) {
        String str1= "()";
        String str2=")(";
        String str3 ="()(";
        System.out.println("is \"" +str1 +"\" valid?" +" " +isValid(str1));
        System.out.println("is \"" +str2 + "\" valid?" + " "+ isValid(str2));
        System.out.println("is \"" +str3 + "\" valid?" + " "+ isValid(str3));
    }
    }
