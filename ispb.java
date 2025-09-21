import java.util.* ;
public class ispb{
static boolean  isprime (int n ){
    if(n <= 1){
        return false ;
    }
    for(int i = 2 ; i < n-1 ; i++){
        if (n % i  == 0){
            return false ;
        }
    
    }
    return true ;
}
public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean res = isprime(n);
    System.out.println(res);
}
}