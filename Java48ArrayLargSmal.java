
class Java48ArrayLargSmal {

	public static void main(String[] args) {
	  int arr[]= {2,3,6,5,22,11,34,65,45,75};
	  int small,large,i;
	  small=large=arr[0];
	  for (i=1;i<10;i++) {
		  if(arr[i]<small) 
			  small=arr[i];
			  if (arr[i]>large) 
				  large=arr[i];
				  }
			  System.out.print("Largest No. is "+large +" and Smallest No. is "+small);
	      }
	  }
	

	


