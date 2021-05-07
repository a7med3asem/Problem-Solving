class One {
    public int[] twoSum(int[] nums, int target) {
        int result [] = new int [2];
        
        boolean done = false;
        
        for(int i = 0 ; i < nums.length - 1 ; i++) {
            for (int y = i+1 ; y < nums.length ; y++) {
                int sum = nums[y] + nums[i];
                
                if(sum == target) {
                    result[0] = i;
                    result[1] = y;
                                        
                    done = true;
                    break;
                }
            }
            
            if(done)
                break;
        }
        
        return result;
    }
}