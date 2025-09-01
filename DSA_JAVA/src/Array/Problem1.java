package Array;

//Search the given element x in the array. If present then return the index else return -1.
class Demoo {
	void searchInArray() {
		// linear search algo

		int arr[] = { 10, 5, 3, 6, 2, 8, 2 };

		int x = 2;

		int ans = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				ans = i;
				break;

			}
		}
		if (ans == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("found " + x + " at index " + ans);
		}

	}
}

public class Problem1 {
	public static void main(String[] args) {
		Demoo d1 = new Demoo();
		d1.searchInArray();
	}
}
