
public class SinglyLinkedList<E>{
	Node<E> head=null;
	Node<E> tail=null;
	private int size=0;
	
	SinglyLinkedList() {};
	int size() {return size;}
	boolean isEmpty() {return size==0;}
	
	E first() {
		if(isEmpty()) return null;
		return head.getElement();
	}
	
	E last() {
		if(isEmpty()) return null;
		return tail.getElement();
	}
	
	void addFirst(E e) {
		head = new Node<>(e, head);
		if(size == 0) tail=head;
		size++;
	}
	
	void addLast(E e) {
		Node<E> newNode = new Node<>(e, null);
		if(isEmpty()){
			head=newNode;
		} else {
			tail.setNext(newNode);
		}
		tail=newNode;
		size++;
	}
	
	E removeFirst() {
		if(isEmpty()) return null;
		E deleted = head.getElement();
		head=head.getNext();
		size--;
		if(size == 0) {
			tail=null;
		}
		return deleted;
	}
	
	E removeLast() {
		Node<E> temp = head;
		Node<E> deleted = tail;
		if(isEmpty()) return null;
		while(deleted.getNext() != null) {
			temp=deleted;
			deleted=deleted.getNext();
		}
		if(deleted == head) {
			head=null;
		} else {
			temp.setNext(null);
		}
		return deleted.getElement();
	}
	
	void remove(int pos) {
		if(isEmpty()) return;
		Node<E> temp = head;
		
		if(pos == 0) {
			head=temp.getNext();
		}
		
		for(int i=0;temp != null && i<pos-1;i++) {
			temp=temp.getNext();
		}
		
		if(temp == null || temp.getNext() == null) return;
		
		Node<E> next = temp.getNext().getNext();
		temp.setNext(next);
	}
	
	E isiList(int pos) {
		Node<E> temp = head;
		int count=0;
		
		while(temp != null) {
			if(count == pos)
				return temp.getElement();
			count++;
			temp=temp.getNext();
		}
		
		assert(false);
		return null;
	}
}