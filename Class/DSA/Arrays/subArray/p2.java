//print all elements in given subArray from start to end

class Demo{
	public static void main(String[] args){

		int a[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int start = 3,end = 7;

		for(int i=start; i<= end; i++)
			System.out.print(a[i] + "   ");
	}
}
