public class Bits2 {
    public static void main(String[] args) {
        System.out.println(setAndUnset1(13, 2));
        System.out.println(setAndUnset2(13, 1));
        System.out.println(setAndUnset3(9, 2));
        System.out.println(setAndUnset4(13, 2));
        System.out.println(toggleBit(13, 1));
        System.out.println(removeRightmostBit(13));
        boolean a=false,b=false;
        if(a&&b){
            System.out.println("Both true");
        }
    }
    public static boolean setAndUnset1(int num,int i){
        if((num & (1 << i))!=0){
            return true;
        }
        return false;
    }
    public static boolean setAndUnset2(int num,int i){
        if((num>>i & 1)==1){
            return true;
        }
        return false;
    }
    public static int setAndUnset3(int num, int i){
        return num | (1 << i);
    }
    public static int setAndUnset4(int num,int i){
        return num & ~(1 << i);
    }
    public static int toggleBit(int num, int i){
        return num ^ (1 << i);
    }
    public static int removeRightmostBit(int num){
        return num & (num - 1);
    }
}