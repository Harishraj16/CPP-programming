class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        if(k>n)k=n;
        for(int i=0;i<n;i+=k){
            int start = i;
            int end = Math.min(i+k-1,n-1);
            while(start<end){
                int temp = arr.get(start);
                arr.set(start,arr.get(end));
                arr.set(end,temp);
                start++;
                end--;
            }
        }
    }
}
