package IOCUsingXML7.IOCUsingXML7.Implemets;

public class JS {
	
	public String message;
	public Practice practice;
	String name;


	public JS(String message, Practice practice) {
		this.message = message;
		this.practice = practice;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	

	public void disp() {
		System.out.println(name+" "+message);
		System.out.println(practice.timing);

	}
}
