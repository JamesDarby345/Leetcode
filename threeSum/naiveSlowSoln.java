package threeSum;

import java.util.ArrayList;
import java.util.List;

public class naiveSlowSoln {
  public List<List<Integer>> threeSum(int[] nums){
    List<List<Integer>> triplets = new ArrayList<List<Integer>>();
    for (int i = 0; i < nums.length; i++){
        for (int j = i+1; j < nums.length; j++){
            for (int k = j+1; k < nums.length; k++){
                if (i != k && i != j && j != k && nums[i] + nums[j] + nums[k] == 0){
                    ArrayList<Integer> newEl = new ArrayList<Integer>();
                    newEl.add(nums[i]);
                    newEl.add(nums[j]);
                    newEl.add(nums[k]);
                    boolean valid = true;
                    for (int f = 0; f < triplets.size(); f++){
                        int count = 0;
                        for (int t = 0; t < 3; t++){
                            if (triplets.get(f).contains(newEl.get(t))){
                                count++;
                            
                            }
                        }
                        if (count >= 3){
                            int zero = 0;
                            int newZ = 0;
                            
                            for (int t = 0; t < 3; t++){
                                if (newEl.get(t) == 0){
                                    newZ++;
                                }
                                if (triplets.get(f).get(t) == 0 && newEl.get(t) == 0){
                                    zero++;
                                }
                            }
                            if (newZ >= 3 && zero < 3){
                                
                            } else {
                                valid = false;
                                continue;
                            }
                            
                        }
                    }
                    if (valid){
                        triplets.add(newEl);
                    }
                }
            }
        }
    }
    return triplets;
    }

}
