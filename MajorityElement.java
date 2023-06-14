public class MajorityElement
{
    
    static int majorityElement(int[] arr){
        int mE = -1;
        int count = 0;
        
        // Find a potential majority element
        for(int i : arr){
            if(count == 0){
                mE = i;
                count++;
            } else if(i == mE) {
                count++;
            } else {
                count--;
            }
        }
        //verify actual majority element
        count = 0;
        for(int i : arr){
            if(i == mE){
                count++;
            }
        }
        //check if the majority element exits
        if(count > arr.length/2)
            return mE;
            
        return -1;
        
    }
    
	public static void main(String[] args) {
		int[] arr = {2,4,5,5,5,5,5};
		System.out.println(majorityElement(arr));
	}
}
