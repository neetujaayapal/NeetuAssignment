package Interview;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "@#%!^&yrau";

		String removeds = s.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(removeds);

	}

}
