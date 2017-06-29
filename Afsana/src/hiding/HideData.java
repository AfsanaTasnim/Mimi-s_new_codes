package hiding;

//Encapsulation is also known as data hiding.
//Encapsulation hides the variables of a class from other classes.
/*In encapsulation, the variables of a class can be accessed only through the methods of the 
current class.*/

//In encapsulation, the variables of a class should be declared as private.
//Getter and setter methods should be there.


/*Value can be set through setter method
Value can be accessed through getter method*/


public class HideData {
	private String name;
	private String email;
	private int cell;
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getCell() {
		return cell;
	}
	
	public void setName(String yourName) {
		name = yourName;
	}
	
	public void setEmail(String yourEmail) {
		email = yourEmail;
	}
	
	public void setCell(int yourCell) {
		cell = yourCell;
	}
}
