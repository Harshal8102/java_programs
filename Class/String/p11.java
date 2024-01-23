import java.io.*;
class StringDemo{

	void myStrCheckAnagram(String str1, String str2){

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		if(arr1.length == arr2.length){

			for(int i=0; i<arr1.length; i++){

				for(int j=0; j<arr1.length-1; j++){

					if(arr1[i] > arr1[j+1]){

						char temp = arr1[i];
						arr1[i] = arr1[j+1];
						arr1[j+1] = temp;
					}
				}
			}

			for(int i=0; i<arr2.length; i++){

				for(int j=0; j<arr2.length-1; j++){

					if(arr2[i] > arr2[j+1]){

						char temp = arr2[i];
						arr2[i] = arr2[j+1];
						arr2[j+1] = temp;
					}
				}
			}

			String s1 = new String(arr1);
			String s2 = new String(arr2);

			if(s1.equals(s2) == true){

				System.out.println("Anagram strings");
			}else{
				System.out.println("Not anangram strings");
			}
		} else{

			System.out.println("not anagram string");
		}
	}	
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter first string");
		String str1 = br.readLine();

		System.out.println("Enter second String");
		String str2 = br.readLine();

		StringDemo obj = new StringDemo();

		obj.myStrCheckAnagram(str1,str2);
	}
}











