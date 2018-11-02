# 455 Mid Term 1
* draw box make process clear
* (i + k) % arr.length to move elements left k posotions
* String length() and Array length
* Programmers who use the Time class don't have to do anything, because the interface doesn't change.
* partially filled array may have element with 0 value, should not use value to determine a end of partially filled array
* use the method of ImPoint in the code
* store continuous int values in an array during implementation
* initialize an object array, do not forget to **new** each element in the array 
* be carful about int or double types, no always int
* the valid range for startLoc is [0, namesArr.length]
* `locOfTarget == NOT_FOUND` use the constant name instead of the value
* copy java files use *.java

# 455 Mid Term 2
* while Hash Table insert an element, it has first to find if there is already a one in the LinkedList, search costs time
* Hash Size should be a prime, since we have to use modulus on the size, such as hash code % size
* for hashCode contract, if a.equals(b), then a.hashCode() == b.hashCode(), the converse contract is not true, if a and b have the same hashCode, it does not mean that a equals b.
* Set<Integer> uniqueValues = new HashSet<Integer>();
* LinkedList<Integer> result = new LinkedList();
* ListIterator<Integer> iter1 = list1.listIterator();
* use the interface on the exam code handout
* O(numAL), O(numAL), O(numLL), O(numLL^2) 

    ```
    public static boolean isSubset(LinkedList<Integer> list,
                                   LinkedList<Integer> sub) {
    
       ListIterator<Integer> iter = list.listIterator();
       ListIterator<Integer> subIter = sub.listIterator();
    
       while (iter.hasNext()) && subIter.hasNext()) {
          int curr = iter.next();     // values to compare are set at the beginning of the loop
          int subCurr = subIter.next();
          if (curr < subCurr) {
             subIter.previous();    // need to compare subCurr again:
                                    // may appear later in list
          }
          else if (curr > subCurr) {  // means subCurr isn't in list
             return false;
          }                           
          // else just compare the next two elements
      }
    
       return !subIter.hasNext();
          // if we get to end of list, only true if finished all in subList too
    }
    ```
    
* Object hashCode and equals will return the address of the object
* class DivBy3Tester implements ConditionTester 