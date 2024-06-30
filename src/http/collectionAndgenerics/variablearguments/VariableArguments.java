package http.collectionAndgenerics.variablearguments;

public class VariableArguments {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
    }
    public static int sum(int...a){
        int sum=0;

   //just type array name like a.for and it will generate this type of array for you.

        for (int i : a) {
            sum+=i;

        }
        return sum;
    }

}
