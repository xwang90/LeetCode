class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.size()==1&&matrix[0].size()==1) 
        {
            if(matrix[0][0]==target) return true;
            else return false;
        }
        
        int rowNum=matrix.size();
        int colNum=matrix[0].size();
        
        int left=0;
        int right=rowNum*colNum-1;
        int mid;
        int rowIndex;
        int colIndex;
        
        while(left<=right)
        {
            mid=left+(right-left)/2;
            
            rowIndex=mid/colNum;
            colIndex=mid%colNum;
            
            if(matrix[rowIndex][colIndex]==target) return true;
            else if(matrix[rowIndex][colIndex]>target) right=mid-1;
            else left=mid+1;
        }
        
             return false;
        
    }
};