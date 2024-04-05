import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner harry = new Scanner(System.in);
        System.out.println("Enter the no");
        int num = harry.nextInt();
        boolean isPrime  = isPrime(num);
        if(isPrime){
            System.out.println("Prime ");
        }
        else {
            System.out.println("Not Prime");
        }
    }
    public static boolean isPrime(int num){
        int i=2;
        while (i<num)
        {
            if(num%i==0)
            {
                return false;
            }
            i++;
        }
        return true;
    }


}
