public class findingnum {
	public static void main(String[] args) {
		int[] numArray = {34,54,64,42,34,56,44,65,87,23,57,74};//array to keep integer numbers 
		int biggestNumber=numArray[0];//assign numbers in numArray to variable biggestNumber
		for(int num:numArray){//for loop ,what does the(int num:numArray)do,where numArray is an array of int
			if(biggestNumber<num)//condition-if do check num is bigger than number keep in numArray to output biggest number
				biggestNumber=num;//assign biggest number to variable biggestNumber
		}
		int smallestNumber=numArray[0];//assign numbers in numArray to variable smallestNumber
		for(int num:numArray){//for loop ,what does the(int num:numArray)do,where numArray is an array of int
			if(smallestNumber>num)//condition-if do check num is smaller than number keep in numArray to output smallest number
				smallestNumber=num;//assign smallest number to variable smallestNumber
		}
		System.out.println("The Biggest Number:"+biggestNumber);//to print biggest number in numArray
		System.out.println("The Smallest Number:"+smallestNumber);//to print smallest number in numArray
		}
	
}
