public class Exercise1 {

	int foo(int n) {
		int result = 0;
	      for (int i = 0; i < n; i++) { //runs n times
			for (int j = 0; j < n; j++) { //runs n times
				for (int k = 0; k < n; k++) { //runs n times
					result++;
				}
			}
		}
	  return result;
   }
}
// Time complexity for this simple method would be O(n^3)