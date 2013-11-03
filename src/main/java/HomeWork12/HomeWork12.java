package HomeWork12;

public class HomeWork12 {
    public int maxN(int max){
      return num(max);
    }

    private static int num(int n){
        int number = 0;
        int i = 1;
        while(prov(number) < n ){
            number +=i;
            i++;
        }
        return number;
    }
    private static int prov(int args){
        int nod = 0;
        int ssq = (int) Math.sqrt(args);
        for(int i = 1; i <= ssq; i++){
            if(args % i == 0){
                nod+=2;
            }
        }
        if(ssq * ssq == args){
            nod--;
        }
        return nod;
    }
}
