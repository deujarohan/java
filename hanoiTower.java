import java.util.*;

public class hanoiTower{
    public static void towerOfHanoi( int n, String scorce, String helper, String destination){
        if( n == 1){
            System.out.println("transfer " + n + " from " + scorce + " to " + destination);
            return;
        }
        towerOfHanoi(n-1, scorce, destination, helper);
        System.out.println("transfer " + n + " from " + scorce + " to " + destination);
        towerOfHanoi(n-1, helper, scorce, destination);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, "S", "H", "D");
    }
}