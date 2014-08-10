
public class LinkedList1 {
		
	private class Node {
			Object element;
			Node next;
			
			Node(Object element, Node prevNode) {
				this.element = element;
				prevNode.next = this;
			}
			Node(Object element) {
				this.element = element;
				next = null;
			}
		}
		
		private Node head;
		private Node tail;
		private int count;
		
		public LinkedList1() {
			this.head = null;
			this.tail = null;
			this.count = 0;
		}
		
		public void add(Object item) {
			if(head == null) {
				head = new Node(item);
				tail = head;
			} else {
			  Node newNode = new Node(item, tail);
			  tail = newNode;
			}
			count++;
		}
		
		public Object remove(int index) {
			if(index<0 || index>=count) {
				throw new IndexOutOfBoundsException ("Invalid index: " + index);
			}
			
			int currentIndex = 0;
			Node currentNode = head;
			Node prevNode = null;
			while(currentIndex < index) {
				prevNode = currentNode;
				currentNode = currentNode.next;
				currentIndex++;
			}
			count--; 
			if (count==0) {
				head = null;
				tail = null;
			}
			else if (prevNode == null) {
				head = currentNode.next;
			}
			else {
				prevNode.next = currentNode.next;
			}
			return currentNode.element;
		}
		
		public int remove(Object item) {
			
			int currentIndex = 0;
			Node currentNode = head;
			Node prevNode = null;
			while (currentNode != null) {
				if ((currentNode.element!=null && 
					 currentNode.element.equals(item)) || 
					 (currentNode.element == null) && (item==null)) {
					break;
				}
				prevNode = currentNode;
				currentNode = currentNode.next;
				currentIndex++;
			}
			
			if (currentNode != null) {
				count--;
				if (count==0) {
					head = null;
					tail = null;
				} else if (prevNode == null) {
					head = currentNode.next;
				} else {
					prevNode.next = currentNode.next;
				}
				return currentIndex;
			} else {
				return -1;
			}
		}
		
		public int indexOf(Object item) {
			int index = 0;
			Node current = head;
			while (current != null) {
				if ((current.element != null && current.element.equals(item))
					 || (current.element==null) && (item==null)) {
					return index;
				}
				current = current.next;
				index++;
			}
			return -1;
		}
		
		public boolean cointains(Object item) {
			int index = indexOf(item);
			boolean found = (index != -1);
			return found;
		}
		
		public Object elementAt(int index) {
			if (index<0 || index>=count) {
				throw new IndexOutOfBoundsException("Invalid index: " + index);
			}
			Node currentNode = this.head;
			for (int i=0; i<index; i++) {
				currentNode = currentNode.next;
			}
			return currentNode.element;
		}
		
		public int getLength() {
			return count;
		}

}
