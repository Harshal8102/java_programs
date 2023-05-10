import java.util.Scanner;
class SBDemo{

	static StringBuffer myInsert(StringBuffer sb1, int in, StringBuffer sb2){

		String str1 = sb1.toString();
		String str2 = sb2.toString();

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		char ans[] = new char[arr1.length + arr2.length];
		int j=0;
		int k =0;

		for(int i=0; i<ans.length; i++){

			if(i>=in && i<arr2.length+in){
				ans[i] = arr2[j];
				j++;
			}else{
				if(i<in){
					ans[i] = arr1[k];
					
				}else{
					ans[i] = arr1[k];
					
				}
				k++;
			}
		}

		String str = new String(ans);
		StringBuffer anss = new StringBuffer(str);
		return anss;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string:");
		StringBuffer sb1 = new StringBuffer(sc.nextLine());

		System.out.println("Enter the string to insert:");
		StringBuffer sb2 = new StringBuffer(sc.nextLine());

		System.out.println("Enter the offset the place to insert in");
		int i = sc.nextInt();

		//System.out.println(sb1.insert(i,sb2));
		
		System.out.println(myInsert(sb1,i,sb2));
	}
}	


