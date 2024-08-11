package hospital;

public class Doctor {
	private String Name, Contact, Specialty;

	String Id;

	private int fees;

	public Doctor() {
		Id = "";
		Name = "";
		Contact = "";
		Specialty = "";
		fees = 0;
	}

	public Doctor(String id, String name, String contact, String specialty, int fees) {
		this.Id = id;
		this.Name = name;
		this.Contact = contact;
		this.Specialty = specialty;
		this.fees = fees;
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

	public String getSpecialty() {
		return Specialty;
	}

	public void setSpecialty(String specialty) {
		Specialty = specialty;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String toString() {
		return "Doctor [Id=" + Id + ", Name=" + Name + ", Contact=" + Contact + ", Specialty=" + Specialty + ", fees="
				+ fees + "]";
	}
	

}
