class Solution {
     private int getParent(int[] parent, int val) {
        if(parent[val] == val)
        return val;
        parent[val] = getParent(parent, parent[val]);
        return parent[val];
    }

    private void union(int[] parent, int val1, int val2) {
        if(parent[val1] != parent[val2]) {
            int p1 = getParent(parent, val1);
            int p2 = getParent(parent, val2);
            if(p1 <= p2) {
                parent[p2] = p1;
            } else {
                parent[p1] = p2;
            }
        }
    }
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[] parent = new int[26];
        for(int i = 0; i < 26; i++)
        parent[i] = i;

        for(int i = 0; i < s1.length(); i++) {
            union(parent, s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }

        for(int i = 0; i < 26; i++) {
            getParent(parent, i);
        }

        StringBuilder ans = new StringBuilder("");//StringBuilder fastens the execution

        for(int i = 0; i < baseStr.length(); i++)
        ans.append((char)(parent[baseStr.charAt(i) - 'a'] + 97));

        return ans.toString();       
    }
}