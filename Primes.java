public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int highestNum = Integer.parseInt(args[0]);
        System.out.printf("Prime numbers up to %d:%n", highestNum);

        int primeCount = 0;

        for (int i = 0; i <= highestNum; i++) {
            if (isPrime(i)) {
                primeCount++;
                System.out.println(i);
            }
        }
        int ratio =  (primeCount * 100) / highestNum;
        System.out.printf("There are %d primes between 2 and %d (%d%% are primes)%n", primeCount, highestNum, ratio);
    }

    // Checks whether an inputted int (assumed > 0) is a prime number
    public static boolean isPrime(int x) {
        // Running until sqrt of x, bc the sqrt^2 = x
        if (x < 2) { return false;   }
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {   return false;   }
        }

        return true;
    }
}