import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the no");
        int num = ab.nextInt();
        int sum = sumofdigit(num);
        System.out.println("Sum of digits:\n"+sum);
    }
    public static int sumofdigit(int num){
        int sum = 0;
        while (num>0){
            sum += num%10;
            num /= 10;

        }
        return sum;
    }

}