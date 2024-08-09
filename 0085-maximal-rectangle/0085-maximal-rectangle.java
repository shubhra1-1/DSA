class Solution {
     int [] prevSmaller (int [] heights){
        int ps[] = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>= heights[i]){
                st.pop();
            }
            ps[i]=st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ps;
    }

    int [] nextSmaller (int [] heights){
        int ns[] = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>= heights[i]){
                st.pop();
            }
             ns[i] = st.isEmpty() ? heights.length : st.peek();
            st.push(i);
        }
        return ns;
    }
    public int largestRectangleArea(int[] heights) {
        int maxAns=0;
        int ps[] =prevSmaller(heights);
        int ns[] = nextSmaller(heights);

        for(int i =0;i<heights.length;i++){
            int area = (ns[i]-ps[i]-1)*heights[i];
            maxAns= Math.max(area,maxAns);
        }
        return maxAns;
    }
    public int maximalRectangle(char[][] matrix) {
          if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return 0;
    }

    int rows = matrix.length;
    int cols = matrix[0].length;

    // Initialize histogram array for heights
    int[] heights = new int[cols];
    int maxArea = 0;

    // Iterate through each row
    for (int i = 0; i < rows; i++) {
        // Update histogram heights
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] == '1') {
                heights[j] += 1;
            } else {
                heights[j] = 0;
            }
        }

        // Compute the maximum rectangle area for the updated histogram
        maxArea = Math.max(maxArea, largestRectangleArea(heights));
    }

    return maxArea;
}
}