package test;

/*
 * Name: Sunil Cotterill (20814212)
 * 
 * Assignment 1 part 1
 * 
 * October 4 2020
 * 
 * This program is a test class for the Polynomial class. It contains a total of 84 tests for the various 
 * Polynomial class' methods. The polynomial class contains the following methods: toString, getDegree, getCoefficient, 
 * add, subtract, update, negate & getDerivative. The tests are different cases possible for the methods. 
 * 
 * This program takes no input, but requires the existence of a Polynomial class to test.
 * 
 * 
 * This program will return the result (either fail or pass) of each test.
 * 
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Poly.Polynomial;

import org.junit.Test;

//add BIG polynomial test
public class PolynomialTest {

	// tests for toString method
	// tests simple toString case
	@Test
	public void testToString() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 2.0");
		assertEquals("3.0x^2 + 2.0x + 2.0", testPoly.toString());
	}

	// tests toString of null polynomial
	@Test(expected = NullPointerException.class)
	public void testToStringNull() {
		Polynomial testPoly = null;
		testPoly.toString();
	}

	@Test
	public void testToStringLong() {
		Polynomial testPoly = new Polynomial(
				"100.0x^100 + 99.0x^99 + 98.0x^98 + 97.0x^97 + 96.0x^96 + 95.0x^95 + 94.0x^94 + 93.0x^93 + 92.0x^92 + 91.0x^91 + 90.0x^90 + 89.0x^89 + 88.0x^88 + 87.0x^87 + 86.0x^86 + 85.0x^85 + 84.0x^84 + 83.0x^83 + 82.0x^82 + 81.0x^81 + 80.0x^80 + 79.0x^79 + 78.0x^78 + 77.0x^77 + 76.0x^76 + 75.0x^75 + 74.0x^74 + 73.0x^73 + 72.0x^72 + 71.0x^71 + 70.0x^70 + 69.0x^69 + 68.0x^68 + 67.0x^67 + 66.0x^66 + 65.0x^65 + 64.0x^64 + 63.0x^63 + 62.0x^62 + 61.0x^61 + 60.0x^60 + 59.0x^59 + 58.0x^58 + 57.0x^57 + 56.0x^56 + 55.0x^55 + 54.0x^54 + 53.0x^53 + 52.0x^52 + 51.0x^51 + 50.0x^50 + 49.0x^49 + 48.0x^48 + 47.0x^47 + 46.0x^46 + 45.0x^45 + 44.0x^44 + 43.0x^43 + 42.0x^42 + 41.0x^41 + 40.0x^40 + 39.0x^39 + 38.0x^38 + 37.0x^37 + 36.0x^36 + 35.0x^35 + 34.0x^34 + 33.0x^33 + 32.0x^32 + 31.0x^31 + 30.0x^30 + 29.0x^29 + 28.0x^28 + 27.0x^27 + 26.0x^26 + 25.0x^25 + 24.0x^24 + 23.0x^23 + 22.0x^22 + 21.0x^21 + 20.0x^20 + 19.0x^19 + 18.0x^18 + 17.0x^17 + 16.0x^16 + 15.0x^15 + 14.0x^14 + 13.0x^13 + 12.0x^12 + 11.0x^11 + 10.0x^10 + 9.0x^9 + 8.0x^8 + 7.0x^7 + 6.0x^6 + 5.0x^5 + 4.0x^4 + 3.0x^3 + 2.0x^2 + 1.0x + 1.0");
		assertEquals(
				"100.0x^100 + 99.0x^99 + 98.0x^98 + 97.0x^97 + 96.0x^96 + 95.0x^95 + 94.0x^94 + 93.0x^93 + 92.0x^92 + 91.0x^91 + 90.0x^90 + 89.0x^89 + 88.0x^88 + 87.0x^87 + 86.0x^86 + 85.0x^85 + 84.0x^84 + 83.0x^83 + 82.0x^82 + 81.0x^81 + 80.0x^80 + 79.0x^79 + 78.0x^78 + 77.0x^77 + 76.0x^76 + 75.0x^75 + 74.0x^74 + 73.0x^73 + 72.0x^72 + 71.0x^71 + 70.0x^70 + 69.0x^69 + 68.0x^68 + 67.0x^67 + 66.0x^66 + 65.0x^65 + 64.0x^64 + 63.0x^63 + 62.0x^62 + 61.0x^61 + 60.0x^60 + 59.0x^59 + 58.0x^58 + 57.0x^57 + 56.0x^56 + 55.0x^55 + 54.0x^54 + 53.0x^53 + 52.0x^52 + 51.0x^51 + 50.0x^50 + 49.0x^49 + 48.0x^48 + 47.0x^47 + 46.0x^46 + 45.0x^45 + 44.0x^44 + 43.0x^43 + 42.0x^42 + 41.0x^41 + 40.0x^40 + 39.0x^39 + 38.0x^38 + 37.0x^37 + 36.0x^36 + 35.0x^35 + 34.0x^34 + 33.0x^33 + 32.0x^32 + 31.0x^31 + 30.0x^30 + 29.0x^29 + 28.0x^28 + 27.0x^27 + 26.0x^26 + 25.0x^25 + 24.0x^24 + 23.0x^23 + 22.0x^22 + 21.0x^21 + 20.0x^20 + 19.0x^19 + 18.0x^18 + 17.0x^17 + 16.0x^16 + 15.0x^15 + 14.0x^14 + 13.0x^13 + 12.0x^12 + 11.0x^11 + 10.0x^10 + 9.0x^9 + 8.0x^8 + 7.0x^7 + 6.0x^6 + 5.0x^5 + 4.0x^4 + 3.0x^3 + 2.0x^2 + x + 1.0",
				testPoly.toString());
	}

	// tests toString when polynomial is constructed out of order
	@Test
	public void testToStringOutOfOrder() {
		Polynomial testPoly = new Polynomial("2.0 + 2.0x + 3.0x^2");
		assertEquals("3.0x^2 + 2.0x + 2.0", testPoly.toString());
	}

	// tests toString when constant term has ^0
	@Test
	public void testToStringPowerZero() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 2.0x^0");
		assertEquals("3.0x^2 + 2.0x + 2.0", testPoly.toString());
	}

	// tests toString when coefficients are ints
	@Test
	public void testToStringDoubleFormat() {
		Polynomial testPoly = new Polynomial("3x^2 + 2x + 2");
		assertEquals("3.0x^2 + 2.0x + 2.0", testPoly.toString());
	}

	// tests to ensure zero polynomial is represented as the string 0
	@Test
	public void testToStringZeroPolynomial() {
		Polynomial testPoly = new Polynomial();
		assertEquals("0", testPoly.toString());
	}

	// tests to ensure constant term is represented without x's or power's, even if
	// it was constructed that way
	@Test
	public void testToStringConstantTerm() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 2.0x^0");
		assertEquals("3.0x^2 + 2.0x + 2.0", testPoly.toString());
	}

	// tests to ensure x^1 is represented as x, even if it was constructed that way
	@Test
	public void testToStringFirstOrderTerm() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x^1 + 2.0");
		assertEquals("3.0x^2 + 2.0x + 2.0", testPoly.toString());
	}

	// tests to ensure coefficient 1.0 is not shown for non-constant terms, even if
	// it was constructed that way
	@Test
	public void testToStringPositiveOneAsCoefficient() {
		Polynomial testPoly = new Polynomial("1x^2 + 1.0x + 2.0");
		assertEquals("x^2 + x + 2.0", testPoly.toString());
	}

	// tests to ensure coefficient -1 is only shown if constant term, even if it was
	// constructed that way
	@Test
	public void testToStringNegativeOneAsCoefficient() {
		Polynomial testPoly = new Polynomial("-1.0x^2 - 1.0x + 2.0");
		assertEquals("-x^2 - x + 2.0", testPoly.toString());
	}

	// tests to ensure coefficient -1 shown if constant term
	@Test
	public void testToStringNegativeOneAsConstant() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 1.0x - 1.0");
		assertEquals("3.0x^2 + x - 1.0", testPoly.toString());
	}

	// tests to ensure coefficient 1 is shown if constant term
	@Test
	public void testToStringPositiveOneAsConstant() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 1.0x - 1.0");
		assertEquals("3.0x^2 + x - 1.0", testPoly.toString());
	}

	// tests to ensure negative coefficient is shown as subtraction
	@Test
	public void testToStringNegativeCoefficientAsSubtraction() {
		Polynomial testPoly = new Polynomial("3.0x^2 + -2.0x + -1.0");
		assertEquals("3.0x^2 - 2.0x - 1.0", testPoly.toString());
	}

	// tests to ensure negative coefficient is shown as negative coefficient on
	// first term
	@Test
	public void testToStringNegativeCoefficientAsSubtractionFirstTerm() {
		Polynomial testPoly = new Polynomial("-3.0x^2 + 2.0x + 1.0");
		assertEquals("-3.0x^2 + 2.0x + 1.0", testPoly.toString());
	}

	// tests for getDegree method
	// simple getDegree test
	@Test
	public void testGetDegree() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		assertEquals(2, testPoly.getDegree());
	}

	// tests getDegree of 0 polynomial
	@Test
	public void testGetDegreeZeroPolynomial() {
		Polynomial testPoly = new Polynomial();
		assertEquals(-1, testPoly.getDegree());
	}

	// tests getDegree of polynomial with only constant term
	@Test
	public void testGetDegreeConstant() {
		Polynomial testPoly = new Polynomial("3.5");
		assertEquals(0, testPoly.getDegree());
	}

	// tests getDegree of a high powered polynomial
	@Test
	public void testGetDegreeLargeDegree() {
		Polynomial testPoly = new Polynomial("3x^10000000 + 5.0x^2 + 5.2");
		assertEquals(10000000, testPoly.getDegree());
	}

	// tests the getDegree method for a polynomial constructed out of order
	@Test
	public void testGetDegreeOutOfOrderPolynomial() {
		Polynomial testPoly = new Polynomial("4.0x^2 + 6.0x^5 + 4.0");
		assertEquals(5, testPoly.getDegree());
	}

	// tests the getDegree method for a polynomial constructed with multiple of the
	// same highest power terms
	@Test
	public void testGetDegreeSameDegree() {
		Polynomial testPoly = new Polynomial("4.0x^2 + 6.0x^2 + 4.0");
		assertEquals(2, testPoly.getDegree());
	}

	// tests for getCoefficient method
	// simple test for getCoefficient
	@Test
	public void testGetCoefficient() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		assertEquals(3.0, testPoly.getCoefficient(2), 0.0000001);
	}

	// tests getCoefficient if the specified degree is not include in the polynomial
	@Test
	public void testGetCoefficientNoTerm() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		assertEquals(0.0, testPoly.getCoefficient(8), 0.0000001);
	}

	// tests getCoefficient if method is called many times
	@Test
	public void testGetCoefficientManyTimes() {
		Polynomial testPoly = new Polynomial(
				"51.0x^51 + 50.0x^50 + 49.0x^49 + 48.0x^48 + 47.0x^47 + 46.0x^46 + 45.0x^45 + 44.0x^44 + 43.0x^43 + 42.0x^42 + 41.0x^41 + 40.0x^40 + 39.0x^39 + 38.0x^38 + 37.0x^37 + 36.0x^36 + 35.0x^35 + 34.0x^34 + 33.0x^33 + 32.0x^32 + 31.0x^31 + 30.0x^30 + 29.0x^29 + 28.0x^28 + 27.0x^27 + 26.0x^26 + 25.0x^25 + 24.0x^24 + 23.0x^23 + 22.0x^22 + 21.0x^21 + 20.0x^20 + 19.0x^19 + 18.0x^18 + 17.0x^17 + 16.0x^16 + 15.0x^15 + 14.0x^14 + 13.0x^13 + 12.0x^12 + 11.0x^11 + 10.0x^10 + 9.0x^9 + 8.0x^8 + 7.0x^7 + 6.0x^6 + 5.0x^5 + 4.0x^4 + 3.0x^3 + 2.0x^2 + 1.0x^1");
		// checks each coefficient is as expected
		for (double i = 51; i > 0; i--) {
			assertEquals(i, testPoly.getCoefficient((int) i), 0.0000001);
		}
	}

	// tests getCoefficient if the degree is 0 (Constant term)
	@Test
	public void testGetCoefficientZero() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		assertEquals(1.0, testPoly.getCoefficient(0), 0.0000001);
	}

	// tests getCoefficient if degree is negative
	@Test(expected = IllegalArgumentException.class)
	public void testGetCoefficientNegativeDegree() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		testPoly.getCoefficient(-5);
	}

	// tests getCoefficient if coefficient is negative
	@Test
	public void testGetCoefficientNegativeCoefficient() {
		Polynomial testPoly = new Polynomial("-3.0x^2 + 2.0x + 1.0");
		assertEquals(-3.0, testPoly.getCoefficient(2), 0.0000001);
	}

	// tests getCoefficient if the degree is large
	@Test
	public void testGetCoefficientLargeDegree() {
		Polynomial testPoly = new Polynomial("3.0x^1000000 + 2.0x + 1.0");
		assertEquals(3.0, testPoly.getCoefficient(1000000), 0.0000001);
	}

	// tests getCoefficient if the coefficient is large
	@Test
	public void testGetCoefficientLargeCoefficient() {
		Polynomial testPoly = new Polynomial("3000000.0x^2 + 2.0x + 1.0");
		assertEquals(3000000.0, testPoly.getCoefficient(2), 0.0000001);
	}

	// tests for the update method
	// tests update for adding a coefficient that was not there
	@Test
	public void testUpdate() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		testPoly.update(4.0, 3);
		assertEquals(4.0, testPoly.getCoefficient(3), 0.0000001);
		assertEquals(3, testPoly.getDegree());
	}

	// tests update when combining the positive given coefficient and existing
	// coefficient
	@Test
	public void testUpdateAdd() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		testPoly.update(4.0, 2);
		assertEquals(7.0, testPoly.getCoefficient(2), 0.0000001);
		assertEquals(2, testPoly.getDegree());
	}

	// tests update when combining the negative given coefficient and existing
	// coefficient
	@Test
	public void testUpdateSubtract() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		testPoly.update(-4.0, 2);
		assertEquals(-1.0, testPoly.getCoefficient(2), 0.0000001);
		assertEquals(2, testPoly.getDegree());
	}

	// tests update if provided degree is negative
	@Test(expected = IllegalArgumentException.class)
	public void testUpdateNegativeDegree() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		testPoly.update(4.0, -2);
	}

	// tests update if provided degree is negative
	@Test(expected = NullPointerException.class)
	public void testUpdateNull() {
		Polynomial testPoly = null;
		testPoly.update(4.0, -2);
	}

	// tests update for when provided power is 0 (constant term)
	@Test
	public void testUpdateConstantTerm() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		testPoly.update(4.0, 0);
		assertEquals(5.0, testPoly.getCoefficient(0), 0.0000001);
		assertEquals(2, testPoly.getDegree());
	}

	// tests update for empty polynomial
	@Test
	public void testUpdateZeroPolynomial() {
		Polynomial testPoly = new Polynomial();
		testPoly.update(4.0, 0);
		assertEquals(4.0, testPoly.getCoefficient(0), 0.0000001);
		assertEquals(0, testPoly.getDegree());
	}

	// tests update for subtract out an entire highest power term (make sure degree
	// gets changed)
	@Test
	public void testUpdateRemoveTerm() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		testPoly.update(-3.0, 2);
		assertEquals(0.0, testPoly.getCoefficient(2), 0.0000001);
		assertEquals(1, testPoly.getDegree());
	}

	// tests update when provided coefficient is large
	@Test
	public void testUpdateLargeCoefficient() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		testPoly.update(1000000.0, 2);
		assertEquals(1000003.0, testPoly.getCoefficient(2), 0.0000001);
		assertEquals(2, testPoly.getDegree());
	}

	// tests update when provided power is large
	@Test
	public void testUpdateLargePower() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		testPoly.update(-5.0, 1000000);
		assertEquals(-5.0, testPoly.getCoefficient(1000000), 0.0000001);
		assertEquals(1000000, testPoly.getDegree());
	}

	// tests for add method
	// simple add test
	@Test
	public void testAdd() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial testPoly2 = new Polynomial("8.0x^2 + 5.0x + 4.0");
		Polynomial answer = testPoly.add(testPoly2);
		assertEquals("11.0x^2 + 7.0x + 5.0", answer.toString());
		assertEquals(2, answer.getDegree());
		assertEquals(11.0, answer.getCoefficient(2), 0.0000001);

	}

	// tests to make sure add is an accessor, doesn't change either of the two added
	// polynomials
	@Test
	public void testAddIsAccessor() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial testPoly2 = new Polynomial("8.0x^2 + 5.0x + 4.0");
		Polynomial answer = testPoly.add(testPoly2);
		assertEquals("3.0x^2 + 2.0x + 1.0", testPoly.toString());
		assertEquals(2, testPoly.getDegree());
		assertEquals(3.0, testPoly.getCoefficient(2), 0.0000001);

		assertEquals("8.0x^2 + 5.0x + 4.0", testPoly2.toString());
		assertEquals(2, testPoly2.getDegree());
		assertEquals(8.0, testPoly2.getCoefficient(2), 0.0000001);

	}

	// test to make sure add method won't accept null polynomial
	@Test(expected = IllegalArgumentException.class)
	public void testAddNullInputted() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial testPoly2 = null;
		Polynomial answer = testPoly.add(testPoly2);
	}

	// test to make sure add method won't work if original polynomial is null
	@Test(expected = NullPointerException.class)
	public void testAddNull() {
		Polynomial testPoly = null;
		Polynomial testPoly2 = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial answer = testPoly.add(testPoly2);
	}

	// tests adding 0 polynomial
	@Test
	public void testAddZero() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial testPoly2 = new Polynomial();
		Polynomial answer = testPoly.add(testPoly2);
		assertEquals("3.0x^2 + 2.0x + 1.0", answer.toString());
		assertEquals(3.0, answer.getCoefficient(2), 0.0000001);
		assertEquals(2, answer.getDegree());
	}

	// tests add with large coefficient
	@Test
	public void testAddLargeCoefficient() {
		Polynomial testPoly = new Polynomial("1000000.0x^2 + 1000000.0x + 1000000.0");
		Polynomial testPoly2 = new Polynomial("5000000.0x^2 + 5000000.0x + 5000000.0");
		Polynomial answer = testPoly.add(testPoly2);
		assertEquals("6000000.0x^2 + 6000000.0x + 6000000.0", answer.toString());
		assertEquals(2, answer.getDegree());
		assertEquals(6000000.0, answer.getCoefficient(2), 0.0000001);
	}

	// tests add method with long polynomials(high degrees)
	@Test
	public void testAddLongPoly() {
		Polynomial testPoly = new Polynomial(
				"100.0x^100 + 99.0x^99 + 98.0x^98 + 97.0x^97 + 96.0x^96 + 95.0x^95 + 94.0x^94 + 93.0x^93 + 92.0x^92 + 91.0x^91 + 90.0x^90 + 89.0x^89 + 88.0x^88 + 87.0x^87 + 86.0x^86 + 85.0x^85 + 84.0x^84 + 83.0x^83 + 82.0x^82 + 81.0x^81 + 80.0x^80 + 79.0x^79 + 78.0x^78 + 77.0x^77 + 76.0x^76 + 75.0x^75 + 74.0x^74 + 73.0x^73 + 72.0x^72 + 71.0x^71 + 70.0x^70 + 69.0x^69 + 68.0x^68 + 67.0x^67 + 66.0x^66 + 65.0x^65 + 64.0x^64 + 63.0x^63 + 62.0x^62 + 61.0x^61 + 60.0x^60 + 59.0x^59 + 58.0x^58 + 57.0x^57 + 56.0x^56 + 55.0x^55 + 54.0x^54 + 53.0x^53 + 52.0x^52 + 51.0x^51 + 50.0x^50 + 49.0x^49 + 48.0x^48 + 47.0x^47 + 46.0x^46 + 45.0x^45 + 44.0x^44 + 43.0x^43 + 42.0x^42 + 41.0x^41 + 40.0x^40 + 39.0x^39 + 38.0x^38 + 37.0x^37 + 36.0x^36 + 35.0x^35 + 34.0x^34 + 33.0x^33 + 32.0x^32 + 31.0x^31 + 30.0x^30 + 29.0x^29 + 28.0x^28 + 27.0x^27 + 26.0x^26 + 25.0x^25 + 24.0x^24 + 23.0x^23 + 22.0x^22 + 21.0x^21 + 20.0x^20 + 19.0x^19 + 18.0x^18 + 17.0x^17 + 16.0x^16 + 15.0x^15 + 14.0x^14 + 13.0x^13 + 12.0x^12 + 11.0x^11 + 10.0x^10 + 9.0x^9 + 8.0x^8 + 7.0x^7 + 6.0x^6 + 5.0x^5 + 4.0x^4 + 3.0x^3 + 2.0x^2 + 1.0x + 1.0");
		Polynomial testPoly2 = new Polynomial(
				"100.0x^100 + 99.0x^99 + 98.0x^98 + 97.0x^97 + 96.0x^96 + 95.0x^95 + 94.0x^94 + 93.0x^93 + 92.0x^92 + 91.0x^91 + 90.0x^90 + 89.0x^89 + 88.0x^88 + 87.0x^87 + 86.0x^86 + 85.0x^85 + 84.0x^84 + 83.0x^83 + 82.0x^82 + 81.0x^81 + 80.0x^80 + 79.0x^79 + 78.0x^78 + 77.0x^77 + 76.0x^76 + 75.0x^75 + 74.0x^74 + 73.0x^73 + 72.0x^72 + 71.0x^71 + 70.0x^70 + 69.0x^69 + 68.0x^68 + 67.0x^67 + 66.0x^66 + 65.0x^65 + 64.0x^64 + 63.0x^63 + 62.0x^62 + 61.0x^61 + 60.0x^60 + 59.0x^59 + 58.0x^58 + 57.0x^57 + 56.0x^56 + 55.0x^55 + 54.0x^54 + 53.0x^53 + 52.0x^52 + 51.0x^51 + 50.0x^50 + 49.0x^49 + 48.0x^48 + 47.0x^47 + 46.0x^46 + 45.0x^45 + 44.0x^44 + 43.0x^43 + 42.0x^42 + 41.0x^41 + 40.0x^40 + 39.0x^39 + 38.0x^38 + 37.0x^37 + 36.0x^36 + 35.0x^35 + 34.0x^34 + 33.0x^33 + 32.0x^32 + 31.0x^31 + 30.0x^30 + 29.0x^29 + 28.0x^28 + 27.0x^27 + 26.0x^26 + 25.0x^25 + 24.0x^24 + 23.0x^23 + 22.0x^22 + 21.0x^21 + 20.0x^20 + 19.0x^19 + 18.0x^18 + 17.0x^17 + 16.0x^16 + 15.0x^15 + 14.0x^14 + 13.0x^13 + 12.0x^12 + 11.0x^11 + 10.0x^10 + 9.0x^9 + 8.0x^8 + 7.0x^7 + 6.0x^6 + 5.0x^5 + 4.0x^4 + 3.0x^3 + 2.0x^2 + 1.0x + 1.0");
		Polynomial answer = testPoly.add(testPoly2);
		assertEquals(
				"200.0x^100 + 198.0x^99 + 196.0x^98 + 194.0x^97 + 192.0x^96 + 190.0x^95 + 188.0x^94 + 186.0x^93 + 184.0x^92 + 182.0x^91 + 180.0x^90 + 178.0x^89 + 176.0x^88 + 174.0x^87 + 172.0x^86 + 170.0x^85 + 168.0x^84 + 166.0x^83 + 164.0x^82 + 162.0x^81 + 160.0x^80 + 158.0x^79 + 156.0x^78 + 154.0x^77 + 152.0x^76 + 150.0x^75 + 148.0x^74 + 146.0x^73 + 144.0x^72 + 142.0x^71 + 140.0x^70 + 138.0x^69 + 136.0x^68 + 134.0x^67 + 132.0x^66 + 130.0x^65 + 128.0x^64 + 126.0x^63 + 124.0x^62 + 122.0x^61 + 120.0x^60 + 118.0x^59 + 116.0x^58 + 114.0x^57 + 112.0x^56 + 110.0x^55 + 108.0x^54 + 106.0x^53 + 104.0x^52 + 102.0x^51 + 100.0x^50 + 98.0x^49 + 96.0x^48 + 94.0x^47 + 92.0x^46 + 90.0x^45 + 88.0x^44 + 86.0x^43 + 84.0x^42 + 82.0x^41 + 80.0x^40 + 78.0x^39 + 76.0x^38 + 74.0x^37 + 72.0x^36 + 70.0x^35 + 68.0x^34 + 66.0x^33 + 64.0x^32 + 62.0x^31 + 60.0x^30 + 58.0x^29 + 56.0x^28 + 54.0x^27 + 52.0x^26 + 50.0x^25 + 48.0x^24 + 46.0x^23 + 44.0x^22 + 42.0x^21 + 40.0x^20 + 38.0x^19 + 36.0x^18 + 34.0x^17 + 32.0x^16 + 30.0x^15 + 28.0x^14 + 26.0x^13 + 24.0x^12 + 22.0x^11 + 20.0x^10 + 18.0x^9 + 16.0x^8 + 14.0x^7 + 12.0x^6 + 10.0x^5 + 8.0x^4 + 6.0x^3 + 4.0x^2 + 2.0x + 2.0",
				answer.toString());
		assertEquals(100, answer.getDegree());
		assertEquals(200.0, answer.getCoefficient(100), 0.0000001);
	}

	// tests add with large powers
	@Test
	public void testAddLargePowers() {
		Polynomial testPoly = new Polynomial("3.0x^1000000 + 2.0x^9999");
		Polynomial testPoly2 = new Polynomial("2.0x^1000000 + 1.0x^9999");
		Polynomial answer = testPoly.add(testPoly2);
		assertEquals("5.0x^1000000 + 3.0x^9999", answer.toString());
		assertEquals(1000000, answer.getDegree());
		assertEquals(3.0, answer.getCoefficient(9999), 0.0000001);

	}

	// tests add method as a subtraction with negatives
	@Test
	public void testAddAsSubtraction() {
		Polynomial testPoly = new Polynomial("4.0x^2 + 3.0x + 2.0");
		Polynomial testPoly2 = new Polynomial("-3.0x^2 - 2.0x - 1.0");
		Polynomial answer = testPoly.add(testPoly2);
		assertEquals("x^2 + x + 1.0", answer.toString());
		assertEquals(2, answer.getDegree());
		assertEquals(1.0, answer.getCoefficient(2), 0.0000001);
	}

	// tests add method when original polynomial is negative
	@Test
	public void testAddOriginalPolyNegative() {
		Polynomial testPoly = new Polynomial("-3.0x^2 - 2.0x - 1.0");
		Polynomial testPoly2 = new Polynomial("4.0x^2 + 3.0x + 2.0");
		Polynomial answer = testPoly.add(testPoly2);
		assertEquals("x^2 + x + 1.0", answer.toString());
		assertEquals(2, answer.getDegree());
		assertEquals(1.0, answer.getCoefficient(2), 0.0000001);
	}

	// tests add method without overlap between two polynomials
	@Test
	public void testAddNoOverlap() {
		Polynomial testPoly = new Polynomial("4.0x^6 + 3.0x^5 + 2.0x^3");
		Polynomial testPoly2 = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial answer = testPoly.add(testPoly2);
		assertEquals("4.0x^6 + 3.0x^5 + 2.0x^3 + 3.0x^2 + 2.0x + 1.0", answer.toString());
		assertEquals(6, answer.getDegree());
		assertEquals(4.0, answer.getCoefficient(6), 0.0000001);
	}

	// test for subtract method
	// Simple subtract test
	@Test
	public void testSubtract() {
		Polynomial testPoly = new Polynomial("8.0x^2 + 5.0x + 4.0");
		Polynomial testPoly2 = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial answer = testPoly.subtract(testPoly2);
		assertEquals("5.0x^2 + 3.0x + 3.0", answer.toString());
		assertEquals(2, answer.getDegree());
		assertEquals(5.0, answer.getCoefficient(2), 0.0000001);
	}

	// tests to make sure subtract is an accessor, doesn't change the two subtracted
	// polynomials
	@Test
	public void testSubtractIsAccessor() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial testPoly2 = new Polynomial("8.0x^2 + 5.0x + 4.0");
		Polynomial answer = testPoly.subtract(testPoly2);
		assertEquals("3.0x^2 + 2.0x + 1.0", testPoly.toString());
		assertEquals(2, testPoly.getDegree());
		assertEquals(3.0, testPoly.getCoefficient(2), 0.0000001);

		assertEquals("8.0x^2 + 5.0x + 4.0", testPoly2.toString());
		assertEquals(2, testPoly2.getDegree());
		assertEquals(8.0, testPoly2.getCoefficient(2), 0.0000001);
	}

	// test to make sure subtract method won't take null polynomial
	@Test(expected = IllegalArgumentException.class)
	public void testSubtractNullInput() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial testPoly2 = null;
		Polynomial answer = testPoly.subtract(testPoly2);
	}

	// tests subtracting 0 polynomial
	@Test
	public void testSubtractZero() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial testPoly2 = new Polynomial();
		Polynomial answer = testPoly.subtract(testPoly2);
		assertEquals("3.0x^2 + 2.0x + 1.0", answer.toString());
		assertEquals(3.0, answer.getCoefficient(2), 0.0000001);
		assertEquals(2, answer.getDegree());
	}

	// tests subtracting from 0 polynomial
	@Test
	public void testSubtractFromZero() {
		Polynomial testPoly2 = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial testPoly = new Polynomial();
		Polynomial answer = testPoly.subtract(testPoly2);
		assertEquals("-3.0x^2 - 2.0x - 1.0", answer.toString());
		assertEquals(-3.0, answer.getCoefficient(2), 0.0000001);
		assertEquals(2, answer.getDegree());
	}

	// tests subtract with large coefficients
	@Test
	public void testSubtractLargeCoefficient() {
		Polynomial testPoly = new Polynomial("5000000.0x^2 + 5000000.0x + 5000000.0");
		Polynomial testPoly2 = new Polynomial("1000000.0x^2 + 1000000.0x + 1000000.0");
		Polynomial answer = testPoly.subtract(testPoly2);
		assertEquals("4000000.0x^2 + 4000000.0x + 4000000.0", answer.toString());
		assertEquals(2, answer.getDegree());
		assertEquals(4000000.0, answer.getCoefficient(2), 0.0000001);

	}

	// tests subtract with large powers
	@Test
	public void testSubtractLargePowers() {
		Polynomial testPoly = new Polynomial("3.0x^1000000 + 2.0x^9999");
		Polynomial testPoly2 = new Polynomial("2.0x^1000000 + 1.0x^9999");
		Polynomial answer = testPoly.subtract(testPoly2);
		assertEquals("x^1000000 + x^9999", answer.toString());
		assertEquals(1000000, answer.getDegree());
		assertEquals(1.0, answer.getCoefficient(9999), 0.0000001);

	}

	// tests subtract method with long polynomials(high degrees)
	@Test
	public void testSubtractLongPoly() {
		Polynomial testPoly = new Polynomial(
				"100.0x^100 + 99.0x^99 + 98.0x^98 + 97.0x^97 + 96.0x^96 + 95.0x^95 + 94.0x^94 + 93.0x^93 + 92.0x^92 + 91.0x^91 + 90.0x^90 + 89.0x^89 + 88.0x^88 + 87.0x^87 + 86.0x^86 + 85.0x^85 + 84.0x^84 + 83.0x^83 + 82.0x^82 + 81.0x^81 + 80.0x^80 + 79.0x^79 + 78.0x^78 + 77.0x^77 + 76.0x^76 + 75.0x^75 + 74.0x^74 + 73.0x^73 + 72.0x^72 + 71.0x^71 + 70.0x^70 + 69.0x^69 + 68.0x^68 + 67.0x^67 + 66.0x^66 + 65.0x^65 + 64.0x^64 + 63.0x^63 + 62.0x^62 + 61.0x^61 + 60.0x^60 + 59.0x^59 + 58.0x^58 + 57.0x^57 + 56.0x^56 + 55.0x^55 + 54.0x^54 + 53.0x^53 + 52.0x^52 + 51.0x^51 + 50.0x^50 + 49.0x^49 + 48.0x^48 + 47.0x^47 + 46.0x^46 + 45.0x^45 + 44.0x^44 + 43.0x^43 + 42.0x^42 + 41.0x^41 + 40.0x^40 + 39.0x^39 + 38.0x^38 + 37.0x^37 + 36.0x^36 + 35.0x^35 + 34.0x^34 + 33.0x^33 + 32.0x^32 + 31.0x^31 + 30.0x^30 + 29.0x^29 + 28.0x^28 + 27.0x^27 + 26.0x^26 + 25.0x^25 + 24.0x^24 + 23.0x^23 + 22.0x^22 + 21.0x^21 + 20.0x^20 + 19.0x^19 + 18.0x^18 + 17.0x^17 + 16.0x^16 + 15.0x^15 + 14.0x^14 + 13.0x^13 + 12.0x^12 + 11.0x^11 + 10.0x^10 + 9.0x^9 + 8.0x^8 + 7.0x^7 + 6.0x^6 + 5.0x^5 + 4.0x^4 + 3.0x^3 + 2.0x^2 + 1.0x + 1.0");
		Polynomial testPoly2 = new Polynomial(
				"101.0x^100 + 100.0x^99 + 99.0x^98 + 98.0x^97 + 97.0x^96 + 96.0x^95 + 95.0x^94 + 94.0x^93 + 93.0x^92 + 92.0x^91 + 91.0x^90 + 90.0x^89 + 89.0x^88 + 88.0x^87 + 87.0x^86 + 86.0x^85 + 85.0x^84 + 84.0x^83 + 83.0x^82 + 82.0x^81 + 81.0x^80 + 80.0x^79 + 79.0x^78 + 78.0x^77 + 77.0x^76 + 76.0x^75 + 75.0x^74 + 74.0x^73 + 73.0x^72 + 72.0x^71 + 71.0x^70 + 70.0x^69 + 69.0x^68 + 68.0x^67 + 67.0x^66 + 66.0x^65 + 65.0x^64 + 64.0x^63 + 63.0x^62 + 62.0x^61 + 61.0x^60 + 60.0x^59 + 59.0x^58 + 58.0x^57 + 57.0x^56 + 56.0x^55 + 55.0x^54 + 54.0x^53 + 53.0x^52 + 52.0x^51 + 51.0x^50 + 50.0x^49 + 49.0x^48 + 48.0x^47 + 47.0x^46 + 46.0x^45 + 45.0x^44 + 44.0x^43 + 43.0x^42 + 42.0x^41 + 41.0x^40 + 40.0x^39 + 39.0x^38 + 38.0x^37 + 37.0x^36 + 36.0x^35 + 35.0x^34 + 34.0x^33 + 33.0x^32 + 32.0x^31 + 31.0x^30 + 30.0x^29 + 29.0x^28 + 28.0x^27 + 27.0x^26 + 26.0x^25 + 25.0x^24 + 24.0x^23 + 23.0x^22 + 22.0x^21 + 21.0x^20 + 20.0x^19 + 19.0x^18 + 18.0x^17 + 17.0x^16 + 16.0x^15 + 15.0x^14 + 14.0x^13 + 13.0x^12 + 12.0x^11 + 11.0x^10 + 10.0x^9 + 9.0x^8 + 8.0x^7 + 7.0x^6 + 6.0x^5 + 5.0x^4 + 4.0x^3 + 3.0x^2 + 2.0x");
		Polynomial answer = testPoly2.subtract(testPoly);
		assertEquals(
				"x^100 + x^99 + x^98 + x^97 + x^96 + x^95 + x^94 + x^93 + x^92 + x^91 + x^90 + x^89 + x^88 + x^87 + x^86 + x^85 + x^84 + x^83 + x^82 + x^81 + x^80 + x^79 + x^78 + x^77 + x^76 + x^75 + x^74 + x^73 + x^72 + x^71 + x^70 + x^69 + x^68 + x^67 + x^66 + x^65 + x^64 + x^63 + x^62 + x^61 + x^60 + x^59 + x^58 + x^57 + x^56 + x^55 + x^54 + x^53 + x^52 + x^51 + x^50 + x^49 + x^48 + x^47 + x^46 + x^45 + x^44 + x^43 + x^42 + x^41 + x^40 + x^39 + x^38 + x^37 + x^36 + x^35 + x^34 + x^33 + x^32 + x^31 + x^30 + x^29 + x^28 + x^27 + x^26 + x^25 + x^24 + x^23 + x^22 + x^21 + x^20 + x^19 + x^18 + x^17 + x^16 + x^15 + x^14 + x^13 + x^12 + x^11 + x^10 + x^9 + x^8 + x^7 + x^6 + x^5 + x^4 + x^3 + x^2 + x - 1.0",
				answer.toString());
		assertEquals(100, answer.getDegree());
		assertEquals(1, answer.getCoefficient(8), 0.0000001);
	}

	// tests subtract method with negative provided polynomial
	@Test
	public void testSubtractNegativeProvidedPoly() {
		Polynomial testPoly = new Polynomial("4.0x^2 + 3.0x + 2.0");
		Polynomial testPoly2 = new Polynomial("-3.0x^2 - 2.0x - 1.0");
		Polynomial answer = testPoly.subtract(testPoly2);
		assertEquals("7.0x^2 + 5.0x + 3.0", answer.toString());
		assertEquals(2, answer.getDegree());
		assertEquals(7.0, answer.getCoefficient(2), 0.0000001);
	}

	// tests subtract method when original polynomial contains negatives
	@Test
	public void testSubtractNegativeOriginalPoly() {
		Polynomial testPoly = new Polynomial("-3.0x^2 - 2.0x - 1.0");
		Polynomial testPoly2 = new Polynomial("4.0x^2 + 3.0x + 2.0");
		Polynomial answer = testPoly.subtract(testPoly2);
		assertEquals("-7.0x^2 - 5.0x - 3.0", answer.toString());
		assertEquals(2, answer.getDegree());
		assertEquals(-7.0, answer.getCoefficient(2), 0.0000001);
	}

	// tests subtract method when both polynomials contain negatives
	@Test
	public void testSubtractBothOriginalPoly() {
		Polynomial testPoly = new Polynomial("-3.0x^2 - 2.0x - 1.0");
		Polynomial testPoly2 = new Polynomial("-4.0x^2 - 3.0x - 2.0");
		Polynomial answer = testPoly.subtract(testPoly2);
		assertEquals("x^2 + x + 1.0", answer.toString());
		assertEquals(2, answer.getDegree());
		assertEquals(1.0, answer.getCoefficient(2), 0.0000001);
	}

	// tests subtract method without either polynomial overlap
	@Test
	public void testSubtractNoOverlap() {
		Polynomial testPoly = new Polynomial("4.0x^6 + 3.0x^5 + 2.0x^3");
		Polynomial testPoly2 = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial answer = testPoly.subtract(testPoly2);
		assertEquals("4.0x^6 + 3.0x^5 + 2.0x^3 - 3.0x^2 - 2.0x - 1.0", answer.toString());
		assertEquals(6, answer.getDegree());
		assertEquals(-1.0, answer.getCoefficient(0), 0.0000001);
	}

	@Test(expected = NullPointerException.class)
	public void testSubtractNull() {
		Polynomial testPoly = null;
		Polynomial testPoly2 = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial answer = testPoly.subtract(testPoly2);
	}

	// tests for negate method
	// simple negate test
	@Test
	public void testNegate() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial answer = testPoly.negate();
		assertEquals("-3.0x^2 - 2.0x - 1.0", answer.toString());
		assertEquals(2, answer.getDegree());
		assertEquals(-3.0, answer.getCoefficient(2), 0.0000001);
	}

	// tests to see if negate changes original polynomial
	@Test
	public void testNegateIsAccessor() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial answer = testPoly.negate();
		assertEquals("3.0x^2 + 2.0x + 1.0", testPoly.toString());
		assertEquals(2, testPoly.getDegree());
		assertEquals(3.0, testPoly.getCoefficient(2), 0.0000001);
	}

	// tests if null polynomial is negated
	@Test(expected = NullPointerException.class)
	public void testNegateNull() {
		Polynomial testPoly = null;
		Polynomial answer = testPoly.negate();
	}

	// tests negate of zero polynomial
	@Test
	public void testNegateZeroPoly() {
		Polynomial testPoly = new Polynomial();
		Polynomial answer = testPoly.negate();
		assertEquals("0", answer.toString());
		assertEquals(-1, answer.getDegree());
		assertEquals(0.0, answer.getCoefficient(0), 0.0000001);
	}

	// tests negate of a negative polynomial
	@Test
	public void testNegateNegativePoly() {
		Polynomial testPoly = new Polynomial("-3.0x^2 - 2.0x - 1.0");
		Polynomial answer = testPoly.negate();
		assertEquals("3.0x^2 + 2.0x + 1.0", answer.toString());
		assertEquals(2, answer.getDegree());
		assertEquals(3.0, answer.getCoefficient(2), 0.0000001);
	}

	// tests negate of polynomial with large coefficients
	@Test
	public void testNegateLargeCoefficient() {
		Polynomial testPoly = new Polynomial("5000000.0x^2 + 5000000.0x + 5000000.0");
		Polynomial answer = testPoly.negate();
		assertEquals("-5000000.0x^2 - 5000000.0x - 5000000.0", answer.toString());
		assertEquals(2, answer.getDegree());
		assertEquals(-5000000.0, answer.getCoefficient(2), 0.0000001);
	}

	// tests negate of long polynomial
	@Test
	public void testNegateLongPoly() {
		Polynomial testPoly = new Polynomial(
				"100.0x^100 + 99.0x^99 + 98.0x^98 + 97.0x^97 + 96.0x^96 + 95.0x^95 + 94.0x^94 + 93.0x^93 + 92.0x^92 + 91.0x^91 + 90.0x^90 + 89.0x^89 + 88.0x^88 + 87.0x^87 + 86.0x^86 + 85.0x^85 + 84.0x^84 + 83.0x^83 + 82.0x^82 + 81.0x^81 + 80.0x^80 + 79.0x^79 + 78.0x^78 + 77.0x^77 + 76.0x^76 + 75.0x^75 + 74.0x^74 + 73.0x^73 + 72.0x^72 + 71.0x^71 + 70.0x^70 + 69.0x^69 + 68.0x^68 + 67.0x^67 + 66.0x^66 + 65.0x^65 + 64.0x^64 + 63.0x^63 + 62.0x^62 + 61.0x^61 + 60.0x^60 + 59.0x^59 + 58.0x^58 + 57.0x^57 + 56.0x^56 + 55.0x^55 + 54.0x^54 + 53.0x^53 + 52.0x^52 + 51.0x^51 + 50.0x^50 + 49.0x^49 + 48.0x^48 + 47.0x^47 + 46.0x^46 + 45.0x^45 + 44.0x^44 + 43.0x^43 + 42.0x^42 + 41.0x^41 + 40.0x^40 + 39.0x^39 + 38.0x^38 + 37.0x^37 + 36.0x^36 + 35.0x^35 + 34.0x^34 + 33.0x^33 + 32.0x^32 + 31.0x^31 + 30.0x^30 + 29.0x^29 + 28.0x^28 + 27.0x^27 + 26.0x^26 + 25.0x^25 + 24.0x^24 + 23.0x^23 + 22.0x^22 + 21.0x^21 + 20.0x^20 + 19.0x^19 + 18.0x^18 + 17.0x^17 + 16.0x^16 + 15.0x^15 + 14.0x^14 + 13.0x^13 + 12.0x^12 + 11.0x^11 + 10.0x^10 + 9.0x^9 + 8.0x^8 + 7.0x^7 + 6.0x^6 + 5.0x^5 + 4.0x^4 + 3.0x^3 + 2.0x^2 + 1.0x + 1.0");
		Polynomial answer = testPoly.negate();
		assertEquals(
				"-100.0x^100 - 99.0x^99 - 98.0x^98 - 97.0x^97 - 96.0x^96 - 95.0x^95 - 94.0x^94 - 93.0x^93 - 92.0x^92 - 91.0x^91 - 90.0x^90 - 89.0x^89 - 88.0x^88 - 87.0x^87 - 86.0x^86 - 85.0x^85 - 84.0x^84 - 83.0x^83 - 82.0x^82 - 81.0x^81 - 80.0x^80 - 79.0x^79 - 78.0x^78 - 77.0x^77 - 76.0x^76 - 75.0x^75 - 74.0x^74 - 73.0x^73 - 72.0x^72 - 71.0x^71 - 70.0x^70 - 69.0x^69 - 68.0x^68 - 67.0x^67 - 66.0x^66 - 65.0x^65 - 64.0x^64 - 63.0x^63 - 62.0x^62 - 61.0x^61 - 60.0x^60 - 59.0x^59 - 58.0x^58 - 57.0x^57 - 56.0x^56 - 55.0x^55 - 54.0x^54 - 53.0x^53 - 52.0x^52 - 51.0x^51 - 50.0x^50 - 49.0x^49 - 48.0x^48 - 47.0x^47 - 46.0x^46 - 45.0x^45 - 44.0x^44 - 43.0x^43 - 42.0x^42 - 41.0x^41 - 40.0x^40 - 39.0x^39 - 38.0x^38 - 37.0x^37 - 36.0x^36 - 35.0x^35 - 34.0x^34 - 33.0x^33 - 32.0x^32 - 31.0x^31 - 30.0x^30 - 29.0x^29 - 28.0x^28 - 27.0x^27 - 26.0x^26 - 25.0x^25 - 24.0x^24 - 23.0x^23 - 22.0x^22 - 21.0x^21 - 20.0x^20 - 19.0x^19 - 18.0x^18 - 17.0x^17 - 16.0x^16 - 15.0x^15 - 14.0x^14 - 13.0x^13 - 12.0x^12 - 11.0x^11 - 10.0x^10 - 9.0x^9 - 8.0x^8 - 7.0x^7 - 6.0x^6 - 5.0x^5 - 4.0x^4 - 3.0x^3 - 2.0x^2 - x - 1.0",
				answer.toString());
		assertEquals(100, answer.getDegree());
		assertEquals(-100.0, answer.getCoefficient(100), 0.0000001);
	}

	// tests for getValue method
	// simple test for getValue
	@Test
	public void testGetValue() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		assertEquals(6.0, testPoly.getValue(1.0), 0.0000001);
	}

	// tests getValue with zero polynomial
	@Test
	public void testGetValueZeroPoly() {
		Polynomial testPoly = new Polynomial();
		assertEquals(0.0, testPoly.getValue(100.0), 0.0000001);
	}

	// tests getValue with x as zero
	@Test
	public void testGetValueXIsZero() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		assertEquals(1.0, testPoly.getValue(0.0), 0.0000001);
	}

	// tests getValue with x is small
	@Test
	public void testGetValueXIsSmall() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		assertEquals(1.00002, testPoly.getValue(0.00001), 0.0000001);
	}

	// tests getValue with x is large
	@Test
	public void testGetValueXIsLarge() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		assertEquals(3000002000000.00, testPoly.getValue(1000000), 1);
	}

	// tests getValue with large coefficients
	@Test
	public void testGetValueLargeCoefficient() {
		Polynomial testPoly = new Polynomial("5000000.0x^2 + 5000000.0x + 5000000.0");
		assertEquals(65000000, testPoly.getValue(3), 0.01);
	}

	// tests getValue with long polynomial
	@Test
	public void testGetValueLargePolynomial() {
		Polynomial testPoly = new Polynomial(
				"100.0x^100 + 99.0x^99 + 98.0x^98 + 97.0x^97 + 96.0x^96 + 95.0x^95 + 94.0x^94 + 93.0x^93 + 92.0x^92 + 91.0x^91 + 90.0x^90 + 89.0x^89 + 88.0x^88 + 87.0x^87 + 86.0x^86 + 85.0x^85 + 84.0x^84 + 83.0x^83 + 82.0x^82 + 81.0x^81 + 80.0x^80 + 79.0x^79 + 78.0x^78 + 77.0x^77 + 76.0x^76 + 75.0x^75 + 74.0x^74 + 73.0x^73 + 72.0x^72 + 71.0x^71 + 70.0x^70 + 69.0x^69 + 68.0x^68 + 67.0x^67 + 66.0x^66 + 65.0x^65 + 64.0x^64 + 63.0x^63 + 62.0x^62 + 61.0x^61 + 60.0x^60 + 59.0x^59 + 58.0x^58 + 57.0x^57 + 56.0x^56 + 55.0x^55 + 54.0x^54 + 53.0x^53 + 52.0x^52 + 51.0x^51 + 50.0x^50 + 49.0x^49 + 48.0x^48 + 47.0x^47 + 46.0x^46 + 45.0x^45 + 44.0x^44 + 43.0x^43 + 42.0x^42 + 41.0x^41 + 40.0x^40 + 39.0x^39 + 38.0x^38 + 37.0x^37 + 36.0x^36 + 35.0x^35 + 34.0x^34 + 33.0x^33 + 32.0x^32 + 31.0x^31 + 30.0x^30 + 29.0x^29 + 28.0x^28 + 27.0x^27 + 26.0x^26 + 25.0x^25 + 24.0x^24 + 23.0x^23 + 22.0x^22 + 21.0x^21 + 20.0x^20 + 19.0x^19 + 18.0x^18 + 17.0x^17 + 16.0x^16 + 15.0x^15 + 14.0x^14 + 13.0x^13 + 12.0x^12 + 11.0x^11 + 10.0x^10 + 9.0x^9 + 8.0x^8 + 7.0x^7 + 6.0x^6 + 5.0x^5 + 4.0x^4 + 3.0x^3 + 2.0x^2 + 1.0x + 1.0");
		assertEquals(5051.00, testPoly.getValue(1), 0.0000001);
	}

	// tests getValue with negative x
	@Test
	public void testGetValueNegativeX() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		assertEquals(66.0, testPoly.getValue(-5), 0.0000001);
	}

	// tests getValue with negative polynomial
	@Test
	public void testGetValueNegativePoly() {
		Polynomial testPoly = new Polynomial("-3.0x^2 - 2.0x - 1.0");
		assertEquals(-86.0, testPoly.getValue(5), 0.0000001);
	}

	// tests getValue with null polynomial
	@Test(expected = NullPointerException.class)
	public void testGetValueNullPoly() {
		Polynomial testPoly = null;
		testPoly.getValue(1.0);

	}

	// tests getValue is accessor
	@Test
	public void testGetValueIsAccessor() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		testPoly.getValue(1.0);
		assertEquals("3.0x^2 + 2.0x + 1.0", testPoly.toString());
		assertEquals(2, testPoly.getDegree());

	}

	// tests for getDerivative method
	// simple test for getDerivative
	@Test
	public void testGetDerivative() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial answer = testPoly.getDerivative();
		assertEquals("6.0x + 2.0", answer.toString());
		assertEquals(1, answer.getDegree());
		assertEquals(6.0, answer.getCoefficient(1), 0.0000001);
	}

	// tests getDerivative of the zero polynomial
	@Test
	public void testGetDerivativeZeroPolynomial() {
		Polynomial testPoly = new Polynomial();
		Polynomial answer = testPoly.getDerivative();
		assertEquals("0", answer.toString());
		assertEquals(-1, answer.getDegree());
	}

	// tests getDerivative of the negative polynomial
	@Test
	public void testGetDerivativeNegativePolynomial() {
		Polynomial testPoly = new Polynomial("-3.0x^2 - 2.0x - 1.0");
		Polynomial answer = testPoly.getDerivative();
		assertEquals("-6.0x - 2.0", answer.toString());
		assertEquals(1, answer.getDegree());
		assertEquals(-6.0, answer.getCoefficient(1), 0.0000001);
	}

	// tests getDerivative of polynomial with large coefficients
	@Test
	public void testGetDerivativeLargeCoefficient() {
		Polynomial testPoly = new Polynomial("5000000.0x^2 + 5000000.0x + 5000000.0");
		Polynomial answer = testPoly.getDerivative();
		assertEquals("1.0E7x + 5000000.0", answer.toString());
		assertEquals(1, answer.getDegree());
		assertEquals(5000000.0, answer.getCoefficient(0), 0.0001);

	}

	// tests getDerivative if polynomial is null
	@Test(expected = NullPointerException.class)
	public void testGetDerivativeNull() {
		Polynomial testPoly = null;
		Polynomial answer = testPoly.getDerivative();
	}

	// tests getDerivative of polynomial with large degree
	@Test
	public void testGetDerivativeLargeDegree() {
		Polynomial testPoly = new Polynomial("3.0x^1000000 + 2.0x^999999 + 2.0x");
		Polynomial answer = testPoly.getDerivative();
		assertEquals("3000000.0x^999999 + 1999998.0x^999998 + 2.0", answer.toString());
		assertEquals(999999, answer.getDegree());
		assertEquals(2.0, answer.getCoefficient(0), 0.0000001);
	}

	// tests to ensure getDerivative doesn't alter original polynomial
	@Test
	public void testGetDerivativeIsAccessor() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		Polynomial answer = testPoly.getDerivative();
		assertEquals(2, testPoly.getDegree());
		assertEquals("3.0x^2 + 2.0x + 1.0", testPoly.toString());
		assertEquals(1.0, testPoly.getCoefficient(0), 0.0000001);
	}

	// tests for constructors
	// tests to constructor's IllegalArgumentException throwing
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorBadString() {
		Polynomial testPoly = new Polynomial("This should cause failure");
	}

	// simple constructor test
	@Test
	public void testConstructor() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 2.0x + 1.0");
		assertEquals(2, testPoly.getDegree());
		assertEquals("3.0x^2 + 2.0x + 1.0", testPoly.toString());
	}

	// constructor test where only a constant is specified
	@Test
	public void testConstructorOnlyConstant() {
		Polynomial testPoly = new Polynomial("1.0");
		assertEquals(0, testPoly.getDegree());
		assertEquals("1.0", testPoly.toString());
	}

	// tests the constructor with many decimal places
	@Test
	public void testConstructorDecimals() {
		Polynomial testPoly = new Polynomial("3.93853x^2 + 2.12894732x + 1.3289742");
		assertEquals(2, testPoly.getDegree());
		assertEquals("3.93853x^2 + 2.12894732x + 1.3289742", testPoly.toString());
	}

	// tests the constructor with no doubles
	@Test
	public void testConstructorNoDoubles() {
		Polynomial testPoly = new Polynomial("x^2 + x");
		assertEquals(2, testPoly.getDegree());
		assertEquals("x^2 + x", testPoly.toString());
	}

	// tests constructor with repeating powers
	@Test
	public void testConstructorSameDegrees() {
		Polynomial testPoly = new Polynomial("3.0x^2 + 3.0x^2 + 1.5x + 1.5x");
		assertEquals(2, testPoly.getDegree());
		assertEquals("6.0x^2 + 3.0x", testPoly.toString());
	}

	// tests when illegal argument is surrounded by legal inputs
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorIllegalArgumentInMiddle() {
		Polynomial testPoly = new Polynomial("3.0x^2 + THISSHOULDFAIL + 1.5x");
	}

	// tests generating empty polynomial with the zero string
	@Test
	public void testConstructorZero() {
		Polynomial testPoly = new Polynomial("0.0");
		assertEquals(-1, testPoly.getDegree());
		assertEquals("0", testPoly.toString());
	}

	// tests generating empty polynomial with many 0s raised to powers
	@Test
	public void testConstructorZeroWithPowers() {
		Polynomial testPoly = new Polynomial("0.0x^53 + 0.0x^4 + 0.00");
		assertEquals(-1, testPoly.getDegree());
		assertEquals("0", testPoly.toString());
	}

	// tests generating polynomial with empty string
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorEmptyString() {
		Polynomial testPoly = new Polynomial("");
	}

	// tests generating with blank string
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorWhiteSpaceString() {
		Polynomial testPoly = new Polynomial("               ");
	}

	// tests empty constructor
	@Test
	public void testEmptyConstructor() {
		Polynomial testPoly = new Polynomial();
		assertEquals(-1, testPoly.getDegree());
		assertEquals("0", testPoly.toString());
	}

}
