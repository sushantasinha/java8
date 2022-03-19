
Lambda: Is equivalent to method, without a name. It is also referred as Anonymous function. It can also be asigned to a variable and passed around.
```() -> {}

Lambda is mainly used to implement Functioanl Interfaces (SAM). Functioanl Interfaces is a an interface which has exactly 1 abstract method

@FunctionalInterface

New Functioanl Interfaces introduces in Java 8:

COnsumer
Predicate
Function 
Supplier


Consumer:
Consumer has one method called "accept" [java.util.function]
It accept an input and perform some operation on that: void accept(T t);
Except the "accept" method which needs to be implemented, there are few default methods as well like andThen() etc.

BiConsumer: It accepts 2 inputs

Predicate: boolean test (T t);
default method of predicate: and() or() negate(). negate() reverse the boolean resposne i.e. if response is true, it will return false and vice versa.
BiPredicate: BiPredicate:boolean test(T t, U u);


So FUnctional Interface can have multiple metods, one has to be abstract methods, others are defaut methos... (need to check of it allow multiple non abstract method which are not default method) 








 

 