import java.util.Scanner;
public class now {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        input.nextLine();
        for(int i=1;i<=n;i++)
        {
            char ch = input.nextLine().charAt(0);
        if(ch=='c'||ch=='o'||ch=='d'||ch=='e'||ch=='f'||
            ch=='r'||ch=='s')
        System.out.println("YES");
        else
            System.out.println("NO");
        }
        
    
    }
}