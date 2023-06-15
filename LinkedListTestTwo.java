Class Node
{
	public int data;
	public Node next;

	// Not mandatory or ideal
	Node
	{

	}

	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class LinkedListTestTwo
{
	private Node head;

	public void tailInsert(int data)
	{
		if (head == null)
		{
			head = new Node(data);
			return;
		}

		Node lastNode = head;

		while (lastNode.next != null)
		{
			lastNode = lastNode.next;
		}

		lastNode.next = new Node(data);

	}

	public void headInsert(int data)
	{
		if (head == null)
		{
			head = new Node(data);
			return;
		}

		Node firstNode = new Node(data);

		firstNode.next = head;
		head = firstNode;

	}

	public void printReverse()
	{
		if (head == null)
		{
			return;
		}

		Node current = head;
		Node prev = null;

		while (current != null)
		{
			Node next = current.next; // save the next node
			current.next = prev; // reverse the link of the current node
			prev = current; // move prev to the current node
			current = next; // move current to the next node
		}

		head = prev;  // set the new head to the last node (previously the tail)
		current = head;  // start from the new head

		while (current != null)
		{
			System.out.print(current.data + " ");  // print the data of each node
			current = current.next;
		}

		System.out.println();

	}

	public void deleteNth(int n)
	{
		if (head == null || n < 0)
		{
			return;
		}

		// Deleting the head
		if(n == 0)
		{
			head = head.next;
			return;
		}

		Node current = head;
		Node save = null;

		for (int i = 0; current != null && i < n; i++)
		{
			save = current; // saving the (i - 1)th node
			current = current.next; // move to the ith next
		}

		save.next = current.next;

	}

	// public void deleteEveryOther()
	// {
	// 	if (head == null)
	// 	{
	// 		return;
	// 	}

	// 	Node current = head;
	// 	Node save = null;

	// 	while (current != null)
	// 	{
	// 		save = current;
	// 		current = current.next;
	// 		save.next = current.next;
	// 	}

	// }


}
