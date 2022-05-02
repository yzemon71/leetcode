/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }

        // 文字列を配列変換
        List<String> strList = Arrays.asList(s.split(""));
        // 種類数を算出
        int maxLen = strList.stream().distinct().collect(Collectors.toList()).size();
        
        // 文字種類数が1の場合、outputを1として返す
        if(maxLen == 1){
            return 1;
        }
        
        // 文字種類数が2以上のケース
        List<Integer> resultIntList = new ArrayList<>();

        first:
        for (int i = 0; i < strList.size(); i++) {
            List<String> tmpStrList = new ArrayList<>();
            tmpStrList.add(strList.get(i));

            second:
            for (int j = i+1; j < strList.size(); j++) {
                if(tmpStrList.contains(strList.get(j))){
                    if(maxLen == tmpStrList.size()){
                        return tmpStrList.size();
                    }
                    resultIntList.add(tmpStrList.size());
                    continue first;
                }
                tmpStrList.add(strList.get(j));                
            }
            resultIntList.add(tmpStrList.size());
        }

        Collections.sort(resultIntList, Collections.reverseOrder());

        return resultIntList.get(0);
    }
}
// @lc code=end

