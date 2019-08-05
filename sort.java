//sorting of array elements
class sort
{
	public static void main(String ar[])
	{
	   int a[]={8,3,9,5,2};
	int i=0,j=1;
	int t=a[i];
	for(i=0;i<a.length;i++)
	{ 
	for(j=1;j<a.length-1;j++)
	{
                      if(a[i]>a[j])
	{
	     t=a[i];
	     a[i]=a[j];
	    a[j]=t;
                   }
	}        System.out.println(t);
}}}
	