public class Bits6 {
    public static void main(String[] args) {
        int a = 3,b=9;
        System.out.println("The XOR of numbers from a to b inclusive is: " + xorfromntom(a,b)); // Output: 14
    }
    public static int xorfromntom(int a,int b){
        int num=a;
        for(int i=a+1;i<b;i++){
            num = num^i;
        }
        return num;
    }
}
