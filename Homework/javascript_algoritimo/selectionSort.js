function selectionSort(array){

	for(i=0;i < array.length-1;i++){	
		for(j=i+1 ; j< array.length;j++){
			if(array[j] < array[i]){
				let shortValue=array[j];
				array[j] = array[i];
				array[i] = shortValue;
			}
		}
	}
	return console.log(array);
}

selectionSort(process.argv.slice(2).map(value=>Number(value)));
