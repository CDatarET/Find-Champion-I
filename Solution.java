class Solution {
    public int findChampion(int[][] grid) {
        int[] ranks = new int[grid.length];
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            int count = 0;
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    count++;
                }
            }

            if(count > ranks[max]){
                max = i;
            }
            ranks[i] = count;
        }

        return(max);
    }
}
