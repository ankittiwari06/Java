import java.io.File;
import java.io.FileOutputStream;
class FileWriting
{
public static void main(String args[])
{
try
{
String msg="Hello Navi";
File obj = new File("F://java coding/Ramasoft/examplefile.txt");
FileOutputStream fop = new FileOutputStream(obj);
if(!obj.exists())
{
obj.createNewFile();
}
byte content[]= msg.getBytes();
fop.write(content);
fop.flush();
fop.close();
}
catch(Exception e)
{
System.out.println("done");
}
}
}