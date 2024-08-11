package hospital;

public class DNode {
	Doctor doctor;
	DNode previous, next;

	public DNode(Doctor doctor) {
		this.doctor = doctor;
		this.previous = null;
		this.next = null;
	}

}
