import java.util.Scanner;
public class Mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many no of table you want to print :");
        int n = sc.nextInt();

        System.out.println("Enter which table you want to print :");
        int k = sc.nextInt();

        int i = 1;
        int j = 0;

        while(i<=n){
            j = k*i;
            System.out.println(k + "X" + i+"="+ j);
            i=i+2;
        }
    }
}
