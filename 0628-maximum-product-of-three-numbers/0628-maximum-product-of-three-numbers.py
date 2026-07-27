class Solution:
    def maximumProduct(self, nums: List[int]) -> int:

        # Three largest numbers
        largest = float('-inf')
        secondLargest = float('-inf')
        thirdLargest = float('-inf')

        # Two smallest numbers
        smallest = float('inf')
        secondSmallest = float('inf')

        for num in nums:

            # Update the three largest numbers
            if num > largest:
                thirdLargest = secondLargest
                secondLargest = largest
                largest = num

            elif num > secondLargest:
                thirdLargest = secondLargest
                secondLargest = num

            elif num > thirdLargest:
                thirdLargest = num

            # Update the two smallest numbers
            if num < smallest:
                secondSmallest = smallest
                smallest = num

            elif num < secondSmallest:
                secondSmallest = num

        # Option 1: Three largest numbers
        product1 = largest * secondLargest * thirdLargest

        # Option 2: Two smallest (possibly negative) and the largest
        product2 = smallest * secondSmallest * largest

        return max(product1, product2)