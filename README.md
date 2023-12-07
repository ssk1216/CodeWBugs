# CodeWBugs

**CodeWBugs** is created using the student submissions collected by **CodeWrite**, a web-based tool designed by the University of Auckland to  support novice programmers[1]. Students wrote these programs to answer the various Java programming assignments. An initial data filtering process was carried out to identify a group of incorrect programs. A total of 106 programs, from 10 programming projects that focus on various fundamental Java concepts were selected to create this benchmark.   
#### Dataset Summary

 
|Project title | Project code | Number of programs |
|--------------|--------------|--------------------|
productIsEven |	PISE  |    6  
replaceCharacterAtPosition | RCP | 12 |
countOdds | CO |	7 |
magicNumbers | MN |	14 |
sumValues | SV | 10 |
swapEnds |  SE  |	9 |
reverse	| REV | 6 |
containersNeeded	| CN | 17 |
weeklyPay | WP | 	15 |
PositionofValueInArray| PVA| 10 |
 

#### Task Description
   

 The task description for each project is as follows:
     
1. ProductisEven :	Complete the  productIsEven()  method below. This method should calculate the  product  of the two input values and return  true  if the product is an even number, and false  if the product is an odd number.For example, the product of 10 and 20 is 
   200, and this is an even number, so the method call  productIsEven(10, 20)   should return  true.
2. replaceCharacterAtPosition :The replaceCharacterAtPosition()  method should replace the character at the specified position in the input String with the replacement character provided. For example,  replaceCharacterAtPosition(1, \"hello\", \'X\')  should return the 
   String  "hXllo\".  You can assume that the input String will contain at least one character and that the value of position will be a valid character position in the String.  You should make use of the substring() method to solve this exercise.
3. countOdds : The countOdds() method takes one array of positive integer values as input, and counts how many of those values are odd numbers.&nbsp; For example, if the input array is {1,2,3,4,5} the output will be 3 because 1, 3 and 5 are odd numbers. The array may be 
   empty, in which case the value returned should be 0. Complete the countOdds() method below.
4. Magic number	Two positive integers are said to be magic numbers  if they satisfy the following three properties: 
   both numbers are the same length (i.e. consist of the same number of digits)  2) the numbers must be different (i.e. the numbers cannot be the same)  3) the smaller of the two numbers is a divisor/factor (i.e. divides with no remainder) of the larger number 
      For example, the following pairs of numbers are \"magic\":
      900, 450 
      3000, 1000 
      90, 30 
      However, the following pairs of numbers are not  "magic " because they violate at least one of the three properties listed above:  
      100, 100 (these two numbers are the same) 
      1000, 100 (the number of digits in each number is different) 
      200, 101 (the smaller number is not a factor of the larger number) 
      Complete the magicNumbers() method which takes two input numbers and returns true if they are magic numbers and false otherwise. You can assume  that both input values will be  positive.
5. SumValues:	The  sumValues() methods takes two inputs: an array of integers, and a boolean called  "positivesOnly ". The method should calculate the sum of the values in the array, however if “positivesOnly " is true, then any 
  negative numbers in the array should be ignored and not contribute to the sum. For example, if the input array is {-1,2,-3,4,-5,6 } ,then calling sumValues() with "positivesOnly" being  true  should give 12 because only the positive values (2,4,6) are summed, whereas 
  if  "positivesOnly" is <strong>false</strong> the output should be: 3 ,because all of the values in the array are summed Note: the array may be empty, in which case the method should return 0.

6. SwapEnds	Complete the method called  swapEnds()  which takes one String as input.  It must return a new String, which is the same as the input String except that the first and last characters of the String are 
  swapped. For example, if the input String is  "Hello" , the output String must be  "oellH".
7. Reverse:	Mary creates an array of integers, however she realises that the values have been stored in the array in the opposite order to what she needs. She therefore would like to define a method to reverse the order of the values in the array.Her method, called reverse(), will be passed an array as input and will return a new array (note: the original input array is not changed) which contains the same values as the original input array but in reverse order For example if the input array is :  {1,2,3,4,5}, the new array returned by the method will be {5,4,3,2,1}.
8. Containersneeded : 	A factory requires a program to calculate the number of containers needed to store a given number of items. Each container can fit up to 10 items. In this exercise, you need to complete the function containersNeeded()  which is passed the number of items to store as an input parameter. The function should calculate and return the number of containers sufficient to store that many items. For example, if there are 10 items to store, then only 1 container is needed.  However, if there are 11 items to store, then 2 containers are needed (one container will be full, and the other will have just one item).
9. WeeklyPay: In this exercise, the pay that an employee earns each week depends on their age, the number of hours worked during normal business hours, and the number of overtime hours worked. The base pay  rate for all workers is \$15 per hour. On top of the base rate, each worker over the age of 20 earns an extra \$1 per hour for every year their age exceeds 20.  So, for example, a worker who is 25 years old, will receive a base pay rate of 15 + 5 = \$20 per hour.  However, this additional, age-based bonus is only valid up until the age of 40.  So, for example, a 40 and a 45-year-old will earn the same base rate. Finally, any overtime hours are paid at twice the base rate. Complete the weeklyPay()  method below which calculates the amount paid to an employee in one week, based on the number of normal and overtime hours worked, as well as the age. You should work in whole numbers (integers) only. if (age <= 20) 	extra = 0  elif (age > 20  and age <=40): extra = age - 20  (age > 40): 	extra = 20  baseWithAge = 15 + extra. result = (normalHours * baseWithAge)  + (overtimeHours * baseWithAge*2).
10. positionofValueInArray: The positionOfValueInArray() method is passed two parameters - the first is an array (\"values\") that contains integers, and the second is a number (\"find\") to search for in the array.  If the number is contained in the array, the method should return the   index position of the first occurrence of this number. If the number is not contained in the array, the method should return -1. You can assume that the array will contain at least one element.For example, if the input array is:{5,4,3,2,1,4} and the value to search for (i.e. find) is 4, then the method should return: 1 which is the index position of the first occurrence of the value 4 in the array. 
 
####  Reference 
1. Paul Denny, Andrew Luxton-Reilly, Ewan Tempero, and Jacob Hendrickx. 2011. CodeWrite: supporting student-driven practice of java. In Proceedings of the 42nd ACM technical symposium on Computer science education (SIGCSE '11). Association for Computing Machinery, New York, NY, USA, 471–476. https://doi.org/10.1145/1953163.1953299
