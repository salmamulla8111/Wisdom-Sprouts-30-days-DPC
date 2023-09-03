package DPC;   
class Node {
	int data;
	Node left, right;

	public Node(int d)
	{
		data = d;
		left = right = null;
	}
}
class Challenge30 {
	Node root;
	int getLevelUtil(Node node, int data, int level)
	{
		if (node == null)
			return 0;
		if (node.data == data)
			return level;
		int downlevel
			= getLevelUtil(node.left, data, level + 1);
		if (downlevel != 0)
			return downlevel;

		downlevel
			= getLevelUtil(node.right, data, level + 1);
		return downlevel;
	}
	int getLevel(Node node, int data)
	{
		return getLevelUtil(node, data, 1);
	}
	public static void main(String[] args)
	{
		Challenge30 tree = new Challenge30();
		tree.root = new Node(3);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(4);
		for (int x = 1; x <= 5; x++) {
			int level = tree.getLevel(tree.root, x);
			if (level != 0)
				System.out.println(
					"Level of " + x + " is "
					+ tree.getLevel(tree.root, x));
			else
				System.out.println(
					x + " is not present in tree");
		}
	}
}