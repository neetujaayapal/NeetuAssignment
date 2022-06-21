package ClassPrograms;

public class Student {

	String name;
	int maths;
	int biology;
	int english;
	int social;
	int physics;
    
	double calculatePercentage() {
		
        int sumOfSubject = maths+biology+english+social+physics;
		
		return sumOfSubject * 100 / 500;

	}
}