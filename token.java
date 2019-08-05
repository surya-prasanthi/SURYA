import java.util.*;
class tokoen
{
public static void main(String ar[])
{
//String  myname="surya";
//StringTokenizer obj=new StringTokenizer("surya");
//StringTokenizer obj=new StringTokenizer("surya,pra", "," "santhi");
StringTokenizer obj=new StringTokenizer("surya,prasanthi","  ",true);
//int c=obj.countTokens();
String c=obj.nextToken();
//int c=obj.hasMoreTokens();
System.out.print(c);
}
}
	