/* Kotlin class demo */
// driver function. First see how classes are made in kotlin
fun main(args: Array<String>) {
    val person1 = Person("Ajay", 25)
    person1.printfancy()
    val person2 = Person2("Sagar")
    person2.printfancy()
    // try creating other objects here
    
    // try printing firstName and age of the objects
    
}

// c++ type initialization. Difference is, in c++, we use classname as 
// function name to define constructors, here we use keyword constructor
// Also, init is a new type of optional function. If declared in a class,
// this is the first function which is executed. Even before constructors
// Observe the print statements carefully to see this
// Also, there can be multiple init blocks. 
// The init blocks are executed in same order if there are more than one
class Person{
    val firstName: String	//a public variable is accessible outside class
    private var age: Int	//a private variable isn't
    // traditional way of declaring a constructor
	constructor(fName: String, personAge: Int=30)
    {
        firstName = fName.capitalize()
        age = personAge
		println("From class Person, fn constructor. Class members have been initialized")
    }
    // initializer blocks
    init 
    {
        println("From class Person, fn init block 1.")
        // try printing fName here. It will throw error
        
        // try printing firstName here. It will throw error
        // as init is executed before constructor. Hence 
        // firstName and age are not yet initialized
    }
    init 
    {
        println("From class Person, fn init block 2.")        
    }
    fun printfancy()
    {
        print("From class Person, fn printFancy, ")
        println("firstName is $firstName, age is $age")
    }
}
// in kotlin, a constrcutor can be in class header part as well
// In this case, the init block will have access to the variables
			// this is a constructor
class Person2(fName: String, personAge: Int=30){
    val firstName: String	//a public variable is accessible outside class
    private var age: Int	//a private variable isn't 
	init
    {
        firstName = fName.capitalize()
        age = personAge
		println("From class Person2, fn init block 1. Variables initialized")
    }
    // initializer block
    init 
    {
        println("From class Person2, fn init block 2")
        // try printing fName here. It'll work
        
        // try printing firstName here.
        
    }
    fun printfancy()
    {
        print("From class Person2, fn printFancy, ")
        println("firstName is $firstName, age is $age")
    }
}
