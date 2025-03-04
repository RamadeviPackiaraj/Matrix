import java.util.Scanner;
import java.util.Arrays;
public class TransposeMatrix_Approach_NPower2{
    public static void transpose(int[][] mat,int[][] res){
        int rows=mat.length;
        int cols=mat[0].length;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                res[j][i]=mat[i][j];
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter Number of Cols:");
        int cols=sc.nextInt();
        
        int[][] mat=new int[rows][cols];
        System.out.println("Enter the Elements of matrix:");
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter["+i+"]["+j+"]:");
                mat[i][j]=sc.nextInt();
            }
        }
        
        int res[][]=new int[rows][cols];
        transpose(mat,res);
        
        for(int[] x:res){
            System.out.println(Arrays.toString(x));
        }
    
       sc.close(); 
    }
    
}