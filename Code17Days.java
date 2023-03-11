import java.util.Scanner;
     class Code17Days {
    	 public static void main(String[] args) {
    		Scanner sc=new Scanner(System.in);
            System.out.println("Enter The Day(Sun/Mon/Tue/Wed/Thu/Fri/Sat): ");
    		 String str=sc.next();
    		 switch(str)
    		 {
    		 case "Sun":
    			 System.out.println("Sunday");
    			 break;
    		 case "Mon":
    			 System.out.println("Monday");
    			 break;
    		 case "Tue":
    			 System.out.println("Tuesday");
    			 break;
    		 case "Wed":
    			 System.out.println("Wednesday");
    			 break;
    		 case "Thu":
    			 System.out.println("Thursday");
    			 break;
    		 case "Fri":
    			 System.out.println("Friday");
    			 break;
    		 case "Sat":
    			 System.out.println("Saturday");
    			 break;
    				  }
    	 }

}
