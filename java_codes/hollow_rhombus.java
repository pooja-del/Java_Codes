import java.io.*;
class Hollow{
public static void main(String[] args)
{
int i,j,k;
for(i=1;i<=5;i++)
{
for(k=5;k>=i;k--)
{
System.out.print("-");
}
for(j=1;j<=2*i-1;j++)
{
if(j==1 || i==1 || j==2*i-1)
{
System.out.print("*");
}
else
{
System.out.print("-");
}
}
System.out.println("");
}
for(i=1;i<=4;i++)
{
for(k=1;k<=i+1;k++)
{
System.out.print("-");
}
for(j=1;j<=9-2*i;j++)
{
if(j==9-2*i || i==4 || j==1)
{
System.out.print("*");
}
else
{
System.out.print("-");
}
}
System.out.println("");
}  
}
}



//-----*
//----*-*
//---*---*
//--*-----*
//-*-------*
//-*----   *
//--*-----*
//-------*
//------*
//pooja@pooja:


















//-----*
//----* *
//---*   *
//--*     *
//-*       *
//--*     *
//---*   *
//----* *
//-----* 

