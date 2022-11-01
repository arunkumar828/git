import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        Scanner obj=new Scanner (System.in);
        int n;
        System.out.print("Enter the number to find even or odd.: ");
        n=obj.nextInt();

    if (n%2==0)
        System.out.println(n+ " is a even number");
    else
        System.out.println(n+ " is a Odd number");
    obj.close();
}
}