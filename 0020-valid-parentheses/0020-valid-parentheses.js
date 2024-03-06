/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const stack = [];
    const brackets = { '(': ')', '{': '}', '[': ']' };
    
    for (let char of s) {
        if (brackets[char]) {
            stack.push(char);
        } else {
            const lastBracket = stack.pop();
            if (char !== brackets[lastBracket]) {
                return false;
            }
        }
    }

    return stack.length === 0;
};