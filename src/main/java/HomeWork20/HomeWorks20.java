package HomeWork20;

import java.math.BigInteger;

public class HomeWorks20{
    public int insert(int number){
        return result(number);
    }

    private static BigInteger F(long N)
    {
        if (N == 0 || N == 1)
            return new BigInteger("1");
        BigInteger R = new BigInteger("1");
        for(int I = 2; I <= N; I++)
            R = R.multiply(new BigInteger(String.valueOf(I)));
        return R;

    }

    private int result(int number)
    {
        int sum = 0;
        BigInteger A = F(number);
        String B = A.toString();
        for(int i = 0; i < B.length(); i++){
            sum = sum + Character.getNumericValue(B.charAt(i));
        }
        return sum;
    }
}
