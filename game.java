import java.util.Scanner;

public class game {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number :");
    int n = sc.nextInt();

    int i = 1;
    while (i <= n) {
      if (i % 5 == 0) {
        System.out.println("Pass");
        i++;
      } else {
        System.out.println(i);
        i++;
      }
    }

  }
}