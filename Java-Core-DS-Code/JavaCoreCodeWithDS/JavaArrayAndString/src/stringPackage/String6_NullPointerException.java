package stringPackage;

public class String6_NullPointerException {

	public static void main(String[] args) {
		// String Initialization
        String s1 = "Geeksfor";
        String s2 = "Geeks";

        // Concatenate the strings s1 and s2 using the concat() method
        // and store the result back in s1.
        s1 = s1.concat(s2);

        System.out.println(s1);
	}

}
