package Day_10.SearchingQns;

public class IncrementalArraySearch {
    public static boolean searchElement(int arrayStartingElement, int x, int size, int target){
        int start=arrayStartingElement;
        int end=arrayStartingElement + (size -1 ) * x;
        while(start<=end){
            int mid = size + (end - start)/2;
            if(mid == target){
                return true;
            }else if(mid <target){
                start = mid + x;
            }else{
                end = mid - x;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arrayStartingElement=1;
        int x=2;
        int size=5;
        int target =9;
        boolean isPresent=searchElement(arrayStartingElement, x, size, target);
        if(isPresent){
            System.out.println("Target element is present in the array.");
        }else{
            System.out.println("Target element is not present in the array.");
        }
    }
}
