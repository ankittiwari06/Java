class Armstrong_series
{
public static void main(String p[])
{
for (int k = 100 ; k <= 999 ; k++) 
{ 
int n = k; 
int d = 0; 
int s = 0; 

while (n > 0) 
{ 
d = n % 10; 
s = s + (d * d * d); 
n = n / 10; 
} 
if (k == s) 
{ 
System.out.println (k + " is Armstrong number"); 
} 
} 
} 
}
