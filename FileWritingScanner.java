import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;


class FileWritingScanner
{
public static void main(String args[])
{
try
{
Scanner sc = new Scanner(System.in);
String msg=sc.nextLine();
File fr = new File("F://java coding/Ramasoft/ankit.txt");
FileOutputStream fop = new FileOutputStream(fr);
if(!fr.exists())
{
fr.createNewFile();
}
byte data[] = msg.getBytes();
fop.write(data);
fop.flush();
fop.close();
System.out.println("Done");
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}