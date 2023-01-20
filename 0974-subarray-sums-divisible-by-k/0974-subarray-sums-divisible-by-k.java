class Solution {
     public int subarraysDivByK(int[] nums, int k) {
         int[] modCount = new int[k];
    modCount[0] = 1;
    int sum = 0, count = 0;
    for (int num : nums) {
        sum = (sum + num) % k;
        if (sum < 0) {
            sum += k;
        }
        count += modCount[sum]++;
    }
    return count;
    }
}