import java.util.Scanner;
import java.util.Arrays;
public class TransposeMatrix_constant_space{
    public static void transpose(int[][] mat){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix n*n:");
        int n=sc.nextInt();
        int[][] mat=new int[n][n];
        System.out.println("Enter the Matrix values");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter ["+i+"]["+j+"]:");
                mat[j][i]=sc.nextInt();
            }
        }
        
        transpose(mat);
        
        System.out.println("Transpose Matrix:");
        for(int[] y:mat){
            System.out.println(Arrays.toString(y));
        }
        
        sc.close();
    }
}