package trueQuestion.tenth;

public class FastExponentiation {
	public static void main(String[] args){
		System.out.println(fast_exponentiation(5,3));
	}
	
	static int fast_exponentiation(int a,int b){//int类型可能会在数值较大时爆掉，根据具体情况选择long或int
		if(a==0) return 0;
		int ans = 1;
		while(b!=0){
			if((b&1)==1){//&为位运算，相当于二进制的b取最后一位。若最后一位为1，则执行乘法；否则略过
				ans*=a;
			}
			b=b>>1;//>>为位运算，相当于二进制的b去掉末位
			a*=a;
		}
		return ans;
	}
}
