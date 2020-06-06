class StrManipulations{
public static void main(String[] args) {

	String str = "http://www.academiadecodigo.org"; 
	String domain = str.substring(7); 
	String name = domain.substring(4,12).replaceFirst("a","A")
	       		+ " " + domain.substring(12,14)
	       	    	 + " " + domain.substring(14,20).replaceFirst("c","C");

	System.out.println("I am a Code Cadet at < "+ name + "_ >, " + domain );

// I am a Code Cadet at < Academia de Codigo_ >, www.academiadecodigo.org/

	}
}
