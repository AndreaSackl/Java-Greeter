package at.fhj.iit;

public class Main {

	public static void main(String[] args) {
		
		IAmGreet g = new IAmGreet("Andy Sackl");

		System.out.println(g.SayHello());
		System.out.println(g.SayGoodbye());

	}

}
