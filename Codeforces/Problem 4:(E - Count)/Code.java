import java.util.Scanner; 
 
public class CF_E { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        String str = input.nextLine(); 
        int i, sum = 0; 
        for (i = 0; i < str.length(); i++) { 
            sum = sum + str.charAt(i) - '0'; 
        } 
        System.out.println(sum); 
    } 
}