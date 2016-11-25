import java.util.Scanner;
class calc
{
public void check(int an,int mn) throws Exception
{
if(an==mn)
{
System.out.println("an==mn not allowed");
}
else if(an<=mn)
{
System.out.println("an<=mn not allowed");
}
else
{
System.out.println("Valid");
}
}
}

class ThrowsAndTry
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
int an=sc.nextInt();
System.out.println(an);
int mn=sc.nextInt();
System.out.println(mn);
calc obj=new calc();
obj.check(an,mn);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}