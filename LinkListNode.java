
public class LinkListNode {	
	private int value;
	private LinkListNode next;
	
	public LinkListNode() {
		this.value=0;
		this.next=null;
	}
	public LinkListNode(int value, LinkListNode next) {
		this.value = value;
		this.next = next;
	}
	public LinkListNode(int value) {
		this.value = value;
		this.next=null;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public LinkListNode getNext() {
		return next;
	}


	public void setNext(LinkListNode next) {
		this.next = next;
	}
	

}
