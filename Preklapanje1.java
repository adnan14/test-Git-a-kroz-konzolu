package poglavlje7;

// Automatska konverzija tipova vazi i pri preklapanju
class PrimjerPreklapanja1 {
	void test() {
		System.out.println("Bez parametara");
	}
		
	// Preklopljena metoda test() sa dva cjelobrojna parametra.
	void test(int a, int b) {
		System.out.println("a i b: " + a + " " + b);
	}
	
	// Preklopljena metoda test() s parametrom tipa double
	void test(double a) {
		System.out.println("Nalazim se u metodi test(double) a: " + a);
	}
}

class Preklapanje1 {
	public static void main(String[] args) {
		PrimjerPreklapanja1 ob = new PrimjerPreklapanja1();
		int i =88;
		
		ob.test();
		ob.test(10, 20);

		ob.test(i); // ovo ce pozvati test(double)
		ob.test(123.2);  // ovo ce pozvati test(double)
	}
}