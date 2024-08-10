import java.util.Scanner;

public class CreataingWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int i;
        for (i = 1; i <= n; i++) {
            String str = input.nextLine();
            StringBuilder sb = new StringBuilder(str);
            {
                char temp = sb.charAt(0);
                sb.setCharAt(0, sb.charAt(4));
                sb.setCharAt(4, temp);
            }
            System.out.println(sb.toString());
        }
        input.close();
    }
}
