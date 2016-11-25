import java.util.ArrayList;
import java.util.Iterator;
class demoiterator
{
public static void main(String arg[])
{
ArrayList al2=new ArrayList();
al2.add("aa");
al2.add("ab");
al2.add("acc");
al2.add("av");
al2.add("av");
al2.add("am");
Iterator it=al2.iterator();
while(it.hasNext())
{
String s=(String)it.next();
System.out.println(s);
}
}
}