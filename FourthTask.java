/**
 * Created by Linkin on 27.01.2017.
 */
public class FourthTask {
    public static void main(String[] args) {
        int n = 739;
        int k=(n%100);
        int z=(n%10);
        int b=(k-z)/10;
        int v=(n-k)/100+z+b;
        System.out.println("Result = " +v);
    }
}
