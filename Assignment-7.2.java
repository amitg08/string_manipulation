
public class SubString {
	public static void main(String[] args){
		String s = "Acadgild";
		String s1 = s.substring(0, 4);
		String s2 = "Acad";
		if(s2.equals(s1)){
			System.out.println("Substring found " + s1);
		}
		else{
			System.out.println("Substring not found ");
		}
	}

}
