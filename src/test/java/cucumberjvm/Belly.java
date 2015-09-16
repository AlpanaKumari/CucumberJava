package test.java.cucumberjvm;

public class Belly {

	
	 private int cukes;

	    public void eat(int cukes) {
	        this.cukes = cukes;
	    }

	    public String getResult(int waitingTime) {
	        if (cukes > 39 && waitingTime <= 1) {
	            return "available";
	        } else {
	            return "out of stock";
	        }
	    }
}
