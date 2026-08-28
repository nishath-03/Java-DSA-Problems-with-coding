class Solution {
    public int findKthLargest(int[] nums, int k) {
        int length = nums.length;
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int index=0;
        for(int i:nums){
            maxHeap.offer(i);           
        }
        for(int i=0;i<k-1;i++){
            maxHeap.poll();
        }
        return maxHeap.peek();
    }
}