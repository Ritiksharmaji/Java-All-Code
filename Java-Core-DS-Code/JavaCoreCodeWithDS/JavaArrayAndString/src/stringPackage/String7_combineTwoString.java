package stringPackage;

public class String7_combineTwoString {

	public static void main(String[] args) {
		String s1 = "Computer-";
        String s2 = null;

        // Combining above strings by
        // passing one string as an argument
        String s3 = s1.concat(s2);

        // It will raise NullPointerException
        System.out.println(s3);
	}

}
