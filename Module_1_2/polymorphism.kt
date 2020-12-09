/* polymorphism in kotlin */
// driver code. First see how classes are working
fun main() {
	val stud = Student()
    stud.setinfo("Gaurav")
    stud.setinfo(45)
    stud.printdetails()
    // after the implementation, uncomment below lines to test
//     stud.setinfo(true)
//     println("Value of ismtech is ${stud.isMtech}")
}

class Student{
    var name:String = "None"
    var rollno:Int = -1
    // add a boolen variable isMtech and keep default as false
    
    fun setinfo(name:String) { this.name = name }
    fun setinfo(rollno:Int) { this.rollno = rollno }
    // implement setinfo for isMtech variable
    
    fun printdetails() { println("Name is $name and rollno is $rollno")} 
}
