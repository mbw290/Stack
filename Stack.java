//class from text
public class Stack 
{
	//data has been changed to an array of doubles
	private double[] data;
	private int top;
	private int size;
	public Stack()
	{
		top=-1;
		size=100;
		data = new double [100];
	}
	public Stack(int n)
	{
		top = -1;
		size = n;
		data=new double[n];
	}
	
	public boolean push(double newData)
	{
		if(top == size - 1)
			return false;
		else
		{
			top = top+1;
			data[top] = newData;
			return true;
		}
	}
	public Double pop()
	{
	int topLocation;
	if(top == -1)
		return null;
	else
	{
		topLocation = top;
		top = top-1;
		return data[topLocation];
	}
	}
	public void showAll()
	{
		for (int i=top; i >= 0; i--)
		{
			System.out.println(data[i]);
		}
	}
}