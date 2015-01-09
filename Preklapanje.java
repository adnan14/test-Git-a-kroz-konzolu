package poglavlje7;

// Ilustruje preklapanje metoda.
class PrimjerPreklapanja {
	void test() {
		System.out.println("Bez parametara");
	}
	
	// Preklopljena metoda test() s jednim cjelobrojnim parametrom.
	void test(int a) {
		System.out.println("a: " + a);
	}
	
	// Preklopljena metoda test() s dva cjelobrojna parametra.
	void test(int a, int b) {
		System.out.println("a i b: " + a + " " + b);
	}
	
	// Preklopljena metoda test() s parametrom tipa double
	double test(double a) {
		System.out.println("realan broj dvostruke tacnosti a: " + a);
		return a*a;
	}
}

class Preklapanje {
	public static void main(String[] args) {
		PrimjerPreklapanja ob = new PrimjerPreklapanja();
		double rezultat;
		
		// pozivanje svih verzija metode test()
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		rezultat = ob.test(123.25);
		System.out.println("Rezultat metode ob.test(123.25): " + rezultat);
	}
}