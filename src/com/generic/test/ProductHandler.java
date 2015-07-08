package com.generic.test;

public class ProductHandler implements RequestHandler{
	private static final String I_HANDLE = "Product";

	@Override
	public boolean isHandler(String type) {
		boolean canHandle = type.compareTo(I_HANDLE) == 0;
		Logger.println(this.getClass(), "In isHandle, checked the type of message. " + (canHandle ?" Yes, I can Handle this request " : " No, I can't handle this request "));
		return canHandle;
	}

	@Override
	public <T> void handle(Request<T> request) {
		
		try {
			Product prod = (Product) request.getT();
			Logger.println(this.getClass(), " Handled Product request " + prod.toString());
		} catch (Exception e) {
			Logger.println(this.getClass(), "Exception Occured while hadling request. Expected request with type Customer but got of type " + request.getT().getClass());
			e.printStackTrace();
		}
		
		
	}
}
