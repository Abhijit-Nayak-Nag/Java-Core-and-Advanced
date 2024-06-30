package Day_8.RottingOranges;
import java.util.*;
public class RottingOranges {
    static class Pair{
        int row,col;
        Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    public static int orangeRotting(int[][]grid){
        int rows= grid.length;
        int cols=grid[0].length;
        Queue<Pair> queue=new LinkedList<>();
        int freshOranges=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]==2){
                    queue.offer(new Pair(i,j));
                }else if(grid[i][j]==1){
                    freshOranges++;
                }
            }
        }
        int [][] direction ={{1,0},{-1,0},{0,1},{0,-1}};
        int minutes =0;
        while(!queue.isEmpty() && freshOranges>0){
            int size= queue.size();
            for(int i=0; i<size;i++){
                Pair current=queue.poll();
                for(int[]dir: direction){
                    int newRow=current.row + dir[0];
                    int newCol=current.col +dir[1];
                    if(newRow>=0 && newRow <rows && newCol>=0 && newCol<cols && grid[newRow][newCol]==1) {
                        grid[newRow][newCol]=2;
                        queue.offer(new Pair(newRow,newCol));
                        freshOranges--;
                    }
                }
            }
            minutes++;
        }
        return freshOranges ==0 ? minutes:-1;
    }

    public static void main(String[] args) {
        int[][] grid1={{2,1,1},{1,1,0},{0,1,1}};
        System.out.println("Minimum minutes required: " + orangeRotting(grid1));
        int[][] grid2={{2,1,1},{0,1,1},{1,0,1}};
        System.out.println("Minimum minutes required: " + orangeRotting(grid2));
        int [][] grid3={{0,2}};
        System.out.println("Minimum minutes required: " +orangeRotting(grid3));

    }
}
