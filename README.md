# DataStructuresAssign3


Overview

In this assignment you will be implementing the List Abstract Data Type (ADT) using two different implementations:

    Array Based List
    Linked List

In addition, you will also be writing a driver to test your List implementations and you will be measuring the run times and memory usage of each test case.

You will also be using the RunTime class that you created for Homework 1.

Finally, you will be analysing and comparing the performance of the test cases on both the Array Based List and the Linked List implementations.
Details

    RunTime Class

    You will copy the RunTime class that you created in Homework 1 to the project you are using for this assignment.
    Array Based List Class

    You will write the ArrayBasedList.java class which will implement the List Interface. The interface may be downloaded from ListInterface.java.

    Please note that you do not inherit from the RunTime class.
    Linked List Class

    You will write the LinkedList.java class which will implement the List Interface. The interface may be downloaded from ListInterface.java.

    Please note that you do not inherit from the RunTime class.
    Linked list Node Class

    Your will write the LinkedListNode. Please see the Linked List Node Documentation for all the methods you will need.

    Please note that you do not inherit from the RunTime class.
    Driver Class

    You will write the Driver.java class which will implement the Driver Interface. The interface may be downloaded from DriverInterface.java.

    Please note that you do not inherit from the RunTime class. However, you do have to use the RunTime class to measure run times.
    Test Cases

    All the elements being added and removed from the lists must be instances of the Integer class.

    You will test the following scenarios for both the Array Based List and the Linked List implementations:
        Driver.TestType.AddSortedOdd: Starting with an empty list, use the addSorted(I obj) method to add java.lang.Integer objects representing the odd numbers (1 ≤ n ≤ 9,999) to the list.
        Driver.TestType.AddSortedEven: Starting with a list containing the odd numbers less than 10,000, use the addSorted(I obj) method to add java.lang.Integer objects representing the even numbers (2 ≤ n ≤ 10,000) to the list.
        Driver.TestType.AddAll: Starting with an empty list, use the add(I obj) method to add 10,000 java.lang.Integer objects to the list.
        Driver.TestType.AddAllAtIndexZero: Starting with an empty list, use the add(Object obj, int index) method to add 10,000 java.lang.Integer objects to the list, all at index = 0.
        Driver.TestType.RemoveAllEven: Starting with a complete list containing 10,000 java.lang.Integer objects representing all the numbers (1 ≤ n ≤ 10,000); remove all the even numbers by repeatedly calling the remove(int index) method. Remove the even numbers starting with 2, then 4, then 6, ....
        Driver.TestType.RemoveAllOdd: Starting with a complete list containing 10,000 java.lang.Integer objects representing all the numbers (1 ≤ n ≤ 10,000); remove all the odd numbers by repeatedly calling the remove(int index) method. Remove the odd numbers starting with 9,999, then 9,997, then 9,995, ....
    Output From Driver Main Method

    Please note that, in addition to implementing the DriverInterface, you are also required to write your own public static main(String[] args) method in Driver.java.

    Your main() method will have to call the runTestCase() method for each of test cases listed above a total of ten times for each test case:

    For each call to the runTestCase() method your main() method will a table with the following output for the Array Based List and the Linked List implementations:

    Running test = Test Case Name
    		  Run 1   Run 2   Run 3   Run 4   Run 5   Run 6   Run 7   Run 8   Run 9  Run 10 Average Memory Usage
    		Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds   Mega Bytes
    		------- -------	------- -------	------- -------	------- -------	------- -------	------- ------------
    ArrayBasedList
    LinkedList
    	

    Please note that the run times and the average are in Seconds and the memory usage is in Mega Bytes. You will need to make the necessary conversions.
    Analysis:

    Using the tables you created by running Driver.main(), copy your results into a Microsoft Word document and answer the following questions using 1-3 complete sentences for each question:
        Discuss the difference in run times between the array based list and the linked list for all the test cases. Did the results match your expectations? Why or why not? Be as specific as possible.
        Are the run times ever similar for both the array based list and the linked lists? Why or why not? Be as specific as possible.
        In which test cases is the array based list faster than the linked list? Please explain the reason why or why not. Be as specific as possible.
        
        Link for requirements
        http://bit.ly/cmp338-s17-hw3

