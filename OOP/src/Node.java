
public class Node {
	private Node left;
	private Node right;
	private String data;
	
	public Node start;
	public Node end;
	public Node current;
	public Node(Node element1, Node element2){
		start=element1;
		end=element2;	
	}
	public void printelements(){
		System.out.println("{" + start + "," + end + "}");
	}
	public Node getHead(){
		return start;
	}
	public Node getTail(){
		return end;
	}
	public Node get(){
		return current;
	}
	public boolean isEmpty(){
		return start==null;
	}
	public Node(){
		start=null;
	}
	public Node remove(){
		Node t = start;
		start=start.right;
		return t;
	}
	public void add(Node element1, Node element2){
		Node t = new Node(element1,element2);
		t.right = start;
		start=t;
	}
}
