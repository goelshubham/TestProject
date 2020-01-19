package programs;

public class SortedLinkedListDriver {

	public static void main(String[] args) {
		
		SortedLinkedList list = new SortedLinkedList();
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(0);
		list.add(13);
		list.add(16);
		list.add(4);
		list.add(33);
		
		System.out.println(list.toString());

	}

}
