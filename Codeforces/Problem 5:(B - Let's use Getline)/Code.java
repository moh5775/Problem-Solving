import java.util.Scanner; 
 
public class CF_B { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        String str = input.nextLine(); 
        int i, sum = 0; 
        for (i = 0; i < str.length(); i++) { 
            if (str.charAt(i) == '\\') 
                break; 
            else 
                System.out.print(str.charAt(i)); 
        } 
    } 
}