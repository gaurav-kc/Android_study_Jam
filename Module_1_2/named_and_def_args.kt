/* Named and default arguments in kotlin */
// a function that prints student info. First run this code. 
fun student( name:String, age:Int = 25 /* default value */, inCollege:Boolean = false /* default value */)
{
    println("Name is $name, age is $age, and inCollege is $inCollege")
}
//after running it once,
//implement a function mobilePhone with mandatory parameters brand,model and 
//default arguments as size=6, ram=4, resolution="1920x1080" and print all params


fun main()
{
   	//run this 
    student("Gaurav")
    student("Gaurav",21)
    student("Gaurav",22,true)		//order matters. No variable name 
    student(age=22, name="Gaurav")  //order doesn't matter but variable name has to be specified. This is called named argument
    student(inCollege=true, age=24, name="Gaurav")
//     mobilePhone("Apple","12")
//     mobilePhone(brand="OnePlus",model="8T",ram=12)

//     make different calls to test
}
