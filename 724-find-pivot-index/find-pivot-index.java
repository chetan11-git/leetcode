class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int rightTotal = 0;
        for(int i =0 ; i < nums.length;i++){
            sum += nums[i];
        }
            int leftTotal = 0;
            for(int i = 0;i < nums.length;i++){
            rightTotal = sum -leftTotal - nums[i];
               if (leftTotal == rightTotal){
                return i;
               }
              leftTotal += nums[i];
            }
            return -1;
        } 
    } 