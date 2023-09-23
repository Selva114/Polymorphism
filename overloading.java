public class overloading
{
int sum(int x,int y)
{
int z=x+y;
System.out.println(z);
return z;
}
int sum(int x,int y,int z)
{
int i=x+y+z;
System.out.println(i);
return i;
}
public static void main(String args[])
{
overloading ov=new overloading();
ov.sum(1,2);
ov.sum(2,5,4);
}

}
