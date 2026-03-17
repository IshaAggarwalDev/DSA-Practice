class Solution {
    public String removeKdigits(String num, int k) {
              Stack<Character> st = new Stack<>();

        for (char c : num.toCharArray()) {

            while (!st.isEmpty() && k > 0 && st.peek() > c) {
                st.pop();
                k--;
            }

            st.push(c);
        }

        // if k still left, remove from end
        while (k-- > 0 && !st.isEmpty()) {
            st.pop();
        }

        // build result
        StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }

        // remove leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}
