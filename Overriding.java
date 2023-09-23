class PC
{
void m()
{
System.out.println("hai");
}
int n(int x,int y)
{
int p=x+y;
System.out.println(p);
return p;
}
}



class CC extends PC
{
void m()
{
System.out.println("good day");
}

double q(double b,double c)
{
double d=b+c;
System.out.println(d);
return d;
}
}


public class Overriding
{
public static void main(String args[])
{
CC cc = new CC();
cc.m();
cc.q(5,4);
PC pc =new PC();
pc.m();
pc.n(6,7);



}



}
