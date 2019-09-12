public class BinaryRecursiveSearch implements Practice03Search {
	
	public int search(int [] arr, int target){
		return search(arr, target, 0, arr.length - 1);
	}

	public int search(int [] arr, int target, int start, int end){
		if(end < start){
			 return -1;
		} 	
 
		int middle = (start + end)/2;
		
		if (target < arr[middle]){
			return search(arr, target, start, middle - 1);
		} else if (target > arr[middle]){
			return search(arr, target, middle + 1, end);
		} else if (target == arr[middle]){
			return middle;
		}
		
		return -1;
	}


	public String searchName(){
		return  "Binary Recursive Search";
	}
}