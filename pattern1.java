import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        int i, j, row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        row = sc.nextInt();
        for (i = 0; i <= row - 1; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
        for (i = row - 1; i >= 0; i--) {
            for (j = 0; j <= i - 1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
}