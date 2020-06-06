function binarySearch(value){
var array = [0];

	do{
		var size = array.length;	
		var midle = Math.floor(size/2);	
		if(value === array[midle]){
			return console.log(`Number ${value} was found`);
		}else if(value > array[midle]){
			array = array.slice(midle+1);
		}else if(value<array[midle]){
			array = array.slice(0,midle);
		}else{
			return console.log(`Number ${value} wasn\'t found`);
		}
	}while(size > 0);		
}

binarySearch(Number(process.argv.slice(2)[0]));
