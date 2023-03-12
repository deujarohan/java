import java.util.*;

public class recursionfactorial{
    public static int calfactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int fact_nm = calfactorial(n - 1) ;
        int fact_n = n * fact_nm;
        return fact_n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int n = 5;
        
        int answer = calfactorial(n);
        System.out.println(answer);
    }
}