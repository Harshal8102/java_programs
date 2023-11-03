
//count no. of 1's in given array
import java.io.*;
class BinarySearch{

	int searchElement(int a[]){

		int start = 0,end = a.length-1;

		int mid=-1;
		while(start <= end){

			mid = (start+end)/2;

			if(a[mid] == 1){

				if(mid != 0 && a[mid-1] == 1){
					end = mid - 1;
				}else{
					break;
				}
			}else if(a[mid] < 1)
				start = mid+1;
			else
				end = mid-1;
		}

		return a.length-mid;
	}

	public static void main(String[] args)throws IOException{

		BinarySearch obj = new BinarySearch();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter array size & elements");
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];

		for(int i=0; i<n; i++)
			a[i] = Integer.parseInt(br.readLine());

		System.out.println(obj.searchElement(a));
	}
}
