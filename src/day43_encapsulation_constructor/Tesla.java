package day43_encapsulation_constructor;

public class Tesla {
	//instance variables
	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;
	
	
	@Override
	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		//call isValidModel here then assign it if true
		//if false: Invalid model =Camry
		//assign "unknown" to model
		if (isValidModel(model)) {
			this.model = model;
		}else {
			System.out.println("Invalid model " + model);
			this.model = "unknown";
		}
		
		
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public double getZeroTo60() {
		return zeroTo60;
	}
	public void setZeroto60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isSelfDriving() {
		return selfDriving;
	}
	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}
	public void getAllInfo() {
		System.out.println( "My Tesla [model=" + model + 
				", range=" + range + ", zeroTo60=" + zeroTo60 + 
				", price=" + price
				+ ", selfDriving=" + selfDriving + "]");
	}
	// method name: isValidModel
	//return type : boolean
	//params: String model
	public boolean isValidModel(String model) {
		model = model.toLowerCase();
//		if (model.contentEquals("model s") || model.contentEquals("model x")||
//				model.contentEquals("model Y") || model.contentEquals("roadstar")) {
//			return true;
//			}
//		return false;
		
		//or
//		return  model.equals("model s")|| 
//				model.equals("model x")||
//				model.equals("model Y")|| 
//				model.equals("roadstar");
		
		//or
		
		switch (model) {
		case "model s" :
		case "model x" :
		case "model y" :
		case "roadstar" :
			return true;
		default:
			return false;
				
		}
		
	}
	/*
	 * method:
	setTeslaInfo
	 return type: void
     params:
     String model
	 int range
	 double zeroTo60
	 double price
	 boolean selfDriving

	 when assigning values, please call setter methods.
	 try not to use this. etc.
	 */
	public void setTeslaInfo(String model, int range, double zeoTo60, double price, boolean selfDriving) {
		setModel(model);
		setRange(range);
		setZeroto60(zeoTo60);
		setPrice(price);
		setSelfDriving(selfDriving);
	}
	

}
