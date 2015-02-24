package Chapter2;

public class ArrayAsigning {
	public static void main(String[] args){
	int[] nums;
	nums=new int[5];
	nums[0] = 6;
	nums[1] = 16;
	nums[2] = 26;
	nums[3] = 15;
	nums[4] = 10;
	for(int i=0; i<nums.length; i++){
		System.out.println("nums value  " +  i  +" is "   + nums[i]);
	}
	     
}
}
