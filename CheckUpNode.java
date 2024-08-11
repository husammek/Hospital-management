package hospital;

public class CheckUpNode {
	CheckUp cu;
	CheckUpNode next, previous;

	public CheckUpNode(CheckUp cu) {

		this.cu = cu;
		this.next = null;
		this.previous = null;
	}

}
