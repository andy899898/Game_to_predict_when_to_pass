public class print_odd_no {
    public static void main(String[] args) {
        int i = 1;

      while(i<=20){
        while (i%2!=0) {
            System.out.println(i);
            i++;
        }
        i++;
      }
    }
}
