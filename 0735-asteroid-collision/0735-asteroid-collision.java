import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        
        for (int i = 0; i < n; i++) {
            int current = asteroids[i];
            if (current > 0) {
                st.push(current);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(current)) {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == Math.abs(current)) {
                    st.pop();
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(current);
                }
            }
        }
        
        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        
        return result;
    }
}
