package javaBasicPackage_5_CommandLineAndVarVariable;

 class VarVariable_CLass6_Real_Life_Example {
	 static void log(String level, String... messages) {
	        System.out.print(level + ": ");
	        for (String message : messages) {
	            System.out.print(message + " ");
	        }
	        System.out.println();
	    }

	public static void main(String[] args) {
		  log("INFO", "Application started");
	        log("WARNING", "Low disk space", "Delete unused files");
	        log("ERROR", "NullPointerException", "Line 20", "Check object initialization");
	        

	}

}
