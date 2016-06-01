/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<string> binaryTreePaths(TreeNode* root) {
        
        vector<string> resultV;
        
        if(root!=NULL)
        {
            vector<string> leftV=binaryTreePaths(root->left);
            vector<string> rightV=binaryTreePaths(root->right);
            leftV.insert(leftV.end(),rightV.begin(),rightV.end());
            
            if(leftV.size()!=0)
            {
               for(int i=0;i<leftV.size();i++)
               {
                  if(leftV[i].empty())
                    leftV[i].insert(0,to_string(root->val));
                  else
                    leftV[i].insert(0,to_string(root->val)+"->");
               }
            }
            else
            {
                leftV.push_back(to_string(root->val));
            }
            
            return leftV;
            
        }
        
            return resultV;
    }
};