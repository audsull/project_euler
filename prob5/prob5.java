class prob5 {
    public static void main(String[] args) {
	int x = 2520;
	int i = 1;
	while(i < 21) {
	    if((x % i) != 0) {
		x++;
		i = 1;
	    }
	    else
		i++;
	}
	System.out.printf("%d\n", x);
    }
}