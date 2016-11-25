import java.util.Scanner;		
class reverse
{
public static void main(String arg[])
{
int i=5;
Scanner sc=new Scanner(System.in);
String str=sc.next();
while(i<str.length())
{

System.out.println(str.charAt(i));
i--;
}
}
}