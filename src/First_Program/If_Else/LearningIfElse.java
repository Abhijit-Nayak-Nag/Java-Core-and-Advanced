package First_Program.If_Else;

public class LearningIfElse {
    public static void main(String[] args) {
        boolean isMale= true;
        String name= "Bob";
        System.out.println("Before if");
        //if isMale ==True then if block will execute. otherwise not.
        //if only execute if the statement is true. if(true) {block execute} else not.
        if (isMale){
            System.out.println("Mr " + name);
        }
        System.out.println("after if");

    }
}

//boolean isMale= false;
//        String name= "Bob";
//        System.out.println("Before if");
//here if block will not execute because the variable i.e. isMale that contains false
//        if (isMale){
//            System.out.println("Mr " + name);
//        }
//        System.out.println("after if");


//output: before if
//        after if
// the statement inside if block will not going to execute. because the variable we are calling inside the if block that contains false statement.