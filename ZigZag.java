class ZigZag {

	void zigZag(int arr[], int n) {
		// code here
		for (int i = 0; i < n-1; i++) {
			if (i%2 == 0)
			{
				if (arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			else {
				if (arr[i] < arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}

	void print(int [] arr) {
		for (int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		ZigZag solution = new ZigZag();
		int [] arr = {4, 3, 7, 8, 6, 2, 1};
		solution.zigZag(arr, arr.length);
		solution.print(arr);
	}

}