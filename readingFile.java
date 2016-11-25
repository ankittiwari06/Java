import java.io.FileReader;
import java.io.BufferedReader;

class readingFile
{
public static void main(String args[])
{
try
{
String s = null;
FileReader fr = new FileReader("F://java coding/Ramasoft/ankit.txt");
BufferedReader br = new BufferedReader(fr);

while((s=br.readLine())!=null)
{
System.out.println(s);
}
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}