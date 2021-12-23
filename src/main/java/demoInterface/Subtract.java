package demoInterface;

public class Subtract {
	//State
		private int minuend;
		private int subtrahend;
		
		/*Interface*/
		//Behaviors
		/*Getter methods (accessor methods)*/
		public int getMinuend() {
			return minuend;
		}
		
		public int getSubtrahend() {
			return subtrahend;
		}
		
		
		/*Setter methods (Mutator methods)*/
		public void setMinuend(int minuend) {
			this.minuend = minuend;
		}
		
		public void setSubtrahend(int subtrahend) {
			this.subtrahend = subtrahend;
		}
		
		public int getDifference(int min, int sub) {
			return min - sub;
		}
		//Constructors
		public Subtract() {
			
		}
}
