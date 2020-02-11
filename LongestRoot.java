public class LongestRoot {

	public static void main(String[] args) {
		BinaryTreeNode node1=new BinaryTreeNode(0);
		BinaryTreeNode node2=new BinaryTreeNode(20);
		BinaryTreeNode node3=new BinaryTreeNode(20);
		BinaryTreeNode node4=new BinaryTreeNode(0);
		BinaryTreeNode node5=new BinaryTreeNode(20);
		BinaryTreeNode node6=new BinaryTreeNode(0);
		
		node1.setLeft(node3);
		node4.setRight(node5);
		node5.setLeft(node2);
		node6.setLeft(node1);
		node5.setRight(node6);
		System.out.println(longestRoot(node6));
		}
	
	public static int longestRoot(BinaryTreeNode tree) {
		if(tree==null) {
			return 0;
		}
		if(tree.getLeft()==null&&tree.getRight()==null) {
			return 1;
		}
		return Math.max(1+longestRoot(tree.getLeft()),1+longestRoot(tree.getRight()));
	}

}
