class manit
{
int a=20;
String b="HELLO";
}
class svce
{
public void fun(manit mn)
{
System.out.println(mn.a);
System.out.println(mn.b);
}
}

class main
{
public static void main(String...ar)
{
manit mn=new manit();
svce sv=new svce();
sv.fun(mn);
}
}