package Leetcode;

import java.util.Stack;

public class Basketball {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for(String x : operations){
            if(x.equals("C")){
                // invalidate previous point
                int prev = st.pop();
                res -= prev;
            } else if (x.equals("+")) {
                // add previous 2 points and put to the stack
                int prev1 = st.pop();
                int prev2 = st.peek();
                st.push(prev1);
                st.push((prev1 + prev2));
                res += (prev1 + prev2);
            } else if (x.equals("D")) {
                // double the previous
                int prev = st.peek();
                st.push(2 * prev);
                res += (2 * prev);

            } else {
                // add to stack
                int score = Integer.parseInt(x);
                st.push(score);
                res += score;
            }
        }
        return res;
    }
//7868190130M7522
    public int countSeniors(String[] details) {
        int res = 0;
        for(String ticket : details){
            int age = Integer.parseInt(ticket.substring(11, 13));
            if(age > 60){
                res++;
            }
        }
        return res;
    }
}
