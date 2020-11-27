package Poly;

//class that generates pair objects which have powers and coefficients
public class Pair {
	//the doubl coefficient 
	private double coefficient;
	//the int for power
	private int power;
	
	//getters and setters for coefficient and power
	public double getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	//constructor that allows pair to be generated with coeffficent and power already set
	public Pair(double coefficient, int power) {
		this.coefficient = coefficient;
		this.power = power;
	}
	
	
}
