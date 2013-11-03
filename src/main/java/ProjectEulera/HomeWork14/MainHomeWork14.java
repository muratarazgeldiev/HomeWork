package ProjectEulera.HomeWork14;

public class MainHomeWork14 {
    public static void main(String[] args) {
        HomeWork14 home = new HomeWork14();
        int c = 0;
        int[] max = new int[2];
        max[0] = 0;
        max[1] = 0;
        for(int i = 0; i < 1000000; i++){
            c = home.insertProv(i);
            if(c > max[0]){
                max[0] = c;
                max[1] = i;
            }
        }
        System.out.print("Max length = " + max[0] + " for " + max[1]);
    }
}
