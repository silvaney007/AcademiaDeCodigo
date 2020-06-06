class ClosetNeighbours{
public static void main(String[] args) {

    int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};
    int[] result = findClosest(myArray);
    for(int i = 0;i<result.length;i++ ){
    System.out.println(result[i]);
    }
}

private static int[] findClosest(int[] numbers) {
		
       	int[] result = new int [2];	
   	int small = Math.abs(numbers[0]-numbers[1]);
   	
	for(int i = 1; i<numbers.length-1;i++){ 		
		if(small >  Math.abs(numbers[i]-numbers[i+1])){ 	
                                result[0] = numbers[i];                  //Find the two smallest neighbour value
                                result[1] = numbers[i+1];
				small=Math.abs(numbers[i]-numbers[i+1]);
                }
	}
	return result;
	
    }

}
