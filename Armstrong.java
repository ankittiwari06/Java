class Armstrong
{
   public static void main(String p[])
    {
      int sum = 0, temp, r;
 
     int n=Integer.parseInt(p[0]);
      temp = n;
 
      while( temp != 0 )
      {
         r = temp%10;
         sum = sum + r*r*r;
         temp = temp/10; 
       }
 
      if ( n == sum )
         System.out.println("Entered number is an armstrong number.");
      else
         System.out.println("Entered number is not an armstrong number.");         
       }
}
