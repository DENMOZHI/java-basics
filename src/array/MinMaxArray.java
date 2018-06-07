package array;

public class MinMaxArray {
	public static int getmax(int[]inputArray)
	{
		int MaxValue = inputArray[0];
		for(int i=1;i< inputArray.length;i++)
		{
			if(inputArray[i]>MaxValue)
			{
				MaxValue=inputArray[i];
			}
		}
		return MaxValue;
	}
	public static  int getMin(int[]inputArray)
	{
		int MinValue=inputArray[0];
		for(int i=1;i<inputArray.length;i++)
		{
			if(inputArray[i]<MinValue)
			{
				MinValue=inputArray[i];
			}
		}
		return MinValue;
	}
public static int getmin(int[]inputArray)
{
	int minValue=inputArray[0];
	for(int i=1;i<inputArray.length;i++)
	{
		if(inputArray[i]<minValue)
		{
			minValue=inputArray[i];
		}
	}
	return minValue;
}
public static void main(String[]args)
{
	int array[]=new int[] {3,4,5,2,33,24,2};
	int max=getmax(array);
	System.out.println("Maximum Value ="+max);
	int min=getMin(array);
	System.out.println("Minimum Value="+min);
			
	}
}
