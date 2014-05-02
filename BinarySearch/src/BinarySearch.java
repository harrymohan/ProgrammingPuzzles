
public class BinarySearch {

	public static int Bhelper(int[] arr, int n)
	{
		return BSearch(arr,n,0,arr.length-1);
	}
	public static int BSearch(int[] arr, int n,int low, int high)
	{
		int mid;
		System.out.println("High:"+high);
		System.out.println("Low:"+low);
		mid = (high+low)/2;
		//base case if 
		if(arr[mid]== n)
		{
			return mid;
		}
		else
			//the recursive case
			if(n> arr[mid]){
				return BSearch(arr,n,mid+1,high);
			}
			else
				return BSearch(arr,n,low,mid-1);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,10,1,14,188,91,81,90,55};
		//sort this array nlogn
		int[] arr1 = {1,7,10,14,55,81,90,91,188};
		int pos;
		pos = Bhelper(arr1,90);
		System.out.println("Position of the :"+pos);
		
	}

}
