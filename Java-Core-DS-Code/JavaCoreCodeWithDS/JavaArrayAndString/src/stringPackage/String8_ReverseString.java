package stringPackage;

public class String8_ReverseString {

	public static void main(String[] args) {
		// Declare original string variable
        String a = "Geeks";

        // Declare another string variable and initialize it with an empty string
        String b = "";

        // Iterate through each character in string "a" from the last index to the first.
        for (int i = a.length() - 1; i >= 0; i--) {
            
            // Extract the current character at index "i" of the "a" string
            char ch = a.charAt(i);

            // Convert the character to a String object using the "Character.toString" method
            String ch1 = Character.toString(ch);

            // Concatenate the converted character String  to the end of the "b" string 
            b = b.concat(ch1);
        }

        System.out.println("" + a);
        System.out.println("" + b);
	}

}
