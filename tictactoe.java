import java.io.*;
class tictactoe
{
public static void main()throws IOException
{
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
int i,j,a=2,r,c,s=0;
int g[][]=new int[3][3];
System.out.println("                   WELCOME TO SHIKHAR'S TIC TAC TOE GAME                       ");
System.out.println("It's a two player game");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(a%2==0)
{
System.out.println("\nenter the numeral 1 in terms of row and column");
r=Integer.parseInt(dr.readLine());
c=Integer.parseInt(dr.readLine());
g[r-1][c-1]=1;
}
else
{
System.out.println("enter the numeral 0 in terms of row and column");
r=Integer.parseInt(dr.readLine());
c=Integer.parseInt(dr.readLine());
g[r-1][c-1]=0;
}
a++;
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(g[i][j]);
}
System.out.println();
}
// checking the condition of winning of one(1)//
{
for(i=0;i<3;i++)
{
s=0;
for(j=0;j<3;j++)
{
s=s+g[j][i];
}
if(s==3)
{
System.out.println("1 wins");
break;
}
}
for(i=0;i<3;i++)
{
s=0;
for(j=0;j<3;j++)
{
s=s+g[i][j];
}
if(s==3)
{
System.out.println("1-wins");
break;
}
}
s=0;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i==j)
s=s+g[i][j];
}
}
if(s==3)
{
System.out.println("1-wins");
}
s=0;
}
//checking the condition of winning zero(0)//
{
for(i=0;i<3;i++)
{
s=0;
for(j=0;j<3;j++)
{
s=s+g[j][i];
}
if(s==0)
{
System.out.println("0 wins");
break;
}
}
for(i=0;i<3;i++)
{
s=0;
for(j=0;j<3;j++)
{
s=s+g[i][j];
}
if(s==0)
{
System.out.println("0-wins");
break;
}
}
s=0;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i==j)
s=s+g[i][j];
}
}
if(s==0)
{
System.out.println("0-wins");
}
s=0;
}
//CHECKING FOR DRAW CONDITION//
{
if((s>0&&s!=3)||(s>3))
System.out.println("it's a draw");
}
}
}