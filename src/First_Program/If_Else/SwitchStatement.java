package First_Program.If_Else;

public class SwitchStatement {
    public static void main(String[] args) {
        int n=7;
        switch (n){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");

        }

    }
}
//Output : Sunday
/*
int n=3;
        switch (n){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");

        }

   --here we are expecting wednesday, but we got all the value from wednesday to sunday.
   The moment your switch case matches with case e.g. it will check is it matching
   with 1, No..... and it will not execute this block...is it matching with 2 no...
   it will again execute the second block and again check is it matching with case 3 :yes
   n=3 and its matching case 3 : the moment it matches with case it will execute the block
   for sure and it will also complete the entire switch statement.....i.e
   wednesday, Thursday, friday, saturday, sunday.
   *--for solving the issue what can we say that hey once you match the case then just
   come out of the switch block. and the way we can do it by using special keyword called
   "break".

   if none of value is matched you can use default key at the end to print...
   default: sout("Enter a valid number");



   int n=3;
        switch (n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }

 output : Wednesday




 int n=8;
        switch (n){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
             default:
             System.out.println("Enter the valid Number");

        };

 */