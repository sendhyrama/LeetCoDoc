/**
 * @param {number[]} gas
 * @param {number[]} cost
 * @return {number}
 */
var canCompleteCircuit = function(gas, cost) {
    const n = gas.length;
    let totalGas = 0;
    let currentGas = 0;
    let startingIndex = 0;
    
    for (let i = 0; i < n; i++) {
        totalGas += gas[i] - cost[i];
        currentGas += gas[i] - cost[i];

        // If currentGas becomes negative -> reset startingIndex & currentGas
        if (currentGas < 0) {
            startingIndex = i + 1;
            currentGas = 0;
        }
    }
    // If totalGas is negative -> no solution
    return totalGas >= 0 ? startingIndex : -1;  
};