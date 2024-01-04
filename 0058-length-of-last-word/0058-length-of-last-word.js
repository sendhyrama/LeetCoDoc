/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    s = s.trim();
    let lengthLastWord = 0;
    
    for (let i = s.length - 1; i >= 0; i--) {
        // Check 1st space
        if (s[i] === ' ') {
            break;
        }
        lengthLastWord++;
    }
    return lengthLastWord;
};