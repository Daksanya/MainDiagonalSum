import java.util.Scanner;

public class MainDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[][]=new int[n][n];
        int sum=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                array[i][j]=scanner.nextInt();
            }

        }
        for (int i=0;i<n;i++){
            sum+=array[i][i];
        }
        System.out.println(sum);


    }
}
