/**
 * Created by Linkin on 27.01.2017.
 */
public class FourthTask {
    public static void main(String[] args) {
        short n = 739;
        byte k= (byte) (n%100);
        byte z= (byte) (n%10);
        byte b= (byte) ((k-z)/10);
        byte v= (byte) ((n-k)/100+z+b);
        System.out.println("Result = " +v);
    }
}
