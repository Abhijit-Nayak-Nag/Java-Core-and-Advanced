package Day_7.ContinuousGrowth;


import java.util.ArrayList;

public class ContinuousGrowth {
    public static int longestContinuousGrowth(ArrayList<Integer>users){
        int longestPeriod=0;
        int currentPeriod=1;
        for(int i=1;i<users.size();i++){
            if (users.get(i)>users.get(i-1)){
                currentPeriod++;
            }else{
                longestPeriod=Math.max(longestPeriod,currentPeriod);
                currentPeriod=1;
            }
        }
        longestPeriod=Math.max(longestPeriod,currentPeriod);
        return longestPeriod;
    }

    public static void main(String[] args) {
        ArrayList<Integer>users=new ArrayList<>();
        users.add(100);
        users.add(120);
        users.add(130);
        users.add(110);
        users.add(150);
        users.add(160);
        users.add(170);
        users.add(180);
        users.add(190);
        users.add(200);
        users.add(210);
        users.add(205);
        users.add(220);
        int longestPeriod=longestContinuousGrowth(users);
        System.out.println("Longest period of continuous growth: " +longestPeriod + " days");

    }
}
