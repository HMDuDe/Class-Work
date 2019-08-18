package searching;

public class Search {

	int[] arr = new int[200000];
	
	//Populating array
	public void populateArr() {
		
		for(int i = 0; i < 200000; i++) {
			arr[i] = (int) Math.random() * 100;
		}
		
		System.out.println("Array populated");
	}
	
	//Method for searching sequentially
	public String getViaSeqSearch(int tarVal) {
		
		String message = " ";
		long searchTime = 0;
		
		searchTime = System.currentTimeMillis();
		for(int i = 0; i < 200000; i++) {
			if(arr[i] == tarVal) {
				message = "Target value " + tarVal + " has been found.";
			
			}else {
				message = "Target value not found!";
				
			}
		}
		searchTime = System.currentTimeMillis() - searchTime;
		
		return message + "\nSearch time: " + searchTime;
	}
	
	//Method for binary search
	public String getViaBinSearch(int tarVal) {
		String message = " ";
		long searchTime = 0;
		int min = 0, max = 0;
		
		searchTime = System.currentTimeMillis();
		while(min < max) {
			int mid = (min + max)/2;
			if(arr[mid] < tarVal) {
				min = mid - 1;
			
			}else if(arr[mid] > tarVal) {
				max = mid -1;
				
			}else {
				return message = "Target found at index " + mid;
				
			}
			
			message = "" + (-(min + 1));
		}
		searchTime = System.currentTimeMillis() - searchTime;
		
		return "" + searchTime;
	}
	
	public static void main(String[] args) {

	}

}
