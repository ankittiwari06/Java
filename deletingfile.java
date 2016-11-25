import java.io.File;
import java.io.FileOutputStream;
class deletingfile
{
public static void main(String args[])
{
try
{
File obj = new File("F://java coding/Ramasoft/ankit.txt");
if(obj.exists())
{
obj.delete();
System.out.println("done");
}
else
{
System.out.println("File not found");
}
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}