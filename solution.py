class Solution:
    def findChampion(self, grid):
        ranks = [0] * len(grid)
        m = 0
        for i in range(len(grid)):
            c = 0
            for n in grid[i]:
                if n == 1:
                    c += 1
            
            if c > ranks[m]:
                m = i
            ranks[i] = c
        
        return m
