package core;

import junit.framework.TestCase;

public class ArithSolverTest extends TestCase {
	public void testAdd() {
		ArithSolver solver = new ArithSolver();
		assertEquals(4.0,solver.add(2,2));
	}
	
	public void testAddNegs() {
		ArithSolver solver = new ArithSolver();
		assertEquals(-4.0,solver.add(-2,-2));
		assertEquals(-15.0,solver.add(-10,-5));
		assertEquals(3.0,solver.add(4,-1));
	}
	
	public void testAddDec() {
		ArithSolver solver = new ArithSolver();
		assertEquals(1.2,solver.add(1,.2));
		assertEquals(-4.0,solver.add(-2,-2));
		assertNotNull(solver.add(9.44, 3.33));
	}
	
	public void testSubtract() {
		ArithSolver solver = new ArithSolver();
		assertEquals(2.0,solver.subtract(4,2));
	}
	
	public void testMultiply() {
		ArithSolver solver = new ArithSolver();
		assertEquals(16.0,solver.multiply(8,2));
	}
	
	public void testDivide() {
		ArithSolver solver = new ArithSolver();
		assertEquals(3.0,solver.divide(9,3));
	}
	
	public void testModulus() {
		ArithSolver solver = new ArithSolver();
		assertEquals(1.0,solver.modulus(5,2));
	}
}
