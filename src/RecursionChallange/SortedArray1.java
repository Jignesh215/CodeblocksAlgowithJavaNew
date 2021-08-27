package RecursionChallange;

import java.util.Scanner;

public class SortedArray1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	/*
	 * int N= sc.nextInt();
	 * int[] arr = new int[N]; 
	 *  for(int i=0;i<N;i++) {
	 * 		arr[i]=sc.nextInt(); 
	 * }
	 */
//	int testcases= sc.nextInt();
//	while(testcases--> 0) {
//		String s = sc.next();
//		System.out.println(replacePi(s));
//	}
//	
	String str=sc.next();
	//printSubsequences(str," ");
	//System.out.println();
	//int n = (1 << str.length());
   // System.out.println(n);
    System.out.println(moveXtoEnd(str));
	//display(arr);
	//boolean sorted = isSorted(arr,0);
	//System.out.println(sorted);
	//System.out.println("Enter the No to find :");
	//int ele= sc.nextInt();
	//int count=0;
	//System.out.println(lastOccurence(arr,0,ele));
	//String str = sc.nextLine();
	//int num = strToInt(str,0);
	//System.out.println(num);
	//System.out.println(insertStarDuplicate(str));
	//System.out.println(removeDuplicate(str));
	//int[] ans = allIndices(arr,0,ele,count);
	//display(ans);
	sc.close();
}

public static void display(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
public static boolean isSorted(int arr[], int i) {
	
	if(i==arr.length-1) {
		return true;
	}
	if(arr[i]>arr[i+1]) {
		return false;
	}
	
	isSorted(arr,i+1);
	return true;
}
public static int lastOccurence(int arr[], int N,int ele) {
	
	if(N==arr.length) {
		return -1;
	}
	
	int li =lastOccurence(arr,N+1,ele);
	if(li != -1) {
		return li;
	}
	else {
		if(arr[N]==ele) {
			return N;
		}else {
			return -1;
		}
	}
}
public static int strToInt(String str,int i) {
	
	if(str.length()==0) {
		return i;
	}
	char ch = str.charAt(0);
	i=i+(ch-48)*(int)Math.pow(10, str.length()-1);
	String ros = str.substring(1);
	
	return strToInt(ros,i);
}
public static String insertStarDuplicate(String str) {
	if(str.length()<=1) {
		return str;
	}
	String ros = insertStarDuplicate(str.substring(1));
	if(str.charAt(0)==ros.charAt(0)) {
		return str.charAt(0)+"*"+ros;
	}
	return str.charAt(0)+ros;
}
public static String removeDuplicate(String str) {
	if(str.length()<=1) {
		return str;
	}
	String ros = removeDuplicate(str.substring(1));
	if(str.charAt(0)==ros.charAt(0)){
		
		return ros;
	}
	return str.charAt(0)+ros;
}
public static int[] allIndices(int[] arr, int vidx, int item, int cnt) {
	if(vidx==arr.length) {
		int[] brr = new int[cnt];
		return brr;
	}
	if(arr[vidx]==item) {
		int[] rr = allIndices(arr, vidx+1,item,cnt+1);
		rr[cnt]=vidx;
		return rr;
	}else {
		return allIndices(arr, vidx+1,item,cnt);
	}
}
public static String replacePi(String str) {
	if(str.length()<=1) {
		return str;
	}
	if(str.substring(0,2).equals("pi")|| str.substring(0,2).equals("PI")) {
		String ros= replacePi(str.substring(2));
		return "3.14"+ros;
	}
	String ros = replacePi(str.substring(1));
	return str.charAt(0)+ros;
}
private static void printSubsequences(String str, String string) {
	
	if(str.length()==0)
	{
		System.out.println(string);
		return;
	}
	char ch = str.charAt(0);
	str = str.substring(1);
	printSubsequences(str,string);
	printSubsequences(str, string+ch);
}
public static String moveXtoEnd(String s) {
	 if (s.length() <= 1)
         return s;

     String ros = s.substring(1);
     ros = moveXtoEnd(ros);
     if (s.charAt(0) == 'x')
         return ros + s.charAt(0);
     else
         return s.charAt(0) + ros;
}


}