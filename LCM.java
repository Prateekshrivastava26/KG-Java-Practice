import java.util.Scanner;
public class LCM{
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the no");
        int first = ab.nextInt();
        System.out.println("Enter the no");
        int second= ab.nextInt();
        int lcm = lcm(first,second);
        System.out.println("LCM is:"+lcm);
    }
    public static int lcm(int first , int second){
        int i = 1;
        while (true){
            int factor = first*i;
            if(factor%second==0){
                return factor;
            }
            i++;
        }
    }


}