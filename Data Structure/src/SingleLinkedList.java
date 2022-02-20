
public class SingleLinkedList {


	class Node
	{
		Object data;
		Node next;

		Node(Object data)
		{
			this.data = data;
		}
	}

	Node head, tail;

	boolean add(Object data) //add last
	{
		Node n = new Node(data);

		if(head == null)
		{
			head = tail = n;
			return true;
		}

		tail.next = n;
		tail = n;
		return true;
	}

	boolean addFirst(Object data)
	{
		Node n = new Node(data);

		if(head == null)
		{
			head = tail = n;
			return true;
		}

		n.next = head;
		head = n;
		return true;
	}


	boolean addIndex(Object data, int in)
	{
		if(in == 0)
		{
			return addFirst(data);

		}


		/* For LinkedList Traversal*/
		Node t = head;
		while(t!=null && in>1)
		{
			t = t.next;
			in--;
		}

		if(tail == null)
		{
			return false;
		}

		Node n = new Node(data);
		n.next = t.next;
		t.next = n;
		return true;	
	}

	Object deleteFirst()
	{
		if(head == null)
		{
			System.out.println("List is empty");
			return null;
		}

		Object data = head.data;
		head = head.next;
		return data;
	}

	Object deleteLast()
	{
		if(head == null)
		{
			System.out.println("List is empty");
			return null;
		}

		Object data = tail.data;

		Node temp = head;
		while(temp.next != tail)
		{
			temp = temp.next;
		}

		temp.next = null;
		tail = temp;
		return data;

	}

	Object delete(int in)
	{
		if(in == 0)
		{
			return deleteFirst();
		}

		Node temp = head;
		while(temp!= null && in>1)
		{
			temp = temp.next.next;
			in--;
		}

		if(temp != null && temp.next != null)
		{
			Object data = temp.next.data;
			temp.next = temp.next.next;

			if(temp.next == null)
			{
				tail = temp;
			}

			return data;
		}

		else
		{	
			System.out.println("Index is not in range");
		}	return null;

	}


	/*-- Delete multiple element between two nodes  --*/
	void delete(int start, int last) 
	{
		int x = last - start;
		Node temp = head;
	}

	public String toString()
	{
		String st = "";
		Node temp = head;

		while(temp != null)
		{
			st = st + temp.data;

			if(temp.next != null)
			{
				st = st + "-->" ;
			}	

			temp = temp.next;
		}
		return st;
	}


	public void reverse()
	{
		Node temp1 = head, temp2 = null;

		while(temp1 != null)
		{
			Node temp3 = temp1.next;

			temp1.next = temp2;
			temp2 = temp1;
			temp1 = temp3;
		}

		tail = head;
		head = temp2;
	}





}
