
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="RINA";
		String s2="Rina";
		String s3="rInA";
		String s4="Rina";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s3));
		
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s2==s4);
	}
}
