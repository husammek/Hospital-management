package hospital;

public class CheckUpList {
	CheckUpNode head, tail;

	public CheckUpList() {
		this.head = null;
		this.tail = null;
	}

	public void Enqueue(CheckUp cu) {

		CheckUpNode newnode = new CheckUpNode(cu);
		if (head == null || tail == null) {
			head = newnode;
			tail = newnode;

		} else if (cu.getPriority() < cu.getPriority()) {
			head.next = newnode;
			newnode.previous = head;
			head = newnode;

		} else if (tail.cu.getPriority() >= cu.getPriority()) {
			tail.previous = newnode;
			newnode.next = tail;
			tail = newnode;

		} else {
			CheckUpNode current = tail;
			while (current != null) {
				if (current.cu.getPriority() >= cu.getPriority()) {
					break;
				}
				current = current.next;
			}
			newnode.next = current;
			newnode.previous = current.previous;
			current.previous.next = newnode;
			current.previous = newnode;

		}
	}

	public CheckUp dequeue() {
		if (head == null) {
			return null;
		}
		CheckUpNode checkup = head;
		head = head.next;
		return checkup.cu;

	}

	public void print() {
		CheckUpNode current = head;
		while (current != null) {
			System.out.println(current.cu.getPriority() + "    " + current.cu.getPriority());
			current = current.previous;

		}

	}

	public Patient getPatient(int index) {
		CheckUpNode current = head;
		int i = 0;
		while (current != null) {
			if (index == i) {
				break;
			}
			i++;
			current = current.previous;
		}
		return current.cu.getPatient();
	}

	public void addRecomendation(int index, String rec) {
		CheckUpNode current = head;
		int i = 0;
		while (current != null) {
			if (index == i) {
				current.cu.setRecomendation(rec);
				break;

			}
			i++;
			current = current.previous;
		}

	}
	public int size() {
		CheckUpNode current = head;
		int count = 0;
		while (current != null) {
			count++;
			current = current.previous;
		}
		return count;
	}
}
