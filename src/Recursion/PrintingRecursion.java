package Recursion;

public class PrintingRecursion {
public static void main(String[] args) {
	
	String str="abc";
	
			
	//printSubSequence(str, "");
	//getPermutation(str,"");
	//getBoardPath(0,10,"");
	//getMazePath(0,0,2,2,"");
	getMazePathDiagonal(0,0,2,2,"");
}
public static void printSubSequence(String str, String result) {
	
	if(str.length()==0)
	{
		System.out.print(result+" ");
		return ;
	}
	char cc = str.charAt(0);
	String ros = str.substring(1);
	
	printSubSequence(ros,result);
	printSubSequence(ros,result+cc);
}
public static void getPermutation(String ques,String ans) {
	if(ques.length()==0) {
		System.out.print(ans+" ");
		return;
	}
	
	for(int i=0;i<ques.length();i++)
	{
		char ch = ques.charAt(i);
		String roq = ques.substring(0,i)+ques.substring(i+1);
		getPermutation(roq,ans+ch);
		
	}
}
public static void getBoardPath(int curr, int end, String ans) {
	
	if(curr==end) {
		System.out.print(ans+" ");
		return;
	}
	if(curr>end) {
		return;
	}
	
	for(int dice=1;dice <=6;dice++) {
		getBoardPath(curr+dice,end,ans+dice);
	}
}
public static void getMazePath(int cr, int cc, int er, int ec, String ans) {
	
	if(cr==er && cc==ec)
	{
		System.out.println(ans);
		return;
	}
	if(cr>er || cc>ec){
		return;
	}
	
	getMazePath(cr,cc+1,er,ec,ans+"H");
	getMazePath(cr+1,cc,er,ec,ans+"V");
	
}
public static void getMazePathDiagonal(int cr, int cc, int er, int ec, String ans) {
	
	if(cr==er && cc==ec)
	{
		System.out.println(ans);
		return;
	}
	if(cr>er || cc>ec){
		return;
	}
	
	getMazePathDiagonal(cr,cc+1,er,ec,ans+"H");
	getMazePathDiagonal(cr+1,cc,er,ec,ans+"V");
	getMazePathDiagonal(cr+1,cc+1,er,ec,ans+"D");
	
}
}
