/**
 * Created by Linkin on 27.01.2017.
 */
public class ThirdTask {
    public static void main(String[] args) {
        double n = 999.4999999;
        int b = (int) n;
        double z = n - b;
        if (z >= 0.5) {
            b++;
            System.out.println("Result = " + b );
        }
        else System.out.println("Result = " + b );
    }
}
