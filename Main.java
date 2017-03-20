   import java.io.*;
    import java.util.*;
    import java.math.*;
    class Main{
	    static int n,m,t;	
	static buses obj[];
	    public static void main(String args[])throws IOException{
		InputStream inputStream = System.in;
		InputReader in = new InputReader(inputStream);
		n = in.readInt();t=in.readInt();m=in.readInt();
		obj = new buses[m];
		for(int i=0;i<m;i++)
			obj[i]=new buses(in.readInt(),in.readInt(),in.readInt(),in.readInt());		
		Arrays.sort(obj);
		int l = 0,r = t;
		int res=-1;
		while(l<=r){
			int mid = (l+r)/2;
			if(check(mid)){
				res=mid;
				r=mid-1;			
			}
			else l=mid+1;		
		} 
		System.out.println(res);
	}
	public static boolean check(int time){
		dp objects[] = new dp[n+1];
		objects[1]= new dp();
		objects[1].v.addElement(0);
		for(int i=0;i<m;i++){
			int u = obj[i].u;
			int v = obj[i].v;
			int s = obj[i].s;
			int e = obj[i].e;
			if(objects[u]==null){
				objects[u] = new dp();
				continue;			
			}				
			if(objects[v]==null){
				objects[v] = new dp();			
			}
//			System.out.println("object not null "+u+" time "+time);
			if(objects[u].v.size()==0||(Integer)(objects[u].v.firstElement())>s){continue;}
			int pos = Collections.binarySearch(objects[u].v,s);
			if(pos>=0){
				objects[v].v.addElement(e);			
			}
			else{
				pos = (-1*pos)-2;						
//				System.out.println("Pos "+pos+" - "+(objects[u].v.get(pos));
				if(pos>=0&&(s-(Integer)objects[u].v.get(pos)<=time)){
					objects[v].v.addElement(e);				
				}
			}				
		}
		if(objects[n]!=null&&objects[n].v.size()!=0&&((Integer)objects[n].v.firstElement())<=t)
			return true;
		return false;			
	}
}
class dp {
	Vector<Integer> v = new Vector<Integer>();
	
}	
class buses implements Comparable<buses>{
	int u,v,s,e;
	buses(int u,int v,int s,int e){
		this.u=u;this.v=v;this.s=s;this.e=e;	
	}
	public int compareTo(buses object){
		int to = ((buses)object).e;
		return this.e-to;	
	}
}	
class InputReader {
private InputStream stream;
private byte[] buf = new byte[1024];
private int curChar;
private int numChars;
 
public InputReader(InputStream stream) {
this.stream = stream;
}
 
public int read() {
if (numChars == -1)
throw new InputMismatchException();
if (curChar >= numChars) {
curChar = 0;
try {
numChars = stream.read(buf);
} catch (IOException e) {
throw new InputMismatchException();
}
if (numChars <= 0)
return -1;
}
return buf[curChar++];
}
 
public int readInt() {
int c = read();
while (isSpaceChar(c))
c = read();
int sgn = 1;
if (c == '-') {
sgn = -1;
c = read();
}
int res = 0;
do {
if (c < '0' || c > '9')
throw new InputMismatchException();
res *= 10;
res += c - '0';
c = read();
} while (!isSpaceChar(c));
return res * sgn;
}
 
public String readString() {
int c = read();
while (isSpaceChar(c))
c = read();
StringBuffer res = new StringBuffer();
do {
res.appendCodePoint(c);
c = read();
} while (!isSpaceChar(c));
return res.toString();
}
 
public Long readLong() {
return Long.parseLong(readString());
}
 
public Double readDouble() {
return Double.parseDouble(readString());
}
 
public static boolean isSpaceChar(int c) {
return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
}
}  
