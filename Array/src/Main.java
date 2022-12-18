
public class Main {

	public static void main(String[] args) {

		ArrayEx ar = new ArrayEx(5);
	

		ar.insert(1, 20);
		ar.insert(0, 10);
		ar.insert(2, 30);
		ar.insert(3, 40);
		ar.insert(4, 50);
		ar.insert(4, 60);
		
for(int i = 0; i<ar.arr.length; i++) {
			System.out.println(ar.arr[i]);
	}
		
	}

}
