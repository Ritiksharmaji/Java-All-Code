package javaIO.ReadWrite;

public class ReadClass2_ASCII2 {
	public static void main(String[] args) {
        // Print standard ASCII characters (0-127)
        System.out.println("Standard ASCII (0-127):");
        for (int i = 0; i < 128; i++) {
        	if(i <= 9) {
        		// to prevent the space
        	System.out.printf("Dec: %1d | Hex: %02X | Char: %s%n", i, i, (char) i);
        	}else if(i >=10) {
        	System.out.printf("Dec: %2d | Hex: %02X | Char: %s%n", i, i, (char) i);
        	}
        	else {
        	System.out.printf("Dec: %3d | Hex: %02X | Char: %s%n", i, i, (char) i);
        	}
            
        }

        // Print Extended ASCII (128-255)
        System.out.println("\nExtended ASCII (128-255):");
        for (int i = 128; i < 256; i++) {
            System.out.printf("Dec: %3d | Hex: %02X | Char: %s%n", i, i, (char) i);
        }
        
	}
}
