# Day-6: Integer to Roman
Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules:
If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.
Given an integer, convert it to a Roman numeral.

**TestCases:**
a. Input: num = 3749   Output: "MMMDCCXLIX"
b. Input: num = 58     Output: "LVIII"

**Intution:**
Roman numerals are built by subtracting the largest possible value first.
Example:
3549 →
->Largest Roman numeral ≤ 3549 is 1000 (M) → subtract 1000, result = 2549 → "M"
->Repeat: subtract another 1000 → result = 1549 → "MM"
->Subtract another 1000 → result = 549 → "MMM"
->Largest ≤ 549 is 500 (D) → result = 49 → "MMMD"
->Largest ≤ 49 is 40 (XL) → result = 9 → "MMMDXL"
->Largest ≤ 9 is 9 (IX) → result = 0 → "MMMDXLIX"
->We stop when the number becomes 0.

**Algorithm**
1.prepare 2 fixed arrays:
a[] → integer values in descending order.

b[] → corresponding Roman numeral strings.

2.Initialize an empty string s.

3.Loop over all Roman numeral values (largest to smallest):

4.While n >= a[i]:

5. Append b[i] to s.

6. Subtract a[i] from n.

7. When n = 0 → stop.

8. Return the built string s.


**Complexities:**
Time Complexity:O(N)
Space Complexity:O(1)
