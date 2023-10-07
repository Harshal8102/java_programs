
import java.util.*;
class Demo{

	static void findIndices(int a[],int n,int t){

		/*int c = 0;
		for(int i=0; i<n-1; i++){

			for(int j=i+1; j<n; j++){

				if(a[i] + a[j] == t){
					System.out.println("[ " + i + " , " + j + " ]");
					c++;
					break;
				}
			}
			if(c > 0)
				break;
		}*/

		ArrayList<Integer> al = new ArrayList<>();

		int ans[] = new int[2];

		for(int i=0; i<n; i++){

			al.add(a[i]);
		}

		for(int i=0; i < n; i++){

			if((al.contains(t - a[i]) && i != al.indexOf(t-a[i]))  ){

				System.out.println(i + " , " + al.indexOf(t-a[i]));
				break;
			}else if(al.contains(t-a[i]) &&  i != al.lastIndexOf(t-a[i])){
				System.out.println(i + " , " + al.lastIndexOf(t-a[i]));
				break;
			}
			
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println("enter target");
		int t = sc.nextInt();

		findIndices(arr,n,t);
	}
}
		
