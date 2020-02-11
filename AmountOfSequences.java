
public class AmountOfSequences {

	public static void main(String[] args) {
		LinkListNode node1=new LinkListNode(1);
		LinkListNode node2=new LinkListNode(1,node1);
		LinkListNode node3=new LinkListNode(2,node2);
		LinkListNode node4=new LinkListNode(1,node3);
		LinkListNode node5=new LinkListNode(1,node4);
		LinkListNode node6=new LinkListNode(3,node5);
		LinkListNode node7=new LinkListNode(1,node6);
		LinkListNode node8=new LinkListNode(1,node7);
		LinkListNode node9=new LinkListNode(3,node8);
		LinkListNode node10=new LinkListNode(1,node9);
		LinkListNode node11=new LinkListNode(1,node10);
		System.out.print(amountOfNumSequences(node11,1));
	}
	public static int amountOfNumSequences(LinkListNode node,int num) {
		boolean flag=false;
		int counter=0;
		while(node.getNext()!=null) {
			if(node.getValue()==num) {
			  if(node.getValue()==node.getNext().getValue()) {
			    if(!flag) {
				counter++;
				}
				flag=true;
				}
				else {
				flag=false;
				}
				}
			node=node.getNext();
			
		}
		return counter;
	}

}
