package hospital;

public class PatientList {
	PNode head, tail;

	public PatientList() {
		tail = null;
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void InsertP(Patient Patient) {
		PNode newnode = new PNode(Patient);
		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			head.next = newnode;
			newnode.previous = head;
			head = newnode;
		}
	}

	public Patient SearchById(String Id) {
		PNode current = head;
		while (current != null) {
			if (current.patient.getId().equals(Id)) {
				return current.patient;
			}
			current = current.previous;
		}
		return null;

	}

	public Patient SearchByContact(String Contact) {
		PNode current = head;
		while (current != null) {
			if (current.patient.getContact().equals(Contact)) {
				return current.patient;
			}
			current = current.previous;
		}
		return null;

	}

	public void printPatientData() {
		PNode current = head;
		int count = 0;
		while (current != null) {
			count++;
			System.out.println("Patient " + count + " " + " information :" + current.patient.toString());
			current = current.previous;
		}

	}

	public int size() {
		PNode current = head;
		int count = 0;
		while (current != null) {
			count++;
			current = current.previous;
		}
		return count;
	}
}
