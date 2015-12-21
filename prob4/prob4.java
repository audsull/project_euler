public class prob4 {
    public static boolean isPalindrone(int x) {
	String s = Integer.toString(x);
	int l = s.length();
	//System.out.printf("%s: %d\n", s, l);

	for(int i = 0; i < l/2+1; i++) {
	    //System.out.printf("%c\n", s.charAt(i));

	    if((s.charAt(i)) != (s.charAt((l - 1) - i)))
	       return false;
	}
	return true;
    }
    public static void main(String[] args) {
	int a = 100;
	int b = 100;
	int largestp = 0;

	for(int i = 100; i <= 999; i++) {
	    for(int j = 100; j <= 999; j++) {
		if(isPalindrone(i * j) && (i * j) > largestp) {
		   largestp = i * j;
		   a = i;
		   b = j;
		}
	    }
	}
	System.out.printf("%d %d %d\n", largestp, a , b);
    }
}