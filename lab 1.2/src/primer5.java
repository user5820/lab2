public class primer5 {
    public static int f(int n){
        int result;
        if(n==0){
            return 0;
        }
        else{
            if(n==1){
                System.out.println(n);
                return 1;
            }
            else{
                result = f(n-2)+f(n-1);
                System.out.println(result);
                return result;
            }
        }
    }

    public static void main(String[]args){
        f(5);
    }
}
