package Day_8.StackClone;
import java.util.*;
public class StackClone {
    public static void cloneStack(Stack<Integer>S, Stack<Integer>T){
        if(!S.isEmpty()){
            int temp=S.pop();
            cloneStack(S,T);
            S.push(temp);
            T.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer>S=new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        S.push(5);
        Stack<Integer>T=new Stack<>();
        cloneStack(S,T);
        System.out.println("Original Stack S: ");
        while(!S.isEmpty()){
            System.out.println(S.pop()+" ");
        }
        System.out.println("\nCloned stack T: ");
        while(!T.isEmpty()){
            System.out.println(T.pop() + " ");
        }
    }
}

