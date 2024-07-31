//Problem Statement: Given a decimal number N and an index i, toggle the ith position of the number, i.e., if the bit at position i is 0, then change it to 1, and if it is 1, then change it to 0.

public class Bits5 {
    public static void main(String[] args) {
        System.out.println(toggleBit(10, 2)); // Output: 14
    }
    public static int toggleBit(int N,int i){
        return N^(1<<i);
    }
}