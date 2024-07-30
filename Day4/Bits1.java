import java.util.Arrays;
public class Bits1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(wap(10, 20)));
    }
    public static int[] wap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        return new int[]{a,b};
    }
}
