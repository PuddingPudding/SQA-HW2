
public class Tree 
{
	Node root;
	
	public void setRoot(Node input)
	{
		this.root = input;
	}
	
	public int getSum()
	{
		return this.root.getSum();
	}
	
	public static void main(String args[])
	{
		Node a = new Node(10);
		Node b = new Node(10);
		Node c = new Node(10);
		Node d = new Node(10);
		
		a.add(b);
		a.add(c);
		a.add(d);
		System.out.println(a.getSum() );
		
		Tree tree = new Tree();
		tree.setRoot(b);
		System.out.println(tree.getSum() );
		
		a.add(c);
		System.out.println(a.getSum() );
	}
}
