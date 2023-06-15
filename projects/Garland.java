// Bryan Aneyro Hernandez
// COP 3330
// Spring 2023
// br867228

public class Garland
{
	private Node head; // Reference to the top-left node in this garland.
	private int size; // The number of strings currently in this garland.
	private Node tail; // Reference to the top-right node in this garland.

	Garland()
	{

	}

	Garland(String [] strings)
	{
		if (strings == null || strings.length == 0) 
		{
			return;
		}

	// Data needed to construct the Linked List.
	head = new Node(strings[0].charAt(0));
	Node currStringNode = head;
	Node currCharNode = head;
	int numStrings = 1;

	// Loop through and store each string.
	for (int i = 0; i < strings.length; i++)
	{
		String s = strings[i];
		currCharNode = currStringNode;

		for (int j = 1; j < s.length(); j++)
		{
			// Convert string to char, and store them in nodes.
			char c = s.charAt(j);
			Node newNode = new Node(c);

			currCharNode.down = newNode;
			currCharNode = newNode;
		}

		// Traversing and adding a new string next to the other.
		if (i < strings.length - 1)
		{
			Node nextStringNode = new Node(strings[i + 1].charAt(0));
			currStringNode.next = nextStringNode;
			currStringNode = nextStringNode;
			numStrings++;
		}
	}

	size = numStrings;

	}

	public static Node stringToLinkedList(String s)
	{
		Garland gar = new Garland();

		// If the input string is empty or null, return null.
		if (s == null || s.isEmpty())
		{
			return null;
		}

		// Create the head node of the linked list.
		Node head = new Node(s.charAt(0));
		Node tail = head;
		gar.size++;

		// Loop through the characters in the string and create a new node for each one.
		for (int i = 1; i < s.length(); i++)
		{
			Node newNode = new Node(s.charAt(i));
			tail.down = newNode;
			tail = newNode;
		}

		// Return the head node of the linked list.
		return head;

	}

	public static String linkedListToString(Node head)
	{
		Garland gar = new Garland();

		if (head == null)
		{
			return "";
		}

		Node current = head;
		int count = 0;

		// Count the number of nodes in the linked list
		while (current != null)
		{
			current = current.down;
			count++;
		}

		// Create a character array of the correct size
		char [] myChar = new char [count];

		// Copy characters from the linked list to the character array
		int index = 0;
		current = head;
		while (current != null)
		{
			myChar[index] = current.data;
			current = current.down;
			index++;
		}

		// Create a new string from the character array and return it
		String str = new String (myChar);

		return str;

	}

	public void addString(String s)
	{
		if (s == null || s.isEmpty())
		{
			return;
		}

		Node current = stringToLinkedList(s);

		// If the linked list is currently empty, set the head and tail to the new node.
		if (head == null)
		{
			head = current;
			tail = current;
		}
		// If the linked list already has nodes, add the new node at the end and set the tail to the new node.
		else
		{
			tail.next = current;
			tail = current;
		}

		size++;

	}

	public Node getNode(int index)
	{
		if (index < 0 || index >= size)
		{
			return null;
		}

		Node current = head;

		// Traverse through the list to get to the needed node.
		for (int i = 0; i < index; i++) 
		{
			current = current.next;
		}

		return current;
	}

	public String getString(int index)
	{
		if (index < 0 || index > size - 1)
		{
			return null;
		}

		Node current = head;

		// Traverse the linked list horizontally to the desired index
		for (int i = 0; i < index; i++)
		{
			current = current.next;
		}

		// Convert the node's linked list to a string and return it
		return linkedListToString(current);

	}

	public boolean removeString(int index)
	{
		if (index < 0 || index > size - 1)
		{
			return false;
		}

		// Check if index is the head of list. If so, remove it.
		if (index == 0)
		{
			head = head.next;
			size--;
			return true;
		}

		Node current = head;
		int count = 0;

		// Traverse to the given node based on the index.
		while (current != null && count < index - 1)
		{
			current = current.next;
			count++;	
		}

		// Checks whether the given index is equal to the last index in the list. If so, remove it.
		if (index == size - 1)
		{
			tail.next = null;
		}
		// If the index is not the last index, then go to the next node.
		else
		{
			current.next = current.next.next;
		}

		size--;

		return true;

	}

	public boolean printString(int index)
	{
		if (index < 0 || index > size - 1)
		{
			System.out.println("(invalid index)");
			return false;
		}

		// Use str to store the return string of getString(), and then print it.
		String str = getString(index);

		System.out.println(str);

		return true;
	}

	public void printStrings()
	{
		if (size == 0) 
		{
			System.out.println("(empty list)");
			return;
		}

		Node curr = head;
		int currStringIndex = 0;

		// Traverse through the list and for each node, use getString() to print the Garland.
		while (curr != null)
		{
			System.out.print(curr.data);

			if (curr.down != null)
			{
				Node currDown = curr.down;

				while (currDown != null)
				{
					System.out.print(currDown.data);
					currDown = currDown.down;
				}
			}

			curr = curr.next;
			System.out.println();
		}
	}

	public Node head()
	{
		return head;
	}

	public int size()
	{
		return size;
	}

	public static double difficultyRating()
	{
		return 4.0;
	}

	public static double hoursSpent()
	{
		return 20.0;
	}


}
