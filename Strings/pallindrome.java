/*
 * Author : Anant Mishra
 * Date : 22 - sep - 2025 ;
 * description : check if the string is pallindrome or not using recursion
 */




public class pallindrome {   
    static boolean pallin(String str , int i , int j){
        if(i >= j ){
            return true ;
        }
        if(str.charAt(i) != str.charAt(j)){
            return false ;
        }
        else{
            return pallin(str, i+1, j-1);
        }
    }
    public static void main(String[] args) {
        String str = "racecar";
        int i = 0 ;
        int j = str.length() -1 ;
        boolean ans = pallin(str, i, j);
        System.out.println(ans);
    }
}