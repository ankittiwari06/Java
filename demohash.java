import java.util.HashSet;
import java.util.Vector;
class demohash
{
public static void main(String...ar)
{
HashSet hs=new HashSet();
hs.add('v');
hs.add('i');
hs.add('v');
hs.add('e');
hs.add('k');
hs.add(22);

Vector v= new Vector();
v.add('n');
v.add('a');
v.add('v');
v.add('i');

hs.addAll(v);

System.out.println(hs);
}
}
