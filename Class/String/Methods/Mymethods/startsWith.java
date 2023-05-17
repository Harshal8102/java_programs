import java.util.*;
class Core{

	static boolean myStrStartsWith(String str,String ps, int x){

		char arr[] = str.toCharArray();
		char prs[] = ps.toCharArray();
		int j=0;
		int y=0;
		for(int i =0 ; i < prs.length ; i++){

			if(arr[x] == prs[i]){
				y=0;
			}else{
				y=1;
			}
			x++;
		}	
		
		if(y == 0){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sc.next();

		System.out.println("Enter the prefix string to compare");
		String ps = sc.next();

		System.out.println("Enter the offset from which prefix string starts:");
		int ofs = sc.nextInt();

		System.out.println(myStrStartsWith(str,ps,ofs));
		System.out.println(str.startsWith(ps,ofs));
	}
}


