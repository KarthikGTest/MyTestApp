package packageB;

public class MyMessage extends packageA.Message {
	String getText() {
		return "My Message";
	}

	public static void main(String args[]) {
		System.out.println(new MyMessage().getText());
	}
}
