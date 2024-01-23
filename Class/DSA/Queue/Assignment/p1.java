//Queue using two stack
//Query Q is of 2 types
//1) pushing 'x' into the queue
//2) pop element from queue & print the pop
//note = if there is no element, return -1 as answer while popping
import java.util.*;
class StackQueue{

	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	void Push(int x){

		s1.push(x);
	}

	int Pop(){

		if(s1.empty()){
			return -1;
		}

		while(!s1.empty()){
			s2.push(s1.pop());
		}
		int ret = s2.pop();
		while(!s2.empty()){
			s1.push(s2.pop());
		}
		return ret;
	}
}
