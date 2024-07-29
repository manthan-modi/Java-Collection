### Collections in Java

- The Collection Framework in Java Provides Implementation for Common Data Structure in Java

### ArrayList
An Array are of Fixed Fixed and cannot be Scalable. To Solve This Problem We Have a Container Called ArrayList;
Using ArrayList and List to insert Elements in a container;
```java
ArrayList<String> = new ArrayList<>();
List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        students.add("Manthan");
```
Adding All the Elements of A List in a Another List

```java
List<Integer> newList = new ArrayList();
newList.add(150);
newList.addAll(list);
```
Getting a Specific Index in an List

```java
System.out.println(list.get());
```
Removing at a particular index in Java

```
list.remove(2);
```
Removing a particular Integer in List
``` 
list.remove(Integer.valueof(30));
```

Clearing Entire List can be Accomplished by the function
```java
list.clear()
```
Updating a particular index in List can be accompllihed by function
```java
list.set(2, 1000);
```

### Iterators in Java

An Iterators helps us to iterate over values in Java. This is Done to ensure and Access Elements;p


```java
for (Integer element : list) {
    system.out(element);
}
Iterator<Integer> it = list.iterator();
    while (it.hasNext()) {
        System.out.println("iterator" + it.next());
    }
```

### Stack in Java

A Stack is Basically a First In LIFO Container in Java.
It has Mainlu three operation push, pop, peek;

```java
    Stack<Integer> animals = new Stack<>();
    animals.push("Pig");
    animals.push("Cow");
    animals.push("Cat");
    animals.push("Rat");
    animals.peek();
    animals.pop();
```

### Queue

A Queue is A FIFO Container which can be implemented using LinkList. A Queue
can have many functionalities mainly peek(), offer(), pool();

```java
Queue<Integer> queue = new LinkedList<>();
        // The Offer functionality is used to insert values inside a queue
        queue.offer(24);
        queue.offer(25);
        queue.offer(36);
        // The Pool functionality is used to remove a Element in Linklist;
        System.out.println(queue.poll());
```

#### Priority Queue

A Priority Queue Implements a head Data Structure inside the underhood. Arranges Elements Like it would have been inside a Heap;
Has all the functions similar to Queue.
It acts like a minheap if we do not pass any comparator;
```java
Queue <Integer> pq = new PriorityQueue<>();
Queue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
```

#### Double Ended Queue

A Double Ended is a Queue Where Elements can be inserted or deleted both from front and the back.
It has same functions what queue offers with extra feature of adding or deleting element at front and back

```java
       dq.offer(5);
       dq.offerFirst(3);
       dq.offerLast(5);
       dq.offerLast(5);

       dq.peek();
       dq.peekFirst();
       dq.peekLast();

       dq.poll();
       dq.pollFirst();
       dq.pollLast();
```

#### HashSet

A Hash set is used to store only unique elements. No change when an already existing
element is tried to be inserted inside

```java
Set <Integer> set = new HashSet<>();
        set.add(32);
        set.add(54);
        set.add(21);
        set.add(21);
        System.out.println(set);
        set.remove(21);
        System.out.println(set.contains(100));
        System.out.println(set.isEmpty());
        set.clear();
```

### LinkedHashset

It is a linklist implementation of a Hashset. Has all properties of a Hashset. However the Internal Implementation is such that it gives a order in which elements are pushed inside the set.

```java
Set<Integer> set = new LinkedHashSet<>();
```

### TreeSet

It is a Binary Implementation of a Hashset. Has all properties of a Hashset. However the Internal Implementation is such that all the elements are sorted.

```java
Set<Integer> st = new TreeSet<>();
```




