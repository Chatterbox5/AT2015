package wonderousNumbers;

public class WonderNum {

	public static int alg(int num){
		int prod=num;
		int steps=0;
		while(prod!=1){
			if(prod%2==0){
				prod/=2;
				steps++;
			}
			else{
				prod=prod*3+1;
				steps++;
			}
		}
		return steps;
	}
	public static void main(String[]args) {
		int [] nums = new int[100];
		for(int i=1; i<=100;i++)
			nums[i-1]=alg(i);
		int max=0;
		for(int i=0; i<nums.length;i++)
			if(nums[i]>nums[max])
				max=i;
		System.out.println(max);
	}
}
