Java Fundamentals 🚀

Welcome to my Java Fundamentals Repository! This repository covers essential Java concepts, from basic syntax to advanced topics like multithreading, collections, and functional programming.

🔥 Key Topics Covered

1️⃣ Core Java Basics

Java Syntax & Data Types

Operators & Control Statements (Loops, Conditional Statements)

Methods & Recursion

Arrays & Strings

📌 Example:

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

2️⃣ Object-Oriented Programming (OOPs)

Classes & Objects

Encapsulation, Abstraction, Inheritance, Polymorphism

Interfaces & Abstract Classes

📌 Example:

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}

3️⃣ Exception Handling

Types of Exceptions (Checked & Unchecked)

Try-Catch-Finally Blocks

Custom Exceptions

Exception Propagation

📌 Example:

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

4️⃣ Collections Framework

List (ArrayList, LinkedList, Vector)

Set (HashSet, TreeSet, LinkedHashSet)

Map (HashMap, LinkedHashMap, TreeMap, Hashtable)

📌 Example:

import java.util.*;
public class CollectionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        System.out.println(list);
    }
}

5️⃣ Stream API & Lambda Expressions

Functional Interfaces & Anonymous Classes

Lambda Expressions & Method References

Stream Operations (map, filter, reduce, collect)

Parallel Streams

📌 Example:

import java.util.*;
import java.util.stream.*;
public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squares);
    }
}

6️⃣ Multithreading & Concurrency

Thread Lifecycle & Thread Class

Runnable Interface & Executor Framework

Synchronization & Locks

Deadlock & Thread Communication (wait, notify, notifyAll)

📌 Example:

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

💻 Code Examples & Implementation

Each topic is accompanied by well-structured code examples, which can be found in respective folders.
