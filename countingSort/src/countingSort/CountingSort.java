package countingSort;


public class CountingSort {
	 
	public static int[] sort(int[] arrayToBeSorted) {
		int n= arrayToBeSorted.length;
		int[] count= new int[n];
		int[] sortedArray = new int[n];
		
		for (int i=0;i<=n-1; i++) {
			count[i]=0;
		}
		for (int i=0; i<=n-2;i++) {
			for(int j=i+1; j<=n-1;j++) {
				if (arrayToBeSorted[i]< arrayToBeSorted[j]) {
					count[j]= count[j]+1;
				}
				else {
					count[i]= count[i]+1;
				}
			}
		}
			for (int i=0; i<=n-1;i++) {
				sortedArray[count[i]]= arrayToBeSorted[i];	
		}
			return sortedArray;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {60,35,81,98,14,47};
		
		sort(array);
		

	}

}
