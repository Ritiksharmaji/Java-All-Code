package javaOops._2Abstraction;
abstract class Bank {
    abstract void getInterestRate(); // Abstract method

    void displayBankName() { // Concrete method
        System.out.println("This is a Bank");
    }
}
class SBI extends Bank {
    void getInterestRate() {
        System.out.println("SBI Interest Rate: 5.5%");
    }
}
class HDFC extends Bank {
    void getInterestRate() {
        System.out.println("HDFC Interest Rate: 6.2%");
    }
}
public class Abstraction2 {
	
	public static void main(String[] args) {
		Bank myBank = new SBI();
        myBank.getInterestRate(); // Calls SBI implementation
        myBank.displayBankName();

        myBank = new HDFC();
        myBank.getInterestRate(); // Calls HDFC implementation
    }

}
