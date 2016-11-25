class twoloop
{
public void show()
{
int i,j,num=0;
for(i=0;i<100;i++)
{
for(j=0;j<100;j++)
{
num=num+1;
}
}
System.out.println(num);
}
}

class longloop
{
public static void main(String args[])
{
twoloop tl= new twoloop();
tl.show();
}
}