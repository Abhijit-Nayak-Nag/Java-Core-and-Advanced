package DSA_Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Package {
    int weight;
    String sender;
    public Package(int weight, String sender){
        this.weight=weight;
        this.sender=sender;
    }
}
public class Problem3{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int N= sc.nextInt();
        Stack<Package> stack=new Stack<>();
        List<String> result=new ArrayList<>();
        int minweight =Integer.MAX_VALUE;
        for(int i=0; i<N;  i++){
        int actions = sc.nextInt();
        if(actions==-1){
            int packagesRemoved=0;
            while(!stack.empty()){
                Package pack=stack.pop();
                packagesRemoved++;
                if(pack.weight<minweight){
                    minweight=pack.weight;
                    result.add(pack.sender);
                }
            }
            result.add((packagesRemoved - 1) +" " +result.remove(result.size()-1));
            minweight=Integer.MAX_VALUE;

        }else{
            int weight=actions;
            String sender =sc.nextLine();
            Package pack=new Package(weight,sender);
            stack.push(pack);
        }
    }
    for (String entry:result){
        System.out.println(entry);
     }

   }
}
