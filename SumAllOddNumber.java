import java.util.Scanner;
public class SumAllOddNumber {
    public static void main(String[] args) {
        Scanner Jp = new Scanner(System.in);
        System.out.println("Enter  the no .\n");
        int num = Jp.nextInt();
        int sum = oddsum(num);
        System.out.println("Odd Sum :"+sum);
    }
    public static int oddsum(int num){
        int sum = 0;
        int i = 1;
        while(i<=num)
        {
            sum=sum+i;
            i=i+2;

        }
        return sum;
    }
}
