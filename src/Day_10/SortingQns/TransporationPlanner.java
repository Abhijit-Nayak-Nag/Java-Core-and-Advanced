package Day_10.SortingQns;

import java.util.Arrays;

public class TransporationPlanner {
    public static void main(String[] args) {
        int[][] costMatrix={{2,3,4},{5,6,7},{8,9,10}};
        int[]factoryProduction={100,150,200};
        int[]storeDemand={80,120,150};
        TransporationPlan plan=findOptimalTransportationPlan(costMatrix, factoryProduction, storeDemand);
        System.out.println("Total Minimum cost: " +plan.totalCost);
        System.out.println("Transporation plan: ");
        for(int i=0; i<plan.transporation.length; i++){
            System.out.println("Factory" +(i+1) +":");
            for(int j=0; j<plan.transporation[i].length; j++) {
                System.out.println(" Store " + (j + 1) + ":" + plan.transporation[i][j] + "units");
            }

            }
        }
        public static TransporationPlan findOptimalTransportationPlan (int[][]costMatrix, int[]factoryProduction, int[]storeDemand){
        int numFactories= costMatrix.length;
        int numStores= costMatrix[0].length;
        for(int i=0; i< numFactories; i++){
            int minCost= Arrays.stream(costMatrix[i]).min().getAsInt();
            for(int j=0; j<numStores; j++){
                costMatrix[i][j]-=minCost;
            }
        }
        int[]factoryAssignment=new int [numFactories];
        int[]storesAssignments=new int[numStores];
        Arrays.fill(factoryAssignment, -1);
        Arrays.fill(storesAssignments, -1);
        boolean [] factoryVisited=new boolean[numFactories];
        boolean [] storeVisited=new boolean[numStores];
        for (int i=0; i<numFactories; i++){
            if(factoryAssignment[i]==-1) {
                Arrays.fill(factoryVisited, false);
                Arrays.fill(storeVisited, false);
                findAssignment(i, costMatrix, factoryAssignment, storesAssignments, factoryVisited, storeVisited);
            }
        }
        int totalCost= 0;
        int [][] transporation= new int [numFactories][numStores];
        for(int i =0; i<numFactories; i++){
            if(factoryAssignment[i]!=-1){
                int j= factoryAssignment[i];
                totalCost+=costMatrix[i][j];
                transporation[i][j]=Math.min(factoryProduction[i],storeDemand[j]);
            }
        }
        return new TransporationPlan(totalCost,transporation);
    }
    private static boolean findAssignment(int factory, int [][] costMatrix,int[] factoryAssignment,int[]storeAssignment,boolean[] factoryVisited, boolean[]storeVisited){
        int numScores=costMatrix[0].length;
        factoryVisited[factory]=true;
        for(int j=0; j<numScores; j++){
            if(!storeVisited[j] && costMatrix[factory][j]==0){
                storeVisited[j]=true;
                if(storeAssignment[j]==-1 || findAssignment(storeAssignment[j],costMatrix, factoryAssignment,storeAssignment,factoryVisited,storeVisited)){
                    factoryAssignment[factory]=j;
                    storeAssignment[j]=factory;
                    return true;
                }
            }
        }
        return false;
    }
    static class TransporationPlan{
        int totalCost;
        int[][] transporation;
        public TransporationPlan(int totalCost,int[][]transporation){
            this.totalCost=totalCost;
            this.transporation=transporation;
        }
    }
}
