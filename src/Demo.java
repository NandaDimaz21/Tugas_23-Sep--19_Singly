
public class Demo {
	public static void printListInt(SinglyLinkedList<Integer> list) {
		Node<Integer> temp = list.head;
		while(temp != null) {
			System.out.print(temp.getElement().intValue()+"  ");
			temp=temp.getNext();
		}
		System.out.println("");
	}
	
	public static void printListDouble(SinglyLinkedList<Double> list) {
		Node<Double> temp = list.head;
		while(temp != null) {
			System.out.print(temp.getElement().doubleValue()+"  ");
			temp=temp.getNext();
		}
		System.out.println("");
	}
	
	public static void printListChar(SinglyLinkedList<Character> list) {
		Node<Character> temp = list.head;
		while(temp != null) {
			System.out.print(temp.getElement()+"  ");
			temp=temp.getNext();
		}
		System.out.println("");
	}
	
	public static void printListString(SinglyLinkedList<String> list) {
		Node<String> temp = list.head;
		while(temp != null) {
			System.out.print(temp.getElement()+"  ");
			temp=temp.getNext();
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
		list1.addFirst(10);
		printListInt(list1);
		list1.addFirst(15);
		list1.addFirst(16);
		list1.addLast(20);
		printListInt(list1);
		list1.remove(3);
		printListInt(list1);
		System.out.println("Elemen index ke-1 = "+list1.isiList(1));
		
		System.out.println();
		
		SinglyLinkedList<Double> list2 = new SinglyLinkedList<>();
		list2.addFirst(10.0);
		printListDouble(list2);
		list2.addFirst(15.0);
		list2.addFirst(16.0);
		list2.addLast(20.0);
		printListDouble(list2);
		list2.remove(3);
		printListDouble(list2);
		
		System.out.println();
		
		SinglyLinkedList<Character> list3 = new SinglyLinkedList<>();
		list3.addFirst('A');
		printListChar(list3);
		list3.addFirst('B');
		printListChar(list3);
		list3.remove(1);
		list3.addFirst('C');
		list3.addFirst('D');
		printListChar(list3);
		list3.removeFirst();
		list3.addFirst('Z');
		list3.addFirst('Y');
		list3.addFirst('X');
		printListChar(list3);
		
		System.out.println();
		
		SinglyLinkedList<String> list4 = new SinglyLinkedList<>();
		list4.addFirst("A");
		printListString(list4);
		list4.addFirst("B");
		printListString(list4);
		list4.remove(1);
		list4.addFirst("C");
		list4.addFirst("D");
		printListString(list4);
		list4.removeFirst();
		list4.addFirst("Z");
		list4.addFirst("Y");
		list4.addFirst("X");
		printListString(list4);
	}
}
