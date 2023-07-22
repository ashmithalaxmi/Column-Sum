import java.util.Scanner;

public class ColSum {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows in the array");
        int sizeRow=scanner.nextInt();
        System.out.println("Enter the number of columns in the array");
        int sizeColumn=scanner.nextInt();
        int array[][]=new int[sizeRow][sizeColumn];
        System.out.println("Enter the array elements");
        for(int iterator=0;iterator<sizeRow;iterator++){
            for(int j=0;j<sizeColumn;j++){
                array[iterator][j]=scanner.nextInt();
            }
        }
        int columSumArray[]=columnSum(array,sizeRow,sizeColumn);
        System.out.println("Column Sum is :");
        for(int i: columSumArray){
            System.out.print(i+" ");
        }
    }
    private static int[] columnSum(int[][] array, int sizeRow, int sizeColumn) {
        int columnSumArray[]=new int[sizeColumn];
        for(int i=0;i<sizeColumn;i++){
            int columnSum=0;
            for(int j=0;j<sizeRow;j++){
                columnSum+=array[j][i];
            }
            columnSumArray[i]=columnSum;
        }
        return columnSumArray;
    }
}
