package First_Program.If_Else;

public class ternary {
    public static void main(String[] args) {
        int a =5;
        int result =0;
        // this is called ternary. and it reduced if else statement and long code.
        //it will first check a%2==0; now a =5 and if we divide 5 with 2 won't get 0.
        // and "?" means if its 0 then print first statement 10, else print 20.(? value: value)
        result =a%2==0 ? 10: 20;
        System.out.println(result);


        String[] names= {"ram", "abhi"};
        for (int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }

        for (String name : names) {
            System.out.println(name);

        }
    }
}

