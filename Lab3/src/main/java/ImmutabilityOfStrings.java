/**
 * Strings in Java by definition are immutable
 * String are inherently array of characters, but unlike array you can manipulate one character of string in place.
 */
public class ImmutabilityOfStrings {
	
	public void breakOnConditionOnly(){
        String[] data1 = {"mz", "my", "my", "mx", "mz", "mx", "my", "mz", "mz", "my", "my", "mx", "mz", "mx", "my", "mz"};

        for(int i=0;i<data1.length;i++){
            String s = "Super : "+data1[i];
            System.out.println(s);
        }
    }
	
	public void breakOnException(){
        String[] a = {"mz" , "mx", "mz","my","my"};
        System.out.println(a[1]);
        System.out.println(a[6]);
    }
	
    public void replaceInString() {
    	StringBuilder sb = new StringBuilder("Java is a great language");
    	System.out.println("Before Replacing StringBuilder:: " +sb);
    	sb.replace(0,4,"C++");
    	System.out.println("After Replacing StringBuilder:: " + sb);
        String text = "Java is a great language";
        System.out.println("Before Replacing:: " +text);
        text = text.replace("Java", "C++");
        System.out.println("After Replacing:: " + text);
        int testInt = 1;
        System.out.println("int before: "+testInt);
        testInt++;
        System.out.println("int after: "+testInt);
        
//        System.out.println(replacement);
    }

    public void concatenateInString(){
        String a = "Hello";
        a = a + " "+ "World";
        System.out.println(a);
    }

    public void passAndManipulateString(){
        String text = "Lets check if I can be changed by passing to another function";
        String updatedText = iWillAttemptToChangeIncomingString(text);

        System.out.println("Your original text "+text);
        System.out.println("Your updated text "+updatedText);
    }

    private String iWillAttemptToChangeIncomingString(String text){
        text = "New updated text";
        return text;
    }
    
    public static void main(String[] args) {
    	ImmutabilityOfStrings test = new ImmutabilityOfStrings(); 
    	test.replaceInString();
    	test.concatenateInString();
    	test.passAndManipulateString();
    	test.breakOnConditionOnly();
    	test.breakOnException();
    }
    
}
