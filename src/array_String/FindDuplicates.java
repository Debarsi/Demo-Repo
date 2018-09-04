package array_String;

class Duplicates {

	public static void findDuplicates() {

		String r1 = "My Name is Zahid Khan";
		String s3 = "";

		String[] s1 = r1.split(" ");
		for (String s2 : s1) {
			s3 = s3 + s2;

		}
		System.out.println(s3);
		char[] a = s3.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = 1 + i; j < a.length; j++) {
				if ((a[i] == a[j]) && (i != j)) {
					System.out.println(a[j]);
					break;

				}
			}
		}

	}

}

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duplicates.findDuplicates();

	}

}
