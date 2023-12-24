func maxProfit(prices []int) int {
    totalProfit := 0

    for i := 1; i < len(prices); i++ {
        // If the current price is higher than the previous day, consider it for profit
        if prices[i] > prices[i-1] {
            totalProfit += prices[i] - prices[i-1]
        }
    }

    return totalProfit
}