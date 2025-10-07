import java.util.*;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                matrix[i][j] = sc.nextInt();
        
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(row[i] || col[j]) matrix[i][j] = 0;
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
