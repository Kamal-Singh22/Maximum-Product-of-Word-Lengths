# Maximum-Product-of-Word-Lengths
You are given an array of strings words. Two words are compatible if they do not share any common letters.  Your task is to find the maximum value of length(word1) * length(word2) where the two words do not share any common letters. Return 0 if no such pair exists.
Explanation:
Bitmask Representation:

Each word is turned into a 26-bit integer (for 26 lowercase letters).

For example, the word "abc" becomes a bitmask like 000...0111.

Checking for Common Characters:

If two words have no common characters, the bitwise AND of their masks will be zero.

So, mask1 & mask2 == 0 means the words are compatible.

Max Product Calculation:

For each unique pair, check compatibility and calculate the product of lengths if valid.

Update maxProduct with the maximum.....
