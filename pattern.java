import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int row = sc.nextInt();
        printReverse(ch, row);
    }
    public static void printReverse(char c, int n) {
        for (int i = n; i >= 1; i--) {
            printLine(c, i);
        }
    }
    public static void printPttern(char c, int n) {
        for (int i = 1; i <= n; i++) {
            printLine(c, i);
        }
    }
    public static void printLine(char c, int col) {
        System.out.print("\n");
        for (int i = 1; i <= col; i++)
            System.out.print(c);
    }
}



/*###*
##**
#***
*****/