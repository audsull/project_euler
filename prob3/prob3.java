public class prob3{
    public static boolean isPrimeNumber(int i) {
	if(i <= 3) {
	    return true;
	} else {
	    int j = 2;
	    while(j < i) {
		//		System.out.printf("j:%d\n", j);
		if(i % j == 0) {
		    return false;
		}
		j++;
	    }
	    return true;
	}
    }
    public static void findPrimes(long n) {
	int i = 1;
	int[] factors = new int[100];
	int f = 0;
	while(i < n) {
	    if((n % i) == 0) {
		if(isPrimeNumber(i)) {
		    System.out.printf("here: %s\n", i);
		    factors[f] = i;
		}
		i++;
	    } else {
		i++;
	    }
	}
    }
    public static void main(String[] args) {
	long x = 600851475143L;
	//long x = 100L;
	findPrimes(x);
    }
}