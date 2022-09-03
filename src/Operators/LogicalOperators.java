package Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// && , || ,!

		
		int score = 90;
		int reqScore = 70;

		int bioScore = 90;
		int reqBioScore = 80;

		boolean IsEligibleForAdmission = score >= reqScore && bioScore >= reqBioScore;

		System.out.println("Eligible for admission =" + IsEligibleForAdmission);

		String userName = "abc@gmail.com";
		String enteredUserName = "abc@gmail.com";

		String password = "abcd";
		String enteredPassword = "abcd";
		
		boolean isUserNameSame = userName.equals(enteredUserName);
				
		boolean isPasswordSame = password.equals(enteredPassword);
		
		boolean isSame = isUserNameSame && isPasswordSame;
		
		System.out.println(isSame);
		
		String userNameQa = "abc@gmail.com";
		String enteredUserNameQa = "ac@gmail.com";

		int passwordLi = 12345;
		int enteredPasswordLi = 1235;
		
		boolean isuserNameQaSame = userNameQa.equals(enteredUserNameQa);
		
		boolean isPasswordLisame = passwordLi ==enteredPasswordLi;
		
		boolean areBothSame = isuserNameQaSame && isPasswordLisame;
		System.out.println(areBothSame);		

}
	
}	



