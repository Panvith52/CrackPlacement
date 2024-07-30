//Problem Statement: Given a decimal number , reutrn the number of set bits in its binary representation.
public class Bits4 {
    public static void main(String[] args) {
        System.out.println(countSetBits(15)); // Expected output: 4
        System.out.println(countSetBitsRecursive(15)); // Expected output: 4
        System.out.println(countSetBitsBruteforce(15)); // Expected output: 4
    }
    public static int countSetBits(int num){
        int count = 0;
        while(num!=0){
            count += num & 1;
            num >>= 1;
        }
        return count;
    }
    public static int countSetBitsRecursive(int num){
        if(num==0) return 0;
        return (num & 1) + countSetBitsRecursive(num >> 1);
    }
    public static int countSetBitsBruteforce(int num){
        int count = 0;
        while(num>=1){
            if(num%2==1) count++;
            num /= 2;
        }
        return count;
    }
}
