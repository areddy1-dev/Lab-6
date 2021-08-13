
public class Exercise5 {
	
public static void main(String[] args) 
   {
   int[] arr = { 1, 29, 14, 15, 94 };
   }  
}

/*Selection from set : 
 * {1, 29, 14, 15, 94}
 //case 1: {1, 29, 14, 15, 94}
 * Start with first item (index 0) in the list and can to the right to find smallest value. 
 * No smaller value is found. Remains at 1.
 * 
 // case 2: {1, 14, 29, 15, 94}
 * Move to the next position (index 1), which is 29. Scan to the right and look for smallest value (14). 
 * Values 29 and 14 switch positions. 
 * 
 //case 3: {1, 14, 15, 29, 94}
 * Move to the next position (index 2), value 29. Scan to the right and look for the smallest value (15). 
 * Values 29 and 15 switch positions. 
 * 
 // case 4: {1, 14, 15, 29, 94}
 * Move to the next position (index 3), value 29. Scan to the right and look for the smallest value. 
 * There is no smaller value. So 29 remains in the same position. 
 * 
 * Result: Index has reached the end and the array has been sorted.//

/* Insert from given set: 
* {1, 29, 14, 15, 94}
* 
// case 1: {1, 29, 14, 15, 94}
* First item considered a sorted sublist of length 1.
* 
// case 2: {1, 29, 14, 15, 94}
* Second item (29) inserted into the sorted sublist. No shifting needed since 29 is greater than 1 
* 
// case 3: {1, 14, 29, 15, 94}
* Third item (14) is inserted into sorted sublist (1 and 29) and 29 shifts to the right because 1 
* is greater than 14 which is greater than 29. 
* 
// case 4: {1, 14, 15, 29, 94}
* Fourth item (15) is inserted into sorted sublist (1, 14, 29) and 29 shifts to the right because 
* 14 is greater than 15 which is greater than 29
* 
* In this case item does not need to be inserted into a new position because it's greater than the rest of the values.
*/

