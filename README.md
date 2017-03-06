# grm2-lab4

Will Fung (W 7pm) and Grace Mazzarella (W 1pm)

Questions:
5.5:
- The runtime for the code in question is O(n^3) because it uses three nested for loops which run through all n elements.

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
- Let n = n + 1
  Observe that Sum(n + 1, i = 1) of 2i equals Sum(n, i = 1) of 2i + 2(n + 1)
  This equals n(n + 1) + 2(n + 1) which equals n^2 + 3n + 2
  Notice that n^2 + 3n + 2 can be rewritten as (n + 1)(n + 2), which can be rewritten as (n + 1)((n + 1) + 1)
  In this case, n = n + 1
  Substitution demonstrates that the result (n + 1)((n + 1) + 1) is equivalent to n(n + 1)
  Therefore Sum(n, i = 1) of 2i = n(n + 1)

6.3
- In the best case, bubbleSort will run through the items in need of sorting once and realizes nothing needs to be sorted, so no changes will be made and the program will finish.
-  In the average case, bubbleSort will run through about half the items, swapping them along the way.

6.4
- In the best case, bubbleSort only has to go through things once, so its performance is O(n).
-  In the worse case, bubbleSort has to go through both an outer while loop and an inner for loop, which yields O(n^2).
-  The average case is the worst case divided by two, which again yields O(n^2).

Contents of the Java files:
- Student.java contains the Student class and all necessary attributes
- MyVector.java contains the MyVector class and the necessary sorting mechanisms
- Comparators.java contains the information necessary to sort two Student objects based on certain attributes
- Analyze.java contains the instructions to create a MyVector, read in a phonebook, create Student objects from it and store them in MyVector, and sort the Student objects based on different comparators

Answers based off newphonebook.txt:
- The student whose name appears first in a phonebook sorted alphabetically by first name is Aalayah Rasheed.
- The student with the smallest SU box is Julia B Nawrocki, and the box's number is 1000. The student with the longest SU box is Kristof Redei, and box's number is 5008.
- The student with the most vowels in their name is [].
- The address shared by the most students is [], and their names are [...].
- The ten most common area codes are [...].
