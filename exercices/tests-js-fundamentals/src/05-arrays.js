/**
 * Determine the location of an item in the array
 */
exports.indexOf = function (arr, item) {
    return arr.findIndex(value => value === item);
};

/**
 * Sum the items of an array
 */
exports.sum = function (arr) {
    return arr.reduce((acc, value) => acc + value, 0);
};

/**
 * Remove all instances of an item from an array
 */
exports.remove = function (arr, item) {

    return arr.filter(value => value !== item);
};

/**
 * Remove all instances of an item from an array by mutating original array
 */
exports.removeWithoutCopy = function (arr, item) {

    while (arr.includes(item)) {
        arr.splice(arr.indexOf(item), 1);
    }

    return arr;

};
/**
 * Add an item to the end of the array
 */
exports.append = function (arr, item) {
    arr.push(item);
    return arr;
};

/**
 * Remove the last item of an array
 */
exports.truncate = function (arr) {
    arr.pop();
    return arr;
};

/**
 * Add an item to the beginning of an array
 */
exports.prepend = function (arr, item) {
    arr.unshift(item);
    return arr;
};

/**
 * Remove the first item of an array
 */
exports.curtail = function (arr) {
    arr.shift();
    return arr;
};

/**
 * Join two arrays together
 */
exports.concat = function (arr1, arr2) {
    return arr1.concat(arr2);
};

/**
 * Add an item to an array in the specified position
 */
exports.insert = function (arr, item, index) {
    return arr.reduce(function (acc, value, actIndex) {

        if (index === actIndex) {
            acc.push(item);
        }
        acc.push(value)
        return acc;
    }, []);
};

/**
 * Count the number of occurrences of an item in an array
 */
exports.count = function (arr, item) {
    return arr.reduce(function (acc, value) {
        if (item == value) {
            acc++;
        }
        return acc;
    }, 0);

};

/**
 * Find all items which container multiple occurrences in the array
 */
exports.duplicates = function (arr) {

    var aux =[]; 

    return arr.reduce(function (acc, val) {

        if (!aux.includes(val)) {
            aux.push(val);
        }else if(!acc.includes(val)){
        
            acc.push(val);
        }
        return acc;
    }, []);

};

/**
 * Square each number in the array
 */
exports.square = function (arr) {
    return arr.map(value => Math.pow(value, 2));
};

/**
 * Find all occurrences of an item in an array
 */
exports.findAllOccurrences = function (arr, target) {
    return arr.reduce(function (acc, val, index) {
        if (val === target) {
            acc.push(index);
        }
        return acc;
    }, []);
};
