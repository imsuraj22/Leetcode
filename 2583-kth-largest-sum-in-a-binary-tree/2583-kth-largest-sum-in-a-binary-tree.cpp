/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    long long kthLargestLevelSum(TreeNode* root, int k) {
          if(!root){
            return {};
        }
        vector<long long> ans;
        vector<int> level;
        queue<TreeNode*> q;
        level.push_back(root->val);
        ans.push_back(root -> val);
        level.clear();
        q.push(root);
        
        
        
        while(!q.empty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                TreeNode* tmp = q.front();
                q.pop();
                
                if(tmp -> left){
                    q.push(tmp -> left);
                    level.push_back(tmp -> left -> val);
                }
                
                if(tmp -> right){
                    q.push(tmp ->  right);
                    level.push_back(tmp -> right -> val);
                }
            }
            
            if(!level.empty()){
                long long num=0;
                for(auto i : level)
                    num += i;
                    
                ans.push_back(num);
                level.clear();

            }
        }
        
         sort(ans.begin(),ans.end(), greater <>());
        
        int n = ans.size();
        
        if(n>=k)
            return ans[k-1];
        else
            return -1;
        
       
    }
};