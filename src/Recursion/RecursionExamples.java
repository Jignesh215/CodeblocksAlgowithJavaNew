package Recursion;

public class RecursionExamples {
	
	public static void main(String[] args) {
		int[] arr= {3,5,2,8,5,3,9};
		
		//decresing(5);
		//pattern(5);
		//System.out.println(factorial(5));
		//System.out.println(fibonacci(4));
		//System.out.println(power(3,2));//x is power n is number
		//System.out.println(isSorted(arr,0));
		//System.out.println(firstIndex(arr,0,8));
		//System.out.println(lastIndex(arr,0,5));
		//display(allIndices(arr,0,5,0));
		//pattern(5,1,1);
		bubbleSort(arr,0,arr.length-1);
		display(arr);
	}
	private static int factorial(int n) {
		
		if(n==1)
		{
			return 1;
		}
		return n*factorial(n-1);
	}
	private static void pattern(int i) {
		if(i==0) {
			return;
		}
		if(i%2==1) {
			System.out.println(i);
		}
		pattern(i-1);
		if(i%2==0) {
			System.out.println(i);
		}
	}
	public static void decresing(int n) {
		if(n==0)
			return ;
		
		System.out.println(n);
		decresing(n-1);
		System.out.println(n);
		
	}
	public static int fibonacci(int n) {
		
		if(n==0 || n==1) {
			return n;
		}
			
		
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static int power(int x, int n)
	{
		
		if(x==0)
		{
			return 1;
		}
		
		return n*power(x-1,n);
	}
	public static boolean isSorted(int[] arr,int si) {
	
		if(si==arr.length-1)
		{
			return true;
		}
		
		if(arr[si]>arr[si+1])
		{
			return false;
		}else {
			
			boolean restAns=isSorted(arr,si+1);
			return restAns;
		}
		
		
		
			
	}
	public static int firstIndex(int[] arr, int si, int data) {
		
		
		if(si==arr.length)
		{
			return -1;
		}
		if(arr[si]==data)
		{
			return si;
		}else {
			return firstIndex(arr,si+1,data);
		}
	}
	public static int lastIndex(int[] arr,int si, int data) {
		
		if(si==arr.length) {
			return -1;
		}
		int index=lastIndex(arr,si+1,data);
			if(index==-1)
			{
				if(arr[si]==data)
				{
					return si;
				}
				else {
					return -1;
				}
			}else {
					return index;
			}
	}
	public static int[] allIndices(int[] arr, int si, int data, int count) {
		if(si==arr.length)
		{
			int[] base = new int[count];
			return base;
		}
		int[] indices= null;
		if(arr[si]==data)
		{
			indices=allIndices(arr, si+1,data,count+1);
		}else {
			indices=allIndices(arr,si+1,data,count);
		}
		if(arr[si]==data) {
			indices[count]=si;
		}
		return indices;
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void pattern(int n,int row, int col) {
		
		if(col==n) {
			return;
		}
		if(col>row)
		{
			System.out.println();
			pattern(n,row+1,1);
			return;
		}
		System.out.print("*");
		pattern(n,row,col+1);
	}
	public static void bubbleSort(int[] arr, int si, int li) {
		
		if(li==0) {
			return;
		}
		if(si==li) {
			bubbleSort(arr,0,li-1);
			return;
		}
		
		if(arr[si]>arr[si+1]) {
			int temp=arr[si];
			arr[si]=arr[si+1];
			arr[si+1]=temp;
		}
		bubbleSort(arr,si+1,li);
		
	}
	
}
