public class prime {
    public static void main(String[] args) {
        int limit = 100; // Change this value to check prime numbers up to a different limit
        System.out.println("Prime numbers up to " + limit + ":");

        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;

            // Check if the number is prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
