import java.util.Arrays;
import java.util.HashSet;

public class pharmeasy {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 10, 5, 7, 12, 3, 8, 9 };
		int n = arr.length;
		
		// with using collection
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int ele : arr) {
			hs.add(ele);
		}
		Object[] a = hs.toArray();
		Arrays.sort(a);
		System.out.println(a[a.length - 2]);
		
		//======================================

// without using collection

     //1. sort the array
		for (int i = 0; i <= n - 1; i++) {
			for (int j = i + 1; j <= n - 1; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		int[] newArray = new int[n];
		int j = 0;
		//2. copy the non duplicate elements into new array
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				newArray[j++] = arr[i];
			}
		}
		newArray[j++] = arr[n - 1];
		//3. remove the leading blank places into new array
		newArray = Arrays.copyOf(newArray, j);
		System.out.println(newArray[newArray.length - 2]);
	}

	

}

