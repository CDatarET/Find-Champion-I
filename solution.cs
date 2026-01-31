public class Solution {
    public int FindChampion(int[][] grid) {
        int[] ranks = new int[grid.Length];
        int max = 0;
        for(int i = 0; i < grid.Length; i++){
            int count = 0;
            for(int j = 0; j < grid[0].Length; j++){
                if(grid[i][j] == 1) count++;
            }

            if(count > ranks[max]) max = i;
            ranks[i] = count;
        }

        return(max);
    }
}
