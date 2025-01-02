public class fib{
  public static int fib(int n){
    if (n == 0 || n == 1){
      return n;
    }else{
      return fib(n - 1) + fib(n - 2);
    }
  }

  public static void main(String[] args){
    System.out.println(fib(0));
    System.out.println(fib(1));
    System.out.println(fib(2));
  }
}
