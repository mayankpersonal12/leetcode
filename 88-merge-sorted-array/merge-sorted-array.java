class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1=0;
        for(int i=m;i<(m+n);i++)
        {
            if(n1<n){
            nums1[i]=nums2[n1];
            n1++;
            }
        }
        Arrays.sort(nums1);
    }
}