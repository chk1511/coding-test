
public class PassingCars {

	public static void main(String[] args) {

		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
        
        int result = 0;
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
        
        if(result > 1000000000){
            result = -1;    
        }
        
        return result;
    }

}
