/**
 * Created by Linkin on 27.01.2017.
 */
public class SecondTask {
    public static void main(String[] args) {
        byte n = 17;
        byte z= (byte) (n%10);;
        byte v= (byte) (((n-z)/10)+z);;
        System.out.println("Result = " + v);
    }
}