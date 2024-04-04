import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the no");
        int num = ab.nextInt();
        multiplicationtable(num);
    }
    public static void multiplicationtable(int num){
        int i =1;
        while(i<=10){
            System.out.println(num+"*"+i+"="+(num*i));
            i++;
        }
    }
}
