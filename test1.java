public class test1 {
    public static int factorial(int n){
        int factorial;
        if (n==1){
            factorial=1;
        }else {
            factorial=n*factorial(n-1);
        }
        return factorial;
    }
}
