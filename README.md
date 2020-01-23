# TestProject

Assume that you need a collection that has a ratio of inserts to searches of 1:100. Use Big O Notation to determine whether a linked list or a binary tree would be the best solution under average circumstances. 

In case of SortedLinkedList, for insertion and searching, both processes require O(n) time complexity where n are the integers in the list, 
however, in SortedTree case, for both insert and search, we need to traverse only O(h) where h is the height of tree and this will always be less than O(n) of 
SortedLinkedList.

The height of a skewed tree may become n and the time complexity of search and insert operation may become O(n).

Tree would be a better fit when insert:search ratio is 1:100.

