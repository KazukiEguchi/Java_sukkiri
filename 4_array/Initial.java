public class Initial {
	public static void main(String[] args){
		int[] int_ary = new int[2];
		double[] double_ary = new double[2];
		boolean[] bool_ary = new boolean[2];
		String[] string_ary = new String[2];
		int[] int2_ary = {1, 2, 3};
		
		System.out.println(int_ary[0]);
		System.out.println(double_ary[0]);
		System.out.println(bool_ary[0]);
		System.out.println(string_ary[0]);
		for(int i = 0;i < 3;i++){
			System.out.println(int2_ary[i]);
		}
	}
}