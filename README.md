# ConcurrentModificationException in Java
This repository demonstrates a common error in Java: the ConcurrentModificationException, which occurs when attempting to modify a collection while iterating over it using methods that aren't designed for concurrent modification.  The example shows how to reproduce this error and provides a solution using an Iterator.

## Problem
The `ConcurrentModificationExceptionExample.java` file contains code that attempts to remove an element from an ArrayList while iterating using a for-each loop. This approach is unsafe and leads to the exception.

## Solution
The `ConcurrentModificationExceptionSolution.java` file demonstrates the correct way to remove an element during iteration using an Iterator. The iterator allows safe removal without throwing the exception. 