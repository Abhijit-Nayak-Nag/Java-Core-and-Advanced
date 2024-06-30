package Day_7.UniqueSubsets;
import java.util.*;

public class UniqueSubsets {
    public List<List<Integer>>subsetsWithUniqueElements(int[] nums)

    {
        Set<List<Integer>> subsets = new HashSet<>();
        Arrays.sort(nums);
        backtrack(0, nums, new ArrayList<>(), subsets);
        return new ArrayList<>(subsets);
    }
    private void backtrack(int start,int[] nums,List<Integer>path,Set<List<Integer>>subsets)
    {
        subsets.add(new ArrayList<>(path));
        for(int i = start; i<nums.length; i++){
            if(i>start && nums[i]==nums[i-1])continue;
            path.add(nums[i]);
            backtrack(i+1,nums,path, subsets);
            path.remove(path.size()-1);
        }
}

    public static void main(String[] args) {
        UniqueSubsets uniqueSubsets= new UniqueSubsets();
        int[] inputArray={1,2,2};
        List<List<Integer>>output=uniqueSubsets.subsetsWithUniqueElements(inputArray);
        System.out.println(output);
    }


}
