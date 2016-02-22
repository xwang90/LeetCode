public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result= new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        
        while(k<m+n)
        {
            if(i<m&&j<n&&nums1[i]>=nums2[j])
            {
                result[k]=nums2[j];
                j++;
                k++;
            }
            else if(i<m&&j<n&&nums1[i]<nums2[j])
            {
                result[k]=nums1[i];
                i++;
                k++;
            }
            else if(i==m&&j<n)
            {
                result[k]=nums2[j];
                j++;
                k++;
            }
            else if(j==n&&i<m)
            {
                result[k]=nums1[i];
                i++;
                k++;
            }
        }
        
        for(int h=0;h<m+n;h++)
        {
            nums1[h]=result[h];
        }
        
        
    }
}