
public class SubString1 {
	public static void main(String[] args) {
	    String s = "Acadgild";
	    String s1 = "Acad";
	    char[] a = s.toCharArray();
	    char[] b = s1.toCharArray();
	    System.out.println(isPresent(char[] a, char[] b);
	}

	public static boolean isPresent(char[] a, char[] b) {
	    for (int i = 0; i < a.length - b.length+1; i++) {
	        for (int j = 0; j < b.length; j++) {
	            if (a[i + j] == b[j]) {
	                if (j == b.length - 1) {
	                    return true;
	                }
	            } else {
	                break;
	            }
	        }
	    }
	    return false;
	}
}

