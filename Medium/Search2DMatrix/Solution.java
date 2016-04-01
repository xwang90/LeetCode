public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowNum=matrix.length;
        if(rowNum==0) return false;
        
        int colNum=matrix[0].length;
        
        int left=0;
        int right=rowNum*colNum-1;
        int mid;
        
        while(left<=right)
        {
            mid=left+(right-left)/2;
            int row=mid/colNum;
            int col=mid%colNum;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                left=mid+1;
            }
            else if(matrix[row][col]>target){
                right=mid-1;
            }
        }
        
            return false;
        
    }
}