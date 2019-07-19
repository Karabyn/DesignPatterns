package patterns.behavioral.template.example_2;

public abstract class OrderTemplate {

	private boolean isGift;

	abstract void doCheckout();
	abstract void doPayment();
	abstract void doReceipt();
	abstract void doDelivery();
	
	public final void wrapGift() {
		System.out.println("Gift wrapped.");
	}

	/**
	 * Template method.
	 * Final so that it's not overridden.
	 */
	public final void processOrder() {
		doCheckout();
		doPayment();
		if(isGift) {
			wrapGift();
		} else {
			doReceipt();
		}
		doDelivery();
	}
	
}
