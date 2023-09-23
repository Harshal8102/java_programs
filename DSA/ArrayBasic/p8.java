//Even occuring elements
import java.util.*;
import java.io.*;
class Demo{

	static void findEvenOcc(int arr[],int n){

		int visited = -1;
		int c = 0;
		for(int i=0; i<n; i++){

			int x = arr[i];

			if(arr[i] != -1){

				int count = 0;

				for(int j=0; j<n;j++){

					if(x == arr[j]){

						count++;
						arr[j] = visited;
					}
				}

				if(count % 2 == 0){
					System.out.print(x + "    ");
					c++;
				}
			}
		}
		if(c == 0){

			System.out.println(-1);
		}
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no. of elements");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = Integer.parseInt(br.readLine());
		}

                findEvenOcc(arr,n);
	
	/*	HashMap<Integer,Integer> tm = new HashMap<Integer,Integer>();
		
		for(int i = 0; i<n; i++){
			arr[i] = Integer.parseInt(br.readLine());
	
			if(tm.containsKey(arr[i])){

				tm.put(arr[i], tm.get(arr[i])+1);
			}else{
				tm.put(arr[i],1);
			}	
		}

		for(Map.Entry en : tm.entrySet()){

			if((int)en.getValue() % 2 == 0){

				System.out.print(en.getKey() + "   ");
			}
		}*/
	}
}
