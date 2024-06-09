import java.util.*;
class demo{

	public static void main(String[] args){

		ArrayList<Character> al = new ArrayList<>();

		al.add('h');
		al.add('a');
		al.add('a');
		al.add('h');
		
		System.out.println(al);

		al.remove('h');
		System.out.println(al);
	}
}
