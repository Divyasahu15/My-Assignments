package opps;

public class A5 {
	public static void main(String[] args) {
		Employee employee=new
				CommisionEmployee(121, "amit", 2.1, 2000000);
		Invoice invoice=new Invoice("A123", "Electronic23W", 20, 3000);
		
		PaymentProcessingSystem.processPayment((Payble) employee);
	}

}
