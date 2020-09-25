package trueQuestion.tenth;

public class FastMultiply {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fast_mul(15,15));
	}
	
	static int fast_mul(int a,int b){
		if(a==0) return 0;
		int ans = 0;
		if((b&1)==1){
			ans = a;
		}
		b>>=1;
		while(b!=0){
			a<<=1;
			if((b&1)==1){
				ans+=a;
			}
			b>>=1;
		}
		return ans;
	}

}
