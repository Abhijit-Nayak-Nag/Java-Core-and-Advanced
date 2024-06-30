package Day_10.SearchingQns;

public class EmergencyResponseSystem {
    public static int findNearestIncident(long[] timestamps, long targetTime){
        if(timestamps==null || timestamps.length==0){
            return -1;
        }
        int low=0;
        int high = timestamps.length -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(timestamps[mid]==targetTime){
                return mid;
            }else if(timestamps[mid]<targetTime){
                low=mid+1;
            }else{
                high =mid -1;
            }
        }
        if(low==0){
            return 0;
        }else if(low==timestamps.length){
            return timestamps.length -1;
        }else{
            long beforeDiff= targetTime - timestamps[low-1];
            long afterDiff=timestamps[low]-targetTime;
            return beforeDiff<=afterDiff ? low -1 : low;
        }
    }

    public static void main(String[] args) {
        long[]timestamps={100,200,300,400,500};
        long targetTime=250;
        int nearestIndex=findNearestIncident(timestamps,targetTime);
        System.out.println("Nearest incident index: " + nearestIndex);
        System.out.println("Nearest incident timestamp: " + timestamps[nearestIndex]);
    }
}
