/**
 * Convert a binary String to a Number
 */
exports.binaryToDecimal = function(str) {
return parseInt( str, 2 );
};

/**
 * Add two Numbers with a precision of 2
 */
exports.add =  function(a, b) {
return Math.round((a + b) * 1e10) / 1e10;
};

/**
 * Multiply two Numbers with a precision of 4
 */
exports.multiply =  function(a, b) {
return Math.round((a * b) * 1e10) / 1e10; 
};
