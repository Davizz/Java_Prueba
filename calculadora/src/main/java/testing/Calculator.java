package testing;

public class Calculator {

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public int product(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	public void longCalculation() {		
		try {
			//Suspendemos el flujo durante unos 2 segundos
			//Thread.sleep(2000);		
			//Suspendemos el flujo durante unos medio segundo
			Thread.sleep(500);	
		} catch(final InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}



	

}
