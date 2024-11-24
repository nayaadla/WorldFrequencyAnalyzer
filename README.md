# WorldFrequencyAnalyzer
Overview
This Java program analyzes a given text to calculate the frequency of each word. It processes the input, removes punctuation, converts it to lowercase for uniformity, and displays the frequency of each word in the text.

Features
User Input: Accepts a text input from the user.
Word Frequency Analysis:
Removes punctuation and ignores case sensitivity.
Counts the frequency of each word in the input.
Formatted Output: Displays each word along with its frequency.
How It Works
Input Processing:
Removes special characters and converts the input to lowercase.
Splits the text into words using whitespace as the delimiter.
Frequency Calculation:
Uses a HashMap to store each word and its frequency.
Updates the frequency for every occurrence of a word.
Display:
Outputs the word-frequency pairs to the console.
Customization
Punctuation Removal: Modify the regular expression in text.replaceAll("[^a-zA-Z0-9\s]", "") to handle additional cases.
Case Sensitivity: Remove .toLowerCase() if case-sensitive analysis is needed.
License
This project is open-source and available under the MIT License. Feel free to modify and use it.






