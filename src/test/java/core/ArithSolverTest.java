package core;

import junit.framework.TestCase;

public class ArithSolverTest extends TestCase {
	public void testAdd() {
		ArithSolver solver = new ArithSolver();
		assertEquals(4,solver.add(2,2));
	}
	
	public void testSubtract() {
		ArithSolver solver = new ArithSolver();
		assertEquals(2,solver.subtract(4,2));
	}
	
	public void testMultiply() {
		ArithSolver solver = new ArithSolver();
		assertEquals(16,solver.subtract(8,2));
	}
	
	public void testDivide() {
		ArithSolver solver = new ArithSolver();
		assertEquals(3,solver.subtract(9,3));
	}
	
	public void testModulus() {
		ArithSolver solver = new ArithSolver();
		assertEquals(1,solver.modulus(5,2));
	}
}
