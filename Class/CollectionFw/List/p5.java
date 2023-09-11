
import java.util.*;

class demo{

	static boolean printSumIndex(ArrayList<Integer> al,int target){
/*  brute force approach
 *
		for(int i=0; i<al.size(); i++){

			for(int j=0; j<al.size(); j++){

				if(i!=j && (al.get(i)+al.get(j) == target)){
					return true;
				}
			}
		}
		*/

		//two pointers approach
		Collections.sort(al);
		int sp = 0, ep = al.size()-1;
		while(sp<ep){

			if(al.get(sp)+al.get(ep) == target){
				return true;
			}

			if(al.get(sp)+al.get(ep) < target){
				sp++;
			}else{
				ep--;
			}
		}

		return false;
	}


	public static void main(String[] args){

		ArrayList<Integer> al = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		for(int i=1; i<=6; i++){

			al.add(sc.nextInt());
		}

		System.out.println("Enter pair sum target");
		int target = sc.nextInt();

		System.out.println(printSumIndex(al,target));
	}
}


