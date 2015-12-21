public class prob2 {
    public static void main(String[] args) {
	int[] i = new int[100];
	i[0] = 1;
	i[1] = 2;
	int n = 1;
	int evens = 2;
	while(i[n] < 4000000) {
	    n++;
	    i[n] = i[n-1] + i[n-2];
	    System.out.printf("%d\n", i[n]);
	    if(i[n] < 4000000 && (i[n] % 2) == 0) {
		evens+= i[n];
	    }
	}
	System.out.printf("evens:%d\n", evens);
    }
}