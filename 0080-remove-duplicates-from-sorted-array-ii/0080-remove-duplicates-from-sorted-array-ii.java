class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }
         int officer = 2 ;
    //  int unique = 1 ;
     int cm = 2;
     while(cm<nums.length){
        if(nums[cm]==nums[officer-2]){
            cm++;
            continue;
        }
        nums[officer] = nums[cm];
        officer++;
        //unique++;
        cm++;
     }
     return officer;

    }
}