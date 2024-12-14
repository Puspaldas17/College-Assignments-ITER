public class primeno100{
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        while (count < 100) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
