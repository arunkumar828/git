import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        int n,fact=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number to get its factorial: ");
        n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of  " +n+ "  is: " +fact);
        input.close();
    }
}
