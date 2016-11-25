class Palindrome_series
{
public static void main(String p[])
{
int a,b,c,d,i;
for(i=100; i<=200; i++)
{
d=0;
b=i;
while(b>0)
{
c=b%10;
d=d*10+c;
b=b/10;
}
if(i==d)
System.out.println(i);
}
}
}
