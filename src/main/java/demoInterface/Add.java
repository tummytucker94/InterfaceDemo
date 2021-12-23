package demoInterface;

public class Add {
	
	//State
	private int addendOne;
	private int addendTwo;
	
	/*Interface*/
	//Behaviors
	/*Getter methods (accessor methods)*/
	public int getAddendOne() {
		return addendOne;
	}
	
	public int getAddendTwo() {
		return addendTwo;
	}
	
	/*Setter methods (Mutator methods)*/
	public void setAddendOne(int addendOne) {
		this.addendOne = addendOne;
	}
	
	public void setAddendTwo(int addendTwo) {
		this.addendTwo = addendTwo;
	}
	
	public int getSum() {
		int sum = addendOne + addendTwo;
		return sum;
	}
	//Constructors
	public Add(){
		
	}
}
