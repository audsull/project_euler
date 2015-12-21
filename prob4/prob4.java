public class prob4 {
    public static boolean isPalindrone(int x) {
	String s = Integer.toString(x);
	int l = s.length();
	for(int i = 0; i < l; i++) {
	    if((s.charAt(i)) != (s.charAt(l - i)))
	       return false;
	}
	return true;
    }
    public static void main(String[] args) {
	int a = 100;
	int b = 100;
	int largestp = 0;

	isPalindrone(1111);

    }
}