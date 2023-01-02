# Junit Assignment
## Project Description

The Repository contains a maven project with queue extended from [Princeton's Intro to programming](https://introcs.cs.princeton.edu/java/43stack/) sample.
You are the developer who is supposed to write the unit test case for this class.
The client required a simple Java class which implements the Queue Data structure. As the developer you wrote the code and the same was pushed in this repository.

**The problem:** The "dequeue" method has a bug : The developer has forgot to throw an exception when the queue is empty.

## Complete the following Tasks.
### Task 1 : Create Passing test cases
Create Unit test cases for the code in this repository. The tests should have 100% instruction & branch coverage for both constructors, enqueue, dequeue, peek, length, isEmpty, removeAll methods.


### Task 2:  Create Test case that *fails* revealing the underlying fault
Write a test case which exercises the program to find the fault in the dequeue method. 
Bug : The class does not throw an exception when dequeue function is called on an empty queue. Remember the intended behaviour of the dequeue method in a queue data-structure is throw an exception if it is called on a queue is empty. You find the problem is that: someone commented a part of your code (Line 147 & 148) after you pushed the same.

**Note** after writing this test case: 

> mvn test

will state that one of your test case is failing

Hint : Your test case would expect a NoSuchElementException, but that is not thrown hence this test case will make your mvn test fail, and this the expected behaviour.



