/* Functions in kotlin
 * fun <function_name> ( arg1: datatype, arg2: datatype ) : <return_type> 
 * {
 * 		<function_body>
 * }
 * If your function returns nothing, don't use colon and don't specify any return type
 */
fun calcSum( a:Int, b:Int ) : Int 
{
    return (a+b)
}

fun printSum( a:Int, b:Int, sum:Int)
{
    println("Sum of $a and $b is $sum")
}
// write a function getAge taking 2 arguments, string(name) and integer(birthyear)
// and return the age to main. 
fun main()
{
    val sum = calcSum(5,4)
    printSum(5,4,sum)
    // uncomment this after you implement the function
    // println(getAge("Sagar",1998))
    
}
