package hospital;

public class DocList {
	DNode head, tail;

	public DocList() {
		tail = null;
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void InsertD(Doctor Doctor) {
		DNode newnode = new DNode(Doctor);
		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			head.next = newnode;
			newnode.previous = head;
			head = newnode;
		}
	}

	public Doctor SearchById(String Id) {
		DNode current = head;
		while (current != null) {
			if (current.doctor.getId().equals(Id)) {
				return current.doctor;
			}
			current = current.previous;
		}
		return null;

	}

	public Doctor SearchByContact(String Contact) {
		DNode current = head;
		while (current != null) {
			if (current.doctor.getContact().equals(Contact)) {
				return current.doctor;
			}
			current = current.previous;
		}
		return null;

	}

	public void printDoctorData() {
		DNode current = head;
		int count = 0;
		while (current != null) {
			count++;
			System.out.println("Doctor "+count + " : " + current.doctor.toString());
			current = current.previous;
		}

	}

	public Doctor getAtIndex(int index) {

		DNode current = head;

		for (int i = 0; i < index; i++) {

			current = current.previous;
		}

		return current.doctor;
	}

	public int size() {
		DNode current = head;
		int count = 0;
		while (current != null) {
			count++;
			current = current.previous;
		}
		return count;
	}
}
