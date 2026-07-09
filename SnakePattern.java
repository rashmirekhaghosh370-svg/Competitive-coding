import java.util.Scanner;
public class SnakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
         int p;
         if (i%2==0){
            p = i * n + 1;
            for (int j = 0; j < n; j++) {
                System.out.print(p + "\t");
                p++;
            }
         } else {
            p = (i *n+ n);
            for (int j = 0; j < n; j++) {
                System.out.print(p + "\t");
                p--;
            }
         }
         System.out.println();
        }
        
    }
}
