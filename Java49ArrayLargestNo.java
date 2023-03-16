
class Java49ArrayLargestNo {

	public static void main(String[] args) {
		int arr[]= {34,65,75,32,67,98,23,35,87,66};
          int large,i;
          large=arr[0];
          for(i=1;i<10;++i) {
        	  if (arr[i]>large)
        		  large=arr[i];
          }
          System.out.print("Largest NO. Is: "+large);
	   }   
	}


