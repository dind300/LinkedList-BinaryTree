
public class MergeTwoLinkedList {

	public static void main(String[] args) {
		LinkListNode node1=new LinkListNode(10);
		LinkListNode node2=new LinkListNode(9,node1);
		LinkListNode node3=new LinkListNode(7,node2);
		LinkListNode node4=new LinkListNode(4,node3);
		LinkListNode node5=new LinkListNode(1,node4);
		LinkListNode node6=new LinkListNode(12);
		LinkListNode node7=new LinkListNode(11,node6);
		LinkListNode node8=new LinkListNode(8,node7);
		LinkListNode node9=new LinkListNode(5,node8);
		LinkListNode node10=new LinkListNode(3,node9);
		LinkListNode node11=new LinkListNode();
		node11=mergeTwoLinkList(node10, node5);
		while(node11!=null) {
			System.out.print(node11.getValue()+" ");
			node11=node11.getNext();
		}

	}
	
	public static LinkListNode mergeTwoLinkList(LinkListNode node1,LinkListNode node2) {
		if(node1==null&&node2==null) {
			return null;
		}
		if(node1==null) {
			LinkListNode newNodes=new LinkListNode();
			newNodes.setNext(mergeTwoLinkList(node1, node2.getNext()));
			newNodes.setValue(node2.getValue());
			return newNodes;
		}
		if(node2==null) {
			LinkListNode newNodes=new LinkListNode();
			newNodes.setNext(mergeTwoLinkList(node1.getNext(), node2));
			newNodes.setValue(node1.getValue());
			return newNodes;
		}
		if(node1.getValue()>node2.getValue()) {
			LinkListNode newNodes=new LinkListNode();
			newNodes.setValue(node2.getValue());
			newNodes.setNext(mergeTwoLinkList(node1, node2.getNext()));
			return newNodes;
		}
		else {
			LinkListNode newNodes=new LinkListNode();
			newNodes.setValue(node1.getValue());
			newNodes.setNext(mergeTwoLinkList(node1.getNext(), node2));
			return newNodes;
		}
	}

}
