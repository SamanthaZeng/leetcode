class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        Deque<Integer>windows = new LinkedList<Integer>();//store index of the array
        ArrayList<Integer> res = new ArrayList<Integer>();//store result of the array
        int j = 0;//first index of the sliding window;

        for(int i = 0;i < len; i++){
            if(i >= k && windows.peek() <= (i-k))
                windows.poll();
            while(windows.size()!=0&&nums[windows.peekLast()]<=nums[i])
                windows.pollLast();
            windows.offer(i);
            if(i>=k-1)
                res.add(nums[windows.peek()]);
        }
        
        int[] results = new int[res.size()];
        for(int i = 0; i < results.length; i++){
            results[i] = res.get(i).intValue();
        }
        return results;
    }
}
