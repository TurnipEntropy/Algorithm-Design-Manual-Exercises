public class TwoFourImprovement {
  public static void main(String[] args){
    //instead of:
    //p = a[0];
    //xpower = 1;
    //for (int i = 1; i <= n; i++){
    //  xpower *= x;
    //  p = p + a[i] * xpower;
    //}
    //can be done with half as many multiplications below:
    int n = 4;
    int[] a = {3, 5, 2, 4};
    int x = 2;
    int p = a[n - 1];
    for (int i = n - 2; i >= 0; i--){
      p *= x;
      p += a[i];
    }
    System.out.println(p);
}
