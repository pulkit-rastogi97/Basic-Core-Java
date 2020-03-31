
public class VariableStack implements Stack{
      
	private int size;
    private int n=0;
    int count;
    public VariableStack(int size)
    {
       this.size=size;
    }
    int[] arr = new int[size];
    
    @Override
    public void push(int i) 
    {
        if(count<=0)
           {
        	int temp=size;
            size+=10;           
             int[] newArr=new int[size];
             for(int k=0; k<temp; k++)
             {
            	 newArr[k]=arr[k];
             }
             arr=newArr;
             arr[temp]=i;
             n++;   
            }
           else
           	{
        	   arr[n]=i;
               n++;
               count--;
             }

      }
    
                @Override
                public int pop() {

                    int temp = arr[n-1];

                    arr[n-1]=0;

                    return arr[n-1];

    }
}