class MissingChar{
public static void main(String[] args) {

  missingChar("Robocop", 3);

  //receive command line argument if available
  if(args.length>=2){
    missingChar(args[0], Integer.parseInt(args[1]));
  }
}

private static void missingChar(String str, int n) {
	String result ="";
	for(int i = 0; i < str.length(); i++){
 		if(i != n){
 			result += str.charAt(i);
 		}
 	}
	System.out.println(result);
   }
}
