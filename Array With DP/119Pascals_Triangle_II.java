//CODE
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        if(rowIndex == 0) return firstRow;
        res.add(firstRow);
        for(int i=1; i<= rowIndex+1; i++){
            List<Integer> prev = res.get(i-1);
            if(i == rowIndex+1 ) return prev;
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=0; j<i-1; j++){
                row.add(prev.get(j)+ prev.get(j+1));
            }
            row.add(1);
            res.add(row);
        }
        return firstRow;
    }
}


// <!-- Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
// Example 1:

// Input: rowIndex = 3
// Output: [1,3,3,1]
// Example 2:

// Input: rowIndex = 0
// Output: [1]
// Example 3:

// Input: rowIndex = 1
// Output: [1,1] -->
