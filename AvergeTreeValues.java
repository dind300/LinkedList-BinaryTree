
public class AvergeTreeValues {

	public static void main(String[] args) {
		BinaryTreeNode node1=new BinaryTreeNode(0);
		BinaryTreeNode node2=new BinaryTreeNode(20);
		BinaryTreeNode node3=new BinaryTreeNode(20);
		BinaryTreeNode node4=new BinaryTreeNode(0);
		BinaryTreeNode node5=new BinaryTreeNode(20);
		BinaryTreeNode node6=new BinaryTreeNode(0);
		
		node4.setLeft(node3);
		node4.setRight(node5);
		node5.setLeft(node2);
		node3.setLeft(node1);
		node5.setRight(node6);
		System.out.println(avergeTreeValue(node4));

	}
	
	public static int avergeTreeValue(BinaryTreeNode tree) {
		if(tree==null) {
			return 0;
		}
		return sumOfValueTree(tree)/AmountOfRoots(tree);
	}

	public static int AmountOfRoots(BinaryTreeNode tree) {
		if(tree==null) {
			return 0;
		}
		if(tree.getLeft()==null && tree.getRight()==null) {
			return 1;
		}
		return 1+AmountOfRoots(tree.getLeft())+AmountOfRoots(tree.getRight());


	}

	public static int sumOfValueTree(BinaryTreeNode tree) {
		if(tree==null) {
			return 0;
		}
		if(tree.getLeft()==null && tree.getRight()==null) {
			return tree.getValue();
		}
		return tree.getValue()+sumOfValueTree(tree.getLeft())+sumOfValueTree(tree.getRight());
	}

}
