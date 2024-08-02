import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1); // The first element in any row is 1
        
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int) ans);
        }
        
        return ansRow;
    }
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        for (int row = 1; row <= numRows; row++) {
            result.add(generateRow(row));
        }
        
        return result;
    }
    
}
