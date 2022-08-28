class Solution {
  
  //Runtime: 7 ms, faster than 80.21% of Java online submissions for Sort the Matrix Diagonally.
  //Memory Usage: 47.7 MB, less than 68.40% of Java online submissions for Sort the Matrix Diagonally.
    public int[][] diagonalSort(int[][] mat) {
        int rows = mat.length;
        int cols = mat[rows-1].length;
        int[][] visited = new int[rows][cols];
        for(int[] arr : visited){
            Arrays.fill(arr,1);   
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(visited[i][j] == -1){
                    continue;
                }
                else{
                    int len = Math.min(rows-i,cols-j);
                    int limit = i;
                    int limit_j = j;
                    int[] arr = new int[len];
                    int iter = 0;
                    while(iter<len){
                        arr[iter] = mat[limit][limit_j];
                        visited[limit][limit_j] = -1;
                        limit++;limit_j++;
                        iter++;
                    }
                    Arrays.sort(arr);
                    limit = i;
                    limit_j = j; 
                    iter = 0;
                    while(iter<len){
                        mat[limit][limit_j] =  arr[iter];
                        limit++;limit_j++;
                        iter++;
                    }
                        
                }
            }
        }
        return mat;
    }
}
