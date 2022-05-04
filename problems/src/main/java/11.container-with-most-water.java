/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length-1;

        int area = 0;
        while(leftIndex <= rightIndex){
            int tmpArea = 0;
            if(height[leftIndex] < height[rightIndex]){
                tmpArea = height[leftIndex] * (rightIndex - leftIndex);
                leftIndex++;
            }else{
                tmpArea = height[rightIndex] * (rightIndex - leftIndex);
                rightIndex--;
            }
            if(area < tmpArea){
                area = tmpArea;
            }
        }
        return area;
    }
}
// @lc code=end

