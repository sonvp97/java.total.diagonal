import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter square array: ");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.printf("Enter elemnt arr[%d][%d]: ",i,j);
                size = scanner.nextInt();
                arr[i][j] = size;
            }
        }
        System.out.println("Array of you is: ");
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                if (i == j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Total diagonal is :" + sum);
    }
}