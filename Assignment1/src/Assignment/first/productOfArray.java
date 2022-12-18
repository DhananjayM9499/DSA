package Assignment.first;
public class productOfArray {

	public static void main(String[] args) {
		int a=1;
		int array[] = {1,2,3,4,5};
		for (int iTmp = 0; iTmp < array.length; iTmp++) {
			a=a*array[iTmp];
		}
		System.out.println(a);

	}

}
