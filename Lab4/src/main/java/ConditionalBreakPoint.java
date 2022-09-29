/**
 * Strings in Java by definition are immutable
 * String are inherently array of characters, but unlike array you can manipulate one character of string in place.
 */
public class ConditionalBreakPoint  {
	
	public void breakOnConditionOnly(){
        String[] data1 = {"mz", "my", "my", "mx", "mz", "mx", "my", "mz", "mz", "my", "my", "mx", "mz", "mx", "my", "mz"};

        for(int i=0;i<data1.length;i++){
            String s = "Super : "+data1[i];
            System.out.println(s);
        }
    }
    
    public static void main(String[] args) {
    	ConditionalBreakPoint test = new ConditionalBreakPoint();
    	test.breakOnConditionOnly();
    }
    
}
