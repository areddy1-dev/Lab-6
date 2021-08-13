
public class Exercise2 {
	int foo(int N) {
		int result = 0;
		 for (int i=0; i<N; i++) // runs N times
		 result++;
		 for (int j=0; j<1000000; j++)
		 result+=j;
		 return result;
    }
}
//From example: O(N) * O(1) = O(N)
// The Time Complexity will be O(N).
 
 