import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int L = sc.nextInt();
        int R = sc.nextInt();

        System.out.println(s.substring(L, R ));
    }
}
