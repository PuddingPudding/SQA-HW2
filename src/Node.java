
public class Node 
{
	private Node next;
	public int num;
	public Node()
	{
		this(0);
	}
	public Node(int input)
	{
		num = input;
		next = null;
	}
	
	public void add(Node input)
	{
		assert input != this; //檢查這個放進來的新資料是否就是自己，以避免產生循環
		if(this.next == null)
		{
			this.next = input;
		}
		else
		{
			this.next.add(input);
		}
	}
	
	public int getSum()
	{
		int output = 0;
		Node temp = this;
		while(temp != null)
		{
			output += temp.num;
			temp = temp.next;
		}
		return output;
	}
}
