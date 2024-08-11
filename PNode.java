package hospital;

public class PNode {
	PNode previous, next;
	Patient patient;

	public PNode() {

	}

	public PNode(Patient patient) {
		this.previous = null;
		this.next = null;
		this.patient = patient;
	}

}
