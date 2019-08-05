import java.util.*;
class buffer
{
public static void main(String ar[])
{
StringBuffer obj=new StringBuffer("welcome");

System.out.println(obj.replace(1,3,"co"));
System.out.println(obj.substring(1,3));
System.out.println(obj.length());
System.out.println(obj.capacity());
System.out.println(obj.insert(6,"co"));
System.out.print(obj.delete(1,4));

}
}