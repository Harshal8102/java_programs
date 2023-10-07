//Largest number formed from an array

import java.util.*;
class Demo{

	static void largestNumber(int a[],int n){

		ArrayList<Integer> al = new ArrayList<>();
		for(int x : a)
			al.add(x);

		Collections.sort(al,new Comparator<Integer>(){

			public int compare(Integer x,Integer y){

				Integer xy = x;
				Integer yx = y;

				int countx = 0;
				int county = 0;

				while(x != 0){
					countx++;
					x /= 10;
				}

				while(y != 0){
					county++;
					y /= 10;
				}

				x = xy;
				y = yx;

				while(countx-- > 0)
					yx *= 10;
				while(county-- > 0)
					xy *= 10;

				xy = xy + y;
				yx = yx + x;

				return -(xy-yx);
			}
		});

		Iterator it = al.iterator();

		while(it.hasNext())
			System.out.print(it.next());
		System.out.println();

	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		largestNumber(arr,n);
	}
}
