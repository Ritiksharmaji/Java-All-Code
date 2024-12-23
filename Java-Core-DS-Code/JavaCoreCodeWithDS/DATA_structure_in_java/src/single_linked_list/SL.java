package single_linked_list;

public class SL {
	private Node head;
	private Node tail;
	private int size;
	public SL()
	{
		this.size=0;
	}

}
 class Node{
	private int value;
	private Node next;
	public Node(int value)
	{
		this.value=value;
	}
	public Node(int value,Node next)
	{
		this.value=value;
		this.next=next;
		
	}
}
