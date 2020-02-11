
public class BinaryTreeNode {
	
	private int value;
	private BinaryTreeNode right;
	private BinaryTreeNode left;
	public BinaryTreeNode(int value, BinaryTreeNode right, BinaryTreeNode left) {
		this.value = value;
		this.right = right;
		this.left = left;
	}
	
	public BinaryTreeNode(int value) {
		this.value = value;
		this.right=null;
		this.left=null;
	}

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	
	
}
