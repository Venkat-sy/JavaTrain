/*
190. Reverse Bits
Reverse bits of a given 32 bits unsigned integer.
Input: n = 00000010100101000001111010011100
Output: 964176192 (00111001011110000010100101000000)
Explanation: The input binary string represents 43261596, output represents 964176192.
*/
﻿public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        return result;
    }
}
