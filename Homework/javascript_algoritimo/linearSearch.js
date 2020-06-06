function linearSearch(value){
var array = [1,2,3,4,5,6,7,8,9];
var size =0;

	while(size<array.length){
		if(value === array[size]){
			return console.log(`Number ${value} was found`);
		}
		size++;
	}
	return console.log(`Number ${value} wasn\'t found `);
 }

linearSearch(Number(process.argv.slice(2)[0]));


