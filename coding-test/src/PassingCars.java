
public class PassingCars {

	public static void main(String[] args) {

		int result = solution(new int[5]);
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        
		long result = 0;
        int oneCnt = 0;
        
        int size = A.length;
        for(int i=(size-1); i>-1; i--){
            
            if(A[i] == 1){
                oneCnt++;
                continue;
            }else{
                result+=oneCnt;   
            }
        }
        
        return result > 1000000000 ? -1 : (int)result;
    }

}
