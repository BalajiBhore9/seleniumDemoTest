package JavaProgram;

/**
 * Hello world!
 *
 */
public class arraySort 
{
    public static void main( String[] args )
    {
    	int[] arr = {10,22,45,78,9,45};
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    			int temp = 0;
    			if(arr[i]>arr[j])
    			{
    				temp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = temp;
    			}
    		}
    		  System.out.println( arr[i]);
    	}
    }
}
