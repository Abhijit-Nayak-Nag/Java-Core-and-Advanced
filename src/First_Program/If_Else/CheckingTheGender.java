package First_Program.If_Else;

public class CheckingTheGender {
    public static void main(String[] args) {
        boolean gender=true;
        String name= "Bob";
        System.out.println("before if");
        if(gender){
            System.out.println("mr." +name);
        }else{
            System.out.println("ms." +name);
            System.out.println("after if");
        }
    }


}

//if we make the gender =false then if statement will not gonna execute so else block will execute.
//        boolean gender=false;
//        String name= "Bob";
//        sout("before if");
//        if(gender){
//            System.out.println("mr." +name);
//        }else{
//            System.out.println("ms." +name);
//            System.out.println("after if");
//        }
//    }

//output: before if
//         ms. Bob
 //        after if

