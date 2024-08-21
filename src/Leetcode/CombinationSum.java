package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    private void recur(int index, int currSum, int target, int [] candidates, List<Integer> subList, List<List<Integer>> res){
        if(currSum == target){
            res.add(new ArrayList<>(subList));
            return;
        }
        if(currSum > target || index >= candidates.length){
            return;
        }
        subList.add(candidates[index]);
        recur(index, currSum + candidates[index], target, candidates, subList, res);
        subList.remove(subList.size()-1);
        recur(index+1, currSum , target, candidates, subList, res);
//        return
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        recur(0, 0,target, candidates, subList, res);
        return res;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        recur2(0, 0, target, candidates, subList, res);
        return res;
    }

    private void recur2(int i, int currSum, int target, int[] candidates, List<Integer> subList, List<List<Integer>> res) {

        if(currSum == target){
            res.add(new ArrayList<>(subList));
            return;
        }
        if(i >= candidates.length || currSum > target){
        return;
    }

    // take the element
    subList.add(candidates[i]);
    recur2(i+1, currSum + candidates[i], target, candidates, subList, res);
    subList.remove(subList.size()-1);
    // skip the element completely
        int skip = candidates[i];
    while(i < candidates.length && candidates[i] == skip) i++;

    recur2(i, currSum, target, candidates, subList, res);
    }
}
