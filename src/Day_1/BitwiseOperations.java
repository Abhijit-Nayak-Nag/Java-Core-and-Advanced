package Day_1;

public class BitwiseOperations {

        public static int bitwiseAnd (int num1, int num2){
            return num1 & num2;
        }
        public static int bitwiseOR(int num1, int num2) {
            return num1 | num2;
        }
            public static int bitwiseNOT(int num) {
                return ~num;
            }
                public static void main(String[] args){
                    int num1 = 10;
                    int num2=6;
                    int resultAnd = bitwiseAnd(num1, num2);
                    System.out.println("Bitwise ANd of " +num1 + "and" +num2 + "is:" +resultAnd);
                    int resultOR = bitwiseOR(num1, num2);
                    System.out.println("Bitwise OR of " +num1 +"OR" +num2 + "is:" +resultOR);
                    int resultNot= bitwiseNOT(num1);
                    System.out.println("Bitwise NOT of" +num1 + "is:"  +resultNot);
                }
    }
