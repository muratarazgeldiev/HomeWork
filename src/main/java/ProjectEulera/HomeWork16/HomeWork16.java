package ProjectEulera.HomeWork16;

import java.math.BigInteger;
import java.io.IOException;
public class HomeWork16 {
    public int insert(int a, int b) throws  IOException {
        return result(a,b);
    }
    public static int result(int a, int b) throws IOException {
        BigInteger r =  BigInteger.valueOf(a).pow(b);
        String s = "" ;
        int sum = 0;
        s = r + s;
        for(int i = 0; i < s.length(); i++){
            char el = s.charAt(i);
            sum  = sum + Character.getNumericValue(el);
        }
        return sum;
    }
}
