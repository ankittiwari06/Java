class Palindrome
{
public static void main(String p[])
{
int b,c,d;
d=0;
int a=Integer.parseInt(p[0]);
b=a;
while(b>0)
{
c=b%10;
d=d*10+c;
b=b/10;
}
if(a==d)
System.out.println("Number is palindrome");
else
System.out.println("Number is not palindrome");
}
}
