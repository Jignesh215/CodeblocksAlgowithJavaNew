package Recursion;

import java.util.ArrayList;

public class ArraylistExamples {
 public static void main(String[] args) {
	
	 String str = "abc";
	 ArrayList<String> lst = new ArrayList<>();
	 //get All subsequences of a string in a ArrayList of String and return the ArrayList. 
	 //lst= getss(str);
	 //lst=getPermutations(str);
	 //System.out.println(lst.toString());
	 //System.out.println(getBoardPath(0,10));
	 //System.out.println(getMazePath(0,0,2 ,2));
	 //System.out.println(getMazePathDiagonal(0,0,2,2));
}
 
 public static ArrayList<String> getss(String str){
	 
	if(str.length()==0)
	{
		ArrayList<String> baseResult = new ArrayList<>();
		baseResult.add("");
		return baseResult;
	}
	 
	 char cc = str.charAt(0);
	 String ros = str.substring(1);
	 
	 ArrayList<String> myresult = new ArrayList<>();
	 ArrayList<String> recResult = getss(ros);
	 
	 for(int i=0 ;i<recResult.size();i++) {
		 myresult.add(recResult.get(i));
		 myresult.add(cc+recResult.get(i));
	 }
	 return myresult;
 }
 public static ArrayList<String> getPermutations(String str){
	 
	 if(str.length()==0) {
		 ArrayList<String> br= new ArrayList<>();
		 br.add("");
		 return br;
	 }
	 
	 char ch = str.charAt(0);
	 String ros = str.substring(1);  //rest of the string
	 
	 
	 ArrayList<String> recResult=getPermutations(ros);
	 ArrayList<String> myResult= new ArrayList<>();
	 
	 for(String rrs : recResult) {
		 for(int i=0;i<=rrs.length();i++) {
			 String val = rrs.substring(0,i)+ch+rrs.substring(i);
			 myResult.add(val);
		 }
	 }
	 return myResult;
	 
 }
 public static ArrayList<String> getBoardPath(int curr, int end){
	 
	 if(curr==end) {
		 ArrayList<String>br = new ArrayList<>();
		 br.add("\n");
		 return br;
	 }
	 if(curr > end)
	 {
		 ArrayList<String>br = new ArrayList<>(); 
		 return br;
	 }
	 
	 ArrayList<String> mr = new ArrayList<>();
	 for(int dice=1;dice<=6;dice++) {
		ArrayList<String> rr = getBoardPath(curr+dice,end);
		
		for(String rrs : rr)
		{
			mr.add(dice+rrs);
		}
	 }
	 return mr;
 }
 public static ArrayList<String> getMazePath(int cr, int cc, int er, int ec){
	 
	 if(cr==er && cc==ec)
	 {
		 ArrayList<String> br = new ArrayList<>();
		 br.add("");
		 return br;
	 }
	 if(cr> er || cc > ec) {
		 
		 ArrayList<String> br = new ArrayList<>();
		 return br;
	 }
	 ArrayList<String> mr = new ArrayList<>();
	 ArrayList<String> rrh=getMazePath(cr, cc+1,er,ec);
	 
	 for(String rrhs : rrh) {
		 mr.add("H"+rrhs);
	 }
	 ArrayList<String> rrv=getMazePath(cr+1, cc,er,ec);
	 
	 for(String rrvs : rrv) {
		 mr.add("V"+rrvs);
	 }
	 
	 return mr;
 }
 public static ArrayList<String> getMazePathDiagonal(int cr, int cc, int er, int ec){
	 
	 if(cr==er && cc==ec)
	 {
		 ArrayList<String> br = new ArrayList<>();
		 br.add("");
		 return br;
	 }
	 if(cr> er || cc > ec) {
		 
		 ArrayList<String> br = new ArrayList<>();
		 return br;
	 }
	 ArrayList<String> mr = new ArrayList<>();
	 ArrayList<String> rrh=getMazePathDiagonal(cr, cc+1,er,ec);
	 
	 for(String rrhs : rrh) {
		 mr.add("H"+rrhs);
	 }
	 ArrayList<String> rrv=getMazePathDiagonal(cr+1, cc,er,ec);
	 
	 for(String rrvs : rrv) {
		 mr.add("V"+rrvs);
	 }
	 ArrayList<String> rrd=getMazePathDiagonal(cr+1, cc+1,er,ec);
	 
	 for(String rrds : rrd) {
		 mr.add("D"+rrds);
	 }
	 return mr;
 }
}