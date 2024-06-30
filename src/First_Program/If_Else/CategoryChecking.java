package First_Program.If_Else;

public class CategoryChecking {
    public static void main(String[] args) {
        boolean isSeniorCitiz= true;
        boolean isAnAdult= false;
        if(isSeniorCitiz) {
            System.out.println("Hello Senior Citizen");
        }else{
            if(isAnAdult){
                System.out.println("Hello Adult");
            }else{
                System.out.println("Hello Child");
            }
        }
    }
}


//   boolean isSeniorCitiz= false;
//   boolean isAnAdult= false;
//        if(isSeniorCitiz) {
//        System.out.println("Hello Senior Citizen");
//        }else{
//                if(isAnAdult){
//                     System.out.println("Hello Adult");
//                }else{
//                    System.out.println("Hello Child");
//            }
//                    }
//                    }

//output: Hello Child because both the if statement false. so else code block will run.


//   boolean isSeniorCitiz= false;
//   boolean isAnAdult= true;
//        if(isSeniorCitiz) {
//        System.out.println("Hello Senior Citizen");
//        }else{
//               if(isAnAdult){
//                    System.out.println("Hello Adult");
//            }else{
//                    System.out.println("Hello Child");
//            }
//                    }
//                    }

//output: Hello Adult (because one the second if thats true so it will execute)


//   boolean isSeniorCitiz= true;
//   boolean isAnAdult= true;
//        if(isSeniorCitiz) {
//           System.out.println("Hello Senior Citizen");
//        }else{
//               if(isAnAdult){
//                    System.out.println("Hello Adult");
//               }else{
//                    System.out.println("Hello Child");
//            }
//                    }
//                    }

//output: if both are true then first statement always execute and it will not check any other statement.