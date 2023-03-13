import java.util.*;

public class recursionpower{
    public static int calcPower( int x , int n){
        if( n == 0 ){
            return 1;
        }if( x == 0){
            return 0;
        }
        // if n is even
        if(n%2 == 0){
            return calcPower(x , n/2) * calcPower(x , n/2);
        }else{
            return calcPower(x , n/2) * calcPower(x , n/2) * x;
        }

        // int xPowernm1 = calcPower(x, n-1);
        // int xPowern = x * xPowernm1;
        // return xPowern;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        // int n = 2;
        // int x = 3;
        int Answer = calcPower(x, n);
        System.out.println("Ans : "+Answer);
    }
}