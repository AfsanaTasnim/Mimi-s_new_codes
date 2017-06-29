package hiding;

public class ShowHiddenData {

	public static void main(String[] args) {
		HideData h = new HideData();
		h.setName("Afsana");
		h.setEmail("abc@gmail.com");
		h.setCell(1234);
		
		System.out.println("Dear " + h.getName() + ", Your email id is " + h.getEmail() + " and your cell number is " + h.getCell() + ".");

	}

}
