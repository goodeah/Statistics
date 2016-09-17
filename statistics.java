//Aaron Goode
//Calls on methods to calculate mean,median,mode,min,max,
//standard deviation,variance and length on the given array
//HW5
public class statistics {

	public static void main(String[] args) {
		int[] nums = {1,3,5,7,10,10};
		summary(nums);
	}
	
	//summary method calls on all calculations to print
	public static void summary(int[] inArray){	
		double result;
		result = mean(inArray);
		System.out.printf("Mean: %.0f %n", result);
		
		result = median(inArray);
		System.out.printf("Median: %.0f %n", result);
		
		result = mode(inArray);
		System.out.printf("Mode: %.0f %n", result);
		
		result = max(inArray);
		System.out.printf("Max: %.0f %n", result);
		
		result = min(inArray);
		System.out.printf("Min: %.0f %n", result);
		
		result = n(inArray);
		System.out.printf("N: %.0f %n", result);
		
		result = stddev(inArray);
		System.out.printf("Std Dev: %.6f %n", result);
		
		result = variance(inArray);
		System.out.printf("Variance: %.1f %n", result);
	}
//mean method calculates the average of the array
	public static double mean(int[]inArray){
		int total=0;
		for(int i=0; i<inArray.length;i++){
			total+=inArray[i];
		}
		return (double)total/inArray.length;
	}
//median method calculates the median of the array	
	public static double median(int[]inArray){
		double x;
		if (inArray.length% 2==0)
			x = ((double)inArray[inArray.length/2]+(double)inArray[inArray.length/2-1])/2;
		else{
			x = (double) inArray[inArray.length/2];
		}
		return x;
	}
//mode method calculates the number that shows up most frequently in the array
	public static int mode(int[] inArray){
		int themode = 0; 
		int y =0;
		for (int i=0; i< inArray.length; i++){
			int count=0;
			for (int m=0; m<inArray.length;m++){
				if (inArray[m]==inArray[i]) ++count;
			}
			if (count>y){
				y = count;
				themode = inArray[i];
			}
		}
		return themode;
		
	}
//max method returns the highest number in the array
	public static int max(int[] inArray){
		int themax=inArray[0];
		for(int i=1; i< inArray.length;i++){
			if (inArray[i] > themax){
				themax = inArray[i];
			}
		}
		return themax;
	}
//min method returns the lowest number in the array
	public static int min(int[] inArray){
		int themin=inArray[0];
		for (int i=1; i<inArray.length;i++){
			if (inArray[i] < themin){
				themin = inArray[i];
			}
		}
		return themin;
	}
//n method returns the length of the array
	public static int n(int[]inArray){
		int number = inArray.length;
		return number;

	}
//stddev method returns the standard deviation of the array
	public static double stddev(int[] inArray){	
		double mean = mean(inArray);
		double x=0;
		double stdsum= 0;
		for (int i = 0; i< inArray.length; i++){
			stdsum += (inArray[i]-mean)*(inArray[i]-mean);
		}
		x = Math.sqrt(stdsum/(inArray.length-1));
		return x;
		
	}
//variance method returns the variance of the array
	public static double variance(int[] inArray){
		double mean = mean(inArray);
		double x=0;
		double stdsum= 0;
		for (int i = 0; i< inArray.length; i++){
			stdsum += (inArray[i]-mean)*(inArray[i]-mean);
		}
		x = (stdsum/(inArray.length-1));
		return x;

	}

}
