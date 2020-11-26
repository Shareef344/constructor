package practice_programms;

public class Constructor {
	String name;
	int price;
	String type;
	
	
	public Constructor(String name,int price, String type) {
	
		this.name=name;
		this.price = price;
		this.type= type;
	
		
		
	}

	public static void main(String[] args) {
		
		Constructor m = new Constructor("bmw", 20 , "auto");
		System.out.println(m.name);
		

	}

}
