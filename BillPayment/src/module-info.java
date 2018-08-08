/**
 * 
 */
/**
 * @author Admin
 *
 */
module com.training.bill.pay {
	
	opens com.training.pack1;
	
	//requires com.training.reflect;
	
	exports com.training.pack1 to com.training.pmt.card;
	exports com.training.pack2 to com.training.pmt.cash;
	
}