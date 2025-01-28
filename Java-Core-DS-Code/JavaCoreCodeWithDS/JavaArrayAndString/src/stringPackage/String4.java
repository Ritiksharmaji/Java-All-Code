package stringPackage;

public class String4 {

	public static void main(String[] args) {
		  // Character Array
        char characters[] = { 'G', 'f', 'g' };

          // Creating new String using Character Array
        String firstString = new String(characters);
      
          // Creating new String using another String
        String secondString = new String(firstString);

        System.out.println(firstString);
        System.out.println(secondString);

	}

}
