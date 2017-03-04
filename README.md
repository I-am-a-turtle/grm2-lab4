# grm2-lab4

Will Fung (W 7pm) and Grace Mazzarella (W 1pm)

Questions:
5.5:
- The runtime for the code in question is O(n^3) because it uses three for loops.

5.23:
- Prove that 5^n - 4n - 1 is divisible by 16 for all n >= 0;
- (5^n - 4n - 1) % 16 = 0;
    n = 3
    5^(n+1) - 4(n+1) - 1 = 5^n * 5 - 4n - 4 - 1 -> 112 % 12 = 0
    5^n - 4n - 1                                -> 16 % 16 = 0
    5^(n-1) - 4(n-1) - 1 = 5^n / 5 - 4n + 4 - 1 -> 0 % 16 = 0
    The statement is true for n, for n+1, and n-1, therefore true for all n.

5.26:
- Prove Sum(n, i = 1) of 2i = n(n + 1)

...

Contents of the Java files:
- Student.java contains the Student class and all necessary attributes
- MyVector.java contains the MyVector class and the necessary sorting mechanisms
- Comparators.java contains the information necessary to sort two Student objects based on certain attributes
- Analyze.java contains the instructions to create a MyVector, read in a phonebook, create Student objects from it and store them in MyVector, and sort the Student objects based on different comparators

Answers:
- The student whose name appears first is [].
- The student with the smallest SU box is [], and the box's number is []. The student with the longest SU box is [], and box's number is [].
- The student with the most vowels in their name is [].
- The address shared by the most students is [], and their names are [...].
- The ten most common area codes are [...].
