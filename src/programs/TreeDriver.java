package programs;

public class TreeDriver {

	public static void main(String[] args) {
		BinarySearchTree list = new BinarySearchTree();
		
		list.add(50);
		list.add(30);
		list.add(10);
		list.add(0);
		list.add(80);
		list.add(60);
		
		System.out.println(list.toString());

	}

}
