package HomeWork14;

public class HomeWork14 {
    public int insertProv(int args){
        return prov(args);
    }
    private static int prov(long args){
        int count = 1;
        while(args > 1){
            count++;
            if(args % 2 == 0){
                args = args / 2;
            } else{
                args = 3 * args + 1;
            }

        }
        return count;
    }
}
