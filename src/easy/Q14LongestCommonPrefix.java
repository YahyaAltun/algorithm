package easy;

//        Write a function to find the longest common prefix string amongst an array of strings.
//
//        If there is no common prefix, return an empty string "".

//        Example 1:
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"

//        Example 2:
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.

public class Q14LongestCommonPrefix {
    public static void main(String[] args) {

        String [] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] strs){

        if (strs.length == 0) return "";

        int length = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            length = Math.min(length, strs[i].length());

            for (int j = 0; j < length; j++) {
                char c = strs[0].charAt(j), d = strs[i].charAt(j);

                if (c != d) {
                    length = j;
                    break;
                }
            }
        }
        return strs[0].substring(0, length);
    }
}
