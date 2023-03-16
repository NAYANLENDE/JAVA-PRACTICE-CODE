
class JC1ArrayReverse {
    
	public static void main(String[] args) {
    int[]arr=new int[] {12,45,34,23,55};
    System.out.println("The array elements are: ");
    for(int i=0;i<arr.length;i++) {
    	System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("The array elements in reverse order are: ");
    for (int i=arr.length-1;i>=0;i--) {
    	System.out.print(arr[i]+" ");
       }
	}
}


