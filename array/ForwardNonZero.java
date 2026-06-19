/*
Question 25: Move all zeros in an array to the end while maintaining the relative order of 
non-zero elements.
Input:
Array = [0, 1, 0, 3, 12]

Output:
Array = [1, 3, 12, 0, 0]

Explanation:
Traverse the array and shift all non-zero elements forward while keeping their order the same, 
then place all zeros at the remaining positions at the end.
*/
import java.util.Scanner;
class ForwardNonZero
