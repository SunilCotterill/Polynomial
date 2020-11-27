package Poly;
/*
 * Name: Sunil Cotterill (20814212)
 * 
 * Assignment 1 part 2
 * 
 * October 4 2020
 * 
 * This program is the Polynomial class. It allows for the creation of polynomial objects that have the following public methods:
 * toString, getDegree, getCoefficient, add, subtract, update, negate & getDerivative. The two fields of the class are the int degree and 
 * array list of pairs coefficientsAndPowers. Degree stores the degree of the polynomial as an int. coefficientsAndPowers stores
 * Pairs, a simple object with the two fields coefficient, a double, and power, an int. Pair has getters and
 * setters for it's two field and a constructor of the type coefficientPowerPair(double coefficient, int pair)
 * 
 * A Polynomial can be created with no input, which creates a 0 Polynomial, or with a string of the format "3.0x^2 + 1.0x - 3.2" 
 * (This is an example format it can be longer or shorter). The various methods have different inputs:
 * getDegree takes no input, 
 * getCoefficient takes an int,
 * add takes a polynomial
 * subtract takes a polynomial
 * update a double and an int,
 * negate takes nothing
 * getDerivative takes nothing
 * 
 * 
 * The various methods have different outputs: 
 * toString returns the polynomial as a string.
 * getDegree returns the degree of the polynomial, as an int, 
 * getCoefficient returns the coefficient of a given power, as a double, 
 * add returns the sum of the two polynomials, as a Polynomial, 
 * subtract returns the difference of the two polynomials, as a Polynomial, 
 * update returns nothing, it is a mutator that updates the polynomial 
 * negate returns nothing, it is a mutator that multiplies the polynomial by negative 1 
 * getDerivative returns the derivative of the polynomial, as a Polynomial
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Polynomial {
	// int used to store degree of polynomial
	private int degree;

	// ArrayList that stores pair objects, which have coefficient
	// and power fields
	private ArrayList<Pair> coefficientsAndPowers = new ArrayList<>();

	// Empty constructor creates the 0 polynomial
	public Polynomial() {
		// adding 0.0x^-1 into coefficientsAndPowers
		Pair pair = new Pair(0.0, -1);
		this.coefficientsAndPowers.add(pair);
	}

	//method used to interpret strings that tokens of constructor strings
	//it takes the nextPair token and the sign token, which is the sign proceeding the term (+ or -)
	private Pair addTerm(String nextPair, String sign) {
		//try catch block is used to detect illegal arguments
		try {
			//multiplier is used to keep track of what is negative
			int multiplier = 1;
			
			//this is the case of the first term. If the first term is negative the sign is changed to - and the - of the token is removed
			//-3.0x becomes as if it had been inputed as - 3.0x
			if(sign.contentEquals("") && nextPair.contains("-")) {
				nextPair= nextPair.substring(1, nextPair.length());
				sign = "-";
			}
			//if the sign was negative the multiplier is negative 1
			if (sign.equals("-")) {
				multiplier *= -1;
			}
			//initializing double to correspond to coefficient
			double coefficient;
			// initializing integer to correspond to power
			int power;
			
			// if statement to check if the pair has an x
			if (nextPair.contains("x")) {
				int xPlace = nextPair.indexOf("x");

				// these if else get the coefficient
				// if x place is 0 then coefficient is 1.0 or -1.0 (x^3 = 1.0x^3)
				if (xPlace == 0) {
					// multiplier changes 1.0 to -1.0 if required
					coefficient = 1.0 * multiplier;
				}
				// if x isn't the first character in string parse the first character for double
				else {
					coefficient = Double.parseDouble(nextPair.substring(0, xPlace));
					coefficient *= multiplier;
				}

				
				// These if else get the power
				// checking to make sure x isn't to the power of 1 (2.0x^1 is displayed as 2.0x)
				if (xPlace == nextPair.length() - 1) {
					power = 1;
				}
				// if it's not to the power of 1 scanning the string for the power
				else {
					power = Integer.parseInt(nextPair.substring(xPlace + 2));
				}
				// combines the coeficient and power into a pair and adds it to list
				Pair pair = new Pair(coefficient, power);
				return pair;
			} 
			//if the string doesn't have an x parse the double (this is the constant term)
			else {
				// scans for the coefficient and adds to a pair with the power being 0.
				Pair pair = new Pair(Double.parseDouble(nextPair) * multiplier, 0);
				return pair;
			}

		} catch (Exception e) {

			throw new IllegalArgumentException();
		}
	}

	// generating the polynomial based on a string
	public Polynomial(String string) {
		//switching capital x's to lowercase
		if (string.contains("X")) {
			string = string.replace('X', 'x');
		}
		//various illegal arguments
		if (string.isEmpty() || string.isBlank() || null == string) {
			throw new IllegalArgumentException();
		}
		// scanner to scan inputed string
		Scanner stringScan = new Scanner(string);
		
		//this is adding the first term to the list. Because it had no preceding sign the sign is set to ""
		coefficientsAndPowers.add(addTerm(stringScan.next(), ""));

			//while loop to add the rest of the terms
			while (stringScan.hasNext()) {
				// gets scanner's next which should be + or -
				String sign = stringScan.next();
				// scans for next coefficient power pair
				String nextPair = stringScan.next();
				//puts the the String next pair into a Pair obeject using the add term method. Then adds this Pair to list
				coefficientsAndPowers.add(addTerm(nextPair, sign));
				
			}
			// combines all coefficients that have similar powers and sets degree
			setDegree();
			// orders coefficientsAndPowers in descending order by power
			order();

			// close scanner
			stringScan.close();
		 
	}

	// method that sets the degree of the polynomial, by sorting through the list
	private void setDegree() {
		// simplify is called here to remove any unnecessary terms (like 0.0x^40)
		simplify();
		// initializing degree int, which has a minimum value of -1
		int degree = -1;
		// loop through each power of the list
		for (int i = 0; i < this.coefficientsAndPowers.size(); i++) {
			int power = this.coefficientsAndPowers.get(i).getPower();
			// if the power is larger than the degree set the power to be the new degree
			if (power > degree) {
				degree = power;
			}

		}
		//degree is set to highest power found in loop
		this.degree = degree;
	}

	// sets degree of polynomial and combines any coefficients of the same power
	private void simplify() {
		// for loop that iterates through coefficientsAndPowers, comparing the power
		for (int i = 0; i < this.coefficientsAndPowers.size(); i++) {
			int power = this.coefficientsAndPowers.get(i).getPower();
			// nested for loop that combines all coefficients of the same power
			for (int j = i + 1; j < this.coefficientsAndPowers.size(); j++) {
				// if jth and ith powers are the same combine their coefficients
				if (this.coefficientsAndPowers.get(j).getPower() == power) {
					// new pair with combined coefficients
					Pair combined = new Pair(this.coefficientsAndPowers.get(i).getCoefficient()
							+ this.coefficientsAndPowers.get(j).getCoefficient(), power);
					// setting the new combined pair to ith place,removing j
					this.coefficientsAndPowers.set(i, combined);
					this.coefficientsAndPowers.remove(j);
					// j is be reduced to compare the new item that has taken the jth spot (after j
					// was removed)
					j--;
				}
			}
			// any 0 term should be removed as well as any term with power less than -1
			if (this.coefficientsAndPowers.get(i).getPower() < -1
					|| this.coefficientsAndPowers.get(i).getCoefficient() == 0.0) {
				this.coefficientsAndPowers.remove(i);
			}
		}
	}

	// orders the list in descending order by power
	private void order() {
		// for loop that iterates through list
		for (int i = 0; i < this.coefficientsAndPowers.size(); i++) {
			// nested for loop that compares each term after i to the term after it and
			// orders them
			for (int j = i; j < this.coefficientsAndPowers.size() - 1; j++) {
				// if jth term's power is smaller than j+1th term's power move j+1th term to
				// front
				if (this.coefficientsAndPowers.get(j).getPower() < this.coefficientsAndPowers.get(j + 1).getPower()) {
					// pair equal to j+1 term
					Pair holder = this.coefficientsAndPowers.get(j + 1);
					// moving j+1 term to front and removing it from where it currently is
					this.coefficientsAndPowers.remove(j + 1);
					this.coefficientsAndPowers.add(j, holder);

				}
			}
		}
	}

	// method that returns degree of polynomial
	public int getDegree() {
		// ensures that degree has been set
		setDegree();
		// returns degree
		return this.degree;
	}

	// method that returns the coeficient of a specified power
	public double getCoefficient(int degree) {
		// can't have degrees of less than 0 (in this polynomial class)
		if (degree < 0) {
			throw new IllegalArgumentException();
		}
		// simplify is called to ensure there are no repeated powers.
		simplify();
		// initializing double coefficient, which is 0 if power is not included in the
		// polynomial
		double coefficient = 0.0;

		// loops through list, looking for power equal to that specified
		for (int i = 0; i < this.coefficientsAndPowers.size(); i++) {
			// if the power is equal to specified power set it coefficient equal to this
			// coefficient
			if (this.coefficientsAndPowers.get(i).getPower() == degree) {
				coefficient = this.coefficientsAndPowers.get(i).getCoefficient();
				return coefficient;
			}

		}
		return coefficient;

	}

	// method that updates a coefficient based on it's power, combining with the
	// coefficient if it exsists beforehand
	public void update(double coefficient, int degree) {
		// can't have powers of less than 0
		if (degree < 0) {
			throw new IllegalArgumentException();
		}
		// boolean to keep track of if a coefficient has been updated
		boolean happened = false;
		// loops through list, looking for specified power
		for (int i = 0; i < this.coefficientsAndPowers.size(); i++) {
			// if power is found add the given coefficient to found coefficient
			if (this.coefficientsAndPowers.get(i).getPower() == degree) {
				// value of combined coefficients
				double holder = this.coefficientsAndPowers.get(i).getCoefficient() + coefficient;
				// pair with new coefficient and same power
				Pair pair = new Pair(holder, degree);
				// updating the list
				this.coefficientsAndPowers.set(i, pair);
				happened = true;
			}

		}
		// if no coefficient has been updated add this power coefficient pair to the
		// list
		if (!happened) {
			Pair pair = new Pair(coefficient, degree);
			this.coefficientsAndPowers.add(pair);
		}
		// orders list which could have gotten out of order
		order();
		// sets degree which could have changed and (because simplify is called in set
		// degree) ensures all 0 terms are removed
		setDegree();

	}

	// method used in toString to check if inputted string is a 1
	private String checkForOne(double input) {
		// if it is a one return an empty string
		if (input == 1.0) {
			return " + ";
		} else if (input == -1.0) {
			return " - ";
		}
		// if not parse it as a double
		else if (input > 0.0) {
			return " + " + Double.toString(input);
		} else {
			return " - " + Double.toString(input * -1);
		}
	}

	// method that checks if the first term in a string is + or - 1
	private String checkForOneFirstTerm(double input) {
		// if it's one return the empty string
		if (input == 1.0) {
			return "";
		}
		// if it's negative 1 return the negative sign
		else if (input == -1.0) {
			return "-";
		}
		// if it's not parse the string as a double
		else {
			return Double.toString(input);
		}
	}
	//method used to output a string based on the inputed power
	private String checkPower(int input) {
		//if the power is greater than 1 return x^
		if (input > 1) {
			return "x^" + Integer.toString(input);
		} 
		//if it's equal to 1 return x
		else if (input == 1) {
			return "x";
		} 
		//otherwise, which should only be power=0, return the empty string
		else {
			return "";
		}
	}

	// method that returns string representation of the Polynomial
	public String toString() {
		// ensures polynomial list is ordered, degree is set ,and all like terms are
		// combined
		order();
		setDegree();
		// String that will eventually returned is initialized
		String polynomial = "";
		// if the degree is -1 return 0 string
		if (this.getDegree() == -1) {
			return "0";
		} else {
			// when adding any coefficient to the string checkForOneFirstTerm is called.
			// This ensures that 1.0x/-1.0x is never printed only x.
			// First term had to be considered separately as there is no sign preceding it
			// if the first term's power is greater than 1 add it's coefficient to the
			// string with an x^POWER attached
			if (this.coefficientsAndPowers.get(0).getPower() > 0) {
				polynomial += checkForOneFirstTerm(this.coefficientsAndPowers.get(0).getCoefficient())
						+ checkPower(this.coefficientsAndPowers.get(0).getPower());
			}

			// otherwise, power is zero, add the first term by itself to the string (can't
			// check for one because 1.0 must be displayed)
			else {
				polynomial += this.coefficientsAndPowers.get(0).getCoefficient();
			}

			// for loop that adds rest of polynomial to string
			for (int i = 1; i < this.coefficientsAndPowers.size(); i++) {
				// if the power is 1 or greater check the coefficient for 1 and check the power
				// to display correct x (x^ or x)
				if (this.coefficientsAndPowers.get(i).getPower() > 0) {
					polynomial += checkForOne(this.coefficientsAndPowers.get(i).getCoefficient())
							+ checkPower(this.coefficientsAndPowers.get(i).getPower());
				}

				// if power is 0 and coefficient is negative add coefficient after negative sign
				// (- 1.0)
				else if (this.coefficientsAndPowers.get(i).getCoefficient() < 0) {
					polynomial += " - " + (this.coefficientsAndPowers.get(i).getCoefficient() * -1.0);
				}
				// if power is 0 and coefficient is positive add coefficient after addition sign
				// (+ 1.0)
				else if (this.coefficientsAndPowers.get(i).getCoefficient() > 0) {
					polynomial += " + " + (this.coefficientsAndPowers.get(i).getCoefficient());
				}
			}
			return polynomial;
		}
	}

	// method that evaluates the polynomial for a given double
	public double getValue(double x) {
		// double to keep track of sum
		double currentTotal = 0.0;
		// for loop that iterates through list
		for (int i = 0; i < this.coefficientsAndPowers.size(); i++) {
			// adding given double raised to ith power times ith coefficient to total
			currentTotal += this.coefficientsAndPowers.get(i).getCoefficient()
					* Math.pow(x, this.coefficientsAndPowers.get(i).getPower());
		}
		return currentTotal;
	}

	// method that returns the polynomial with all negated terms
	public Polynomial negate() {
		// cloning was learnt at:
		// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#clone--
		// clone of coefficientsAndPowers
		ArrayList<Pair> coefficientsAndPowersClone = (ArrayList<Pair>) this.coefficientsAndPowers.clone();

		// loop that iterates through list, multiplying each coefficient by -1
		// and setting that in the list
		for (int i = 0; i < coefficientsAndPowersClone.size(); i++) {
			Pair pair = new Pair(coefficientsAndPowersClone.get(i).getCoefficient() * -1,
					coefficientsAndPowersClone.get(i).getPower());
			coefficientsAndPowersClone.set(i, pair);
		}
		// returns a polynomial created with the list as the parameter
		return new Polynomial(coefficientsAndPowersClone);

	}

	// method that returns derivative of the polynomial
	public Polynomial getDerivative() {
		// clone of coefficientsAndPowers
		ArrayList<Pair> coefficientsAndPowersClone = (ArrayList<Pair>) this.coefficientsAndPowers.clone();

		// for each term multiply the coefficient by the power and then subtract 1 from
		// the power
		for (int i = 0; i < coefficientsAndPowersClone.size(); i++) {
			// pair with multiplied coefficient and reduced power
			Pair pair = new Pair(
					coefficientsAndPowersClone.get(i).getCoefficient() * coefficientsAndPowersClone.get(i).getPower(),
					coefficientsAndPowersClone.get(i).getPower() - 1);
			// updating list to contain modified pair
			coefficientsAndPowersClone.set(i, pair);
		}
		return new Polynomial(coefficientsAndPowersClone);
	}

	// method that returns a polynomial that is the result of adding given
	// polynomial to current polynomial
	public Polynomial add(Polynomial add) {
		// ensuring passed polynomial is not null
		if (add == null) {
			throw new IllegalArgumentException();
		}
		// generate a polynomial is the combination of the two polynomials strings
		String polynomialString = this.toString() + " + " + add.toString();
		return new Polynomial(polynomialString);

	}

	// method that returns a polynomial that is the result of subtracting the given
	// polynomial from the current polynomial
	public Polynomial subtract(Polynomial subtract) {
		// ensuring passed polynomial is not null
		if (subtract == null) {
			throw new IllegalArgumentException();
		}
		// generate a polynomial that is the combination of the current polynomial and the
		// negated passed polynomial using the Polynomial constructor
		String polynomialString = this.toString() + " + " + subtract.negate().toString();
		subtract.negate();
		return new Polynomial(polynomialString);

	}

	// allows polynomials to be constructed based off of array lists
	private Polynomial(ArrayList<Pair> list) {
		setCoefficientsAndPowers(list);
	}

	// sets coefficientsAndPowers field
	private void setCoefficientsAndPowers(ArrayList<Pair> list) {
		this.coefficientsAndPowers = list;
	}
}
