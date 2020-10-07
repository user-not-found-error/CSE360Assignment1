package cse360assignment02;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddingMachine mycal = new AddingMachine();
		
		System.out.println("Initial:");
		System.out.println(mycal.getTotal());
		System.out.println(mycal.toString());
		System.out.println();
		mycal.add(4);
		mycal.subtract(2);
		mycal.add(5);
		
		System.out.println("After calculation: ");
		System.out.println(mycal.getTotal());
		System.out.println(mycal.toString());
		System.out.println();
		
		System.out.println("After clear: ");
		mycal.clear();
		System.out.println(mycal.getTotal());
		System.out.println(mycal.toString());
	}

}
