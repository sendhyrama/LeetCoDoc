func maxProfit(prices []int) int {
    if len(prices) == 0 {
		return 0
	}

	minPrice := math.MaxInt64
	maxProfit := 0

	for _, price := range prices {
		// Update the min. price
		if price < minPrice {
			minPrice = price
		} else {
			// Calculate the current profit and update maxProfit
			profit := price - minPrice
			if profit > maxProfit {
				maxProfit = profit
			}
		}
	}
	return maxProfit
}