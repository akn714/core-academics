# Default Methods
***ref***: https://www.geeksforgeeks.org/default-methods-java/

* Before Java 8, interfaces could have only abstract methods.
* The implementation of these methods has to be provided in a separate class.
* So, if a new method is to be added in an interface, then its implementation code has to be provided in the class implementing the same interface.
* To overcome this issue, Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation without affecting the classes that implement the interface.

***Run the code***
```shell
javac -d . DM.java
java notes.FunctionalProgramming.DefaultMethods.DM
```