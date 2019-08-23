package model.data_structures;

public class Node<Item>
{
	private Item value;

	private Node<Item> next; 	

	public Node(Item pValue, Node<Item> pNext)
	{
		this.value = pValue;
		this.next = pNext;
	}

	public Item getValue()
	{
		return value;
	}

	public void enlazarSiguiente(Node<Item> n)
	{
		next=n;
	}

	public Node<Item> getNextNode()
	{
		return next;
	}
}
