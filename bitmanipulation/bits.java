public class bits {
    public static void main(String[] args) {
        System.out.print(countSetBits(7));
    }
    // to count for the set bits
    public static int countSetBits(int n) {
        int count  = 0;
        while (n>0) {
            if((n&1) != 0) {
                count++;
            }
            n = n>>1;
        }
        
        return count;

}