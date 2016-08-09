package Collections;

import java.util.Arrays;

public class HashFunction {

	String[] theArray;
	int arraySize;
	int itemsInArray=0;
	public static void main(String[] args) {
		
		HashFunction theFunc=new HashFunction(30);
		String[] elementsToAdd = {"1","5","17","21","26"};
		
		theFunc.HashFunction1(elementsToAdd, theFunc.theArray);
		theFunc.displayTheStack();

	}

	HashFunction(int size){
		arraySize=size;
		theArray=new String[arraySize];
		Arrays.fill(theArray, "-1");
	}
	
	public void displayTheStack(){
		int increment=0;
		
		for(int i=1;i<=3;i++){
			int l=i*10;
			System.out.println("---------------------------------------------------------");
			for(int k=l-10;k<l;k++){
				System.out.print("|" + k + "|");
			}
			System.out.println("\n");
			
			for(int k=l-10;k<l;k++){
				System.out.print("|" + theArray[k] + "|");
			}
			System.out.println("\n");
			System.out.println("---------------------------------------------------------");
		}
		
	}
	
	public void HashFunction1(String[] stringsForArray, String[] theArray){
		for(int n=0;n<stringsForArray.length;n++){
			String newElementVal=stringsForArray[n];
			theArray[Integer.parseInt(newElementVal)]=newElementVal;
			
		}
	}
}
