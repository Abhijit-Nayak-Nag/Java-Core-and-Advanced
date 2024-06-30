package First_Program.Operators;

public class UnaryOperator {
    public static void main(String[] args) {
        int x=5;
        int y=-x;
        //if we declare another variable int z =-y; and we print z then output we get 5 because(-5-(-5))=5
        System.out.println(y);

        //Normal Operator:
        int a =5;
        a= a+1;
        System.out.println(a);
        //Shorthand Operator:
        int a1 =5;
        a1+=1;
        System.out.println(a1);
        //Unary Operator:
        int a2= 7;
        //a2++ post increment:
        a2++;
        System.out.println(a2);
        //++a2 pre increment:
        System.out.println(++a2);
        // --q pre decrement and q-- post decrement:
        int q=9;
        q--;
        System.out.println(q);
        System.out.println(--q);

        //Post increment
        int p=9;
        p++;
        System.out.println(p);
        //output :10

        //Pre increment
        q=10;
        ++q;
        System.out.println(q);
        //output : 10

        //if we store the value in the variable then these two unary operator works differently.
//       post increment
//        int p=9;
//        int result = ++p;
//        System.out.println(p);
//        //output :10 ; because it first increments the value i.e. 9+1=10 and then fetch the variable.
//        //Pre increment
//        ++p;
//        System.out.println(p);
//        output : 9 -because it first stores the variable p =9 to the variable i.e. result and thats it the value remains same.

    }
}

// post increment and pre increment works same if they perform individually if you try to
// fetch the  value from them while performing the operation then they behave different.