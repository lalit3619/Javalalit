class pattern12{
public static void main(String[] args)
{
int n=5;
int x;
for(int i=1;i<=n;i++)
{
x=i;

for(int j=1;j<=n;j++)
{
System.out.printf("%2d ",x);
x +=n;
}
System.out.println();
}
}
}