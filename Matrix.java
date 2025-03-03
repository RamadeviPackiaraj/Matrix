import java.util.Scanner;
public class Matrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols=sc.nextInt();
        
        
        int[][] matrix=new int[rows][cols];
        
        System.out.println("Enter the Matrix Elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Element["+i+"]["+j+"]:");
                matrix[i][j]=sc.nextInt();
            }
        }System.out.println("The Entered Matrix is:");
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+"\t");
                
            }
            System.out.println();
        }
        
        sc.close();
    }
}