package morehiding;

public class ResultOfEidShopping {

	public static void main(String[] args) {
		EidShopping ed = new EidShopping();
		
		ed.setDress("yes");
		ed.setShoe("yes");
		
		System.out.println("Did you buy your eid dress mimi?");
		System.out.println(ed.getDress());
		System.out.println("Did you buy your eid shoe mimi?");
		System.out.println(ed.getShoe());

	}

}
