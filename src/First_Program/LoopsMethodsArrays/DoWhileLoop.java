package First_Program.LoopsMethodsArrays;

public class DoWhileLoop {

    public static void main(String[] args) {
        int i=5;
        do {
            System.out.println("Hii " +i);
            i++;
        }while (i<5);
    }

}

/*
int i=5;
while(i<=1){
sout(i);
i++;

->here the value of i =5, and now condition will check i<=5; false so statement will not
execute. but in above if you use do while loop at-least the statement will execute once.i.e. "5"
 */

//The major difference between while and do=while is that while loop only executes if and
//only if your condition is true, otherwise your loop will not going to execute.
// but if you want your loop will execute once if the condition is false then use do-while.
// even if your condition is false but your loop will execute once.
// use case: lets suppose you are sending a message to your friend even he is offline,
//or not using the phone at the same time. here if you used while loop then your
// statement will not going to work because while loop only execute if certain condition
//is true at-least once then only it will execute. here if the condition is like if ur
// friend is online then will you will get a reply otherwise you will not.
//but if you used do-while loop here you will at-least get a reply like user is not available.
