package AssigmentClassAndMethods;

public class Rectangle {
	
	/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a 
	 class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as arguments to it. */
	

	int length;
	int breadth;
	int newArea;

	int area(int newLength, int newBreadth) {

		newArea = newLength * newBreadth;

		return newArea;
	}

}
