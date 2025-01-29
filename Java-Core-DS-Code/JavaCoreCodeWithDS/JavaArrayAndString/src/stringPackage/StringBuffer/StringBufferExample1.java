package stringPackage.StringBuffer;

public class StringBufferExample1 {
	
	public static void main(String[] args){
	      
        // Creating StringBuffer
      StringBuffer s = new StringBuffer();
    
        // Adding elements in StringBuffer
      s.append("Hello");
      s.append(" ");
      s.append("world");
      
        // String with the StringBuffer value
        String str = s.toString();
      System.out.println(str);
  }

}
