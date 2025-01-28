package stringPackage;

public class String5_multipleString {

	public static void main(String[] args) {
		String s1 = "Computer-";

        String s2 = "Science-";

        // Combining above strings by
        // passing one string as an argument
        String s3 = s1.concat(s2);

        // Print and display temporary combined string
        System.out.println(s3);

        String s4 = "Portal";
        String s5 = s3.concat(s4);
        System.out.println(s5);
	}

}
