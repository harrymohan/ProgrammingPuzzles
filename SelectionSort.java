class SelectionSort{
	
	public static void sort(int[] arr){
	int min;
	int len = arr.length()-1;
	for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min =j;
				}
				//swap
				int temp;
				temp = arr[j];
				arr[j] = arr[min];
				arr[min] = temp;
			}

		}
		//print the array
		for(int k=0;k<len;k++)
		{
			System.out.println("sorted:"+arr[k]);
		}

	}

	public static void main(String[] args)
	{
	 	int[] arr = {2,1,0,4,7};
	 	sort(arr);
	}
}