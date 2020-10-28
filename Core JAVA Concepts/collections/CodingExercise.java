package collections;

import java.util.ArrayList;

public class CodingExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 4, 5, 4, 5, 6, 6, 6, 8,9 };
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println("number " + a[i] + " is repeted " + k + " times");

			}
			if(k==1) {
				System.out.println("unique numbers are : " + a[i]);
			}

		}
		System.out.println("individual numbers are : " + al);
		

	}

}
