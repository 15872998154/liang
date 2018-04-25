class Test{
	public static void main(String[] args) {
		Stock s = new Stock("ORCL","Oracle corporation");
		s.setpreviousClosingPrice(34.5);
		s.setCurrentPrice(34.35);
		System.out.println(s.getChangePercent());
	}
}

class Stock{
	private String symbol = "";
	private String name = "";
	private double previousClosingPrice = 0;
	private double currentPrice = 0;
	
	Stock(String symbol,String name){
		this.symbol = symbol;
		this.name = name;
	}

	public void setpreviousClosingPrice(double price){
		this.previousClosingPrice = price;
	}

	public double getChangePercent(){
		if(currentPrice>previousClosingPrice){
			return 1 + currentPrice/previousClosingPrice;
		}
		else{
			return 1 - currentPrice/previousClosingPrice;
		}
		
	}

	public void setCurrentPrice(double price){
		this.currentPrice = price;
	}



}