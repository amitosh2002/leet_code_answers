 public class PalindromeNum{
    static boolean isPalindrome(int x) {
        
        // if(x>=0 && x<10){
        //     return true;
        // }
        // int sum=0;
        // int rem;
        // rem=x%10;
        // sum=sum*10+rem;
        // x=x/10;
        // if(x<0){
        //     return false;
        // }
        // if(sum==x){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        int reverse,rem;
        reverse=0;
        while(x!=0){
            rem=x%10;
            reverse=reverse*10+rem;
            x/=10;
    
           }
           System.out.println(reverse);
        return true;
    }
    public static void main(String[] args) {

        isPalindrome(121);
        System.out.println("hello");
    }
   
}