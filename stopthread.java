//STOPING A THREAD

class demo2 extends Thread
{
public void run()
{
try
{
for(int i=0;i<10;i++)
{
Thread.sleep(500);
System.out.println("i="+i);
}
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}

class demo3 extends Thread
{
public void run()
{
try
{
for(int j=0;j<10;j++)
{
Thread.sleep(500);
System.out.println("j="+j);
}
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}

class stopthread
{
public static void main(String args[])
{
demo2 dm2=new demo2();
dm2.start();
demo3 dm3=new demo3();
dm3.start();

}
}