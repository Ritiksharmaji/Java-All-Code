package stringPackage;

public class String3 {

	public static void main(String[] args) {
		 // Creating Byte ASCII Array
        byte ascii[] = { 71, 70, 71 };

          // Creating String using byte array
        String firstString = new String(ascii);
        System.out.println(firstString);

          // Creating String using byte array with
          // Start index to End Index
        String secondString = new String(ascii, 1, 2);
        System.out.println(secondString);

	}

}
