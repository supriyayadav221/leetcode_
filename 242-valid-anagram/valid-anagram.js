/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length != t.length)
    return false
    let hashmap = new Map();
    for(let i =0; i< s.length; i++) {
        if(hashmap.has(s[i])){
            hashmap.set(s[i], hashmap.get(s[i]) + 1);
        } else {
        hashmap.set(s[i],1);
            
        }
    }


        for(let j =0; j< t.length; j++) {

        if(hashmap.has(t[j])){

        hashmap.set(t[j], hashmap.get(t[j]) - 1);
        if(hashmap.get(t[j]) < 0){
            return false;
        }

           
        } else {
            return false;
        }

    }
return true;
    
};