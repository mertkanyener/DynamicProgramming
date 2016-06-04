
public class Programs {
	/*public int cutRod(int[] p, int n){
		if(n==0)
			return 0;
		else{
			int q = Integer.MIN_VALUE;
			for(int i = 0; i < n; i++){
				q = Math.max(q, p[i] + cutRod(p, n - i));
			}
			return q;
		}	
	}
	
	public int memoizedCutRod(int[] p , int n){
		int[] r = new int[n];
		for(int i = 0; i < n; i++){
			r[i] = Integer.MIN_VALUE;
		}
		return memoizedCutRodAux(p,n-1,r);
		
	}
	
	public int memoizedCutRodAux(int[] p, int n, int[] r){
		int q;
		if(r[n]>=0)
			return r[n];
		else{
			if(n==-1){
				q = 0;
				return q;
			}
			else{
				q = Integer.MIN_VALUE;
				for(int i = 0; i < n; i++){
					q = Math.max(q, p[i] + memoizedCutRodAux(p,n-i,r));
				}
			}
			r[n] = q;
			return q;
		}
	}
	
	public boolean checkArr(int[] arr, int n){
		boolean result = false;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]==n){
				result = true;
			}
		}
		return result;
	}
	
	public int recMinCoins(int[] coinList, int change){
		int minCoins = change;
		if(checkArr(coinList, change)){
			return 1;
		}
		else{
			
		}
		
	}
	*/
	public int fibonacci(int n){
		if(n<=1)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public int fibonacciDynamic(int n){
		if(n==1){
			return 1;
		}
		int[] r = new int[n];
		r[0] = 1;
		r[1] = 1;
		for(int i = 1; i < n; i++){
			if(i!=n-1)
				r[i+1] = r[i-1] + r[i];
		}
		return r[n-1];
	}
	
}
