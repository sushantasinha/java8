
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

Function: Implemnet a functionaloty and assgn that functionaloty to a variable
R apply(T t);
It has 2 default methods compose() and andThen()

BiFunction:
public interface BiFunction<T, U, R> {
    R apply(T t, U u);
}

IT has only one default methof called andThen()


UnaryOperator: 
public interface UnaryOperator<T> extends Function<T, T> {
    static <T> UnaryOperator<T> identity() {
        return t -> t;
    }
}

So, we have Function already, so under what scenario, we should use UnaryOperator?
Ans: We have a scenario, where input and output is same type,.


public interface BinaryOperator<T> extends BiFunction<T,T,T> {}
i.e. 2 input and 1 output are of same type;
This BinaryOperator has 2 static methods minBy() and maxBy() [Note these 2 methods are NOT defaut methods]

So, if the input and output types are same, then we can use UnaryOperator and BinaryOperator instead of Function

So FUnctional Interface can have multiple metods, one has to be abstract methods, others are defaut methos... (need to check of it allow multiple non abstract method which are not default method) 

Supplier: This is exactly opposite of Consumer
public interface Supplier<T> {
    T get();
}






 

 