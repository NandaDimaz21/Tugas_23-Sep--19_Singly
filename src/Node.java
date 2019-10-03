
public class Node<E>{
	E element;
	Node<E> next;
	
	Node(E e,Node<E> n){
		element = e;
		next = n;
	}
	
	E getElement() {
		return element;
	}
	
	Node<E> getNext(){
		return next;
	}
	
	void setNext(Node<E> n) {
		next = n;
	}
}
