import java.util.Vector;
import java.io.*;
public class Vectors extends Thread{
 public static void main(String args[]) throws InterruptedException{
 Vector v = new Vector();
 int num,choice,ch;
 boolean tr = true;
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 try {
 do {
 System.out.println("1. Add Elements\n2. Delete Elements\n3. Display\n4. Exit");
 choice = Integer.parseInt(br.readLine());
 switch(choice) {
 case 1:
 System.out.println("Enter Element : ");
 v.add(Integer.parseInt(br.readLine()));
 break;
 case 2:
 int no;
 System.out.println("Enter Element : ");
 no = Integer.parseInt(br.readLine());
 if(v.contains(no))
 v.removeElement(no);
 break;
 case 3:
 System.out.println(v);
 break;
 case 4:
 System.out.println("Exiting Application....");
 Thread.sleep(2000);
 System.exit(0);
 break;
 default:
 System.out.println("ERROR!!! INVALID OPTION!!!");
 Thread.sleep(2000);
 }
 System.out.println("Do YOu want to continue (1 = yes: )");
 ch = Integer.parseInt(br.readLine()); }
 while(ch==1);
 } catch(Exception e){
 System.out.println("Error Message: "+e);
 }
 }}