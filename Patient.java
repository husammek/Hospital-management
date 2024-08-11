package hospital;

public class Patient {
	private String Name, Contact;
	private String Id;

	public Patient() {
		this.Id = "";
		this.Name = " ";
		this.Contact = " ";
	}

	public Patient(String id, String name, String contact) {

		this.Id = id;
		this.Name = name;
		this.Contact = contact;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public String toString() {
		return " [Id = " + Id + ", Name = " + Name + ", Contact = " + Contact + "]";
	}

}