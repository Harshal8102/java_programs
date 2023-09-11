
//Container with most water

import java.util.*;
class demo{

	static int maxStoreWater(ArrayList<Integer> height){
		
		int maxWater = 0;
		//brute force
		for(int i=0; i<height.size()-1; i++){

			for(int j=i+1; j<height.size(); j++){

				int mh = Math.min(height.get(i),height.get(j));
				int width = j-i;
				maxWater = Math.max(maxWater,mh*width);
			}
		}
		return maxWater;
	}
	public static void main(String[] args){

		ArrayList<Integer> height = new ArrayList<Integer>();
						
		height.add(1);
		height.add(8);
		height.add(6);
		height.add(2);
		height.add(5);
		height.add(4);
		height.add(8);
		height.add(3);
		height.add(7);

		System.out.println(maxStoreWater(height));
	}
}
