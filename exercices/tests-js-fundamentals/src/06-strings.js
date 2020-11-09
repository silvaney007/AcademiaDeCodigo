/**
 * Reduce duplicate characters to a desired minimum
 */
exports.reduceString = function (str, amount) {
    return str.split('').reduce((acc, val) =>{
        console.log(val)
        val in acc ? acc[val]++ : acc[val]=1;
        return acc;
    }, {})
};

/**
 * Wrap lines at a given number of columns without breaking words
 */
exports.wordWrap = function (str, cols) {
    return str.split(' ').reduce((acc, val) => {
        if(acc === '') {
            acc += val;
        }else if (val.charAt(0) === 'a'){
            acc += '\n' + val;
        } else {
            acc += ' ' + val;
        }
        return acc;
    },'')
};

/**
 * Reverse a String
 */
exports.reverseString = function (str) {
    return str.split('').reverse().join('');
};

/**
 * Check if String is a palindrome
 */
exports.palindrome = function (str) {

    var str2 = str.split('').reverse().join('');

    return str === str2;

};
