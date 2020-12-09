/* oop android example in kotlin */
// driver code. First see how classes are working
fun main() {
	val c = child()
    c.onCreate()
    c.printVsize()
}
// class parent is open for inheritance
open class parent ()
{
    open val viewSize = 10
    open fun onCreate(){
        println("I'll do initialization work")
    }
}
class Button(){
    fun setText(text: String){
        println("Change the text to $text")
    }
    fun setText(id: Int){
        println("change the string with rid $id")
    }
}
class child : parent()
{
    override val viewSize = 45
    override fun onCreate(){
        super.onCreate()
        // setContentView() // creates all views and makes them accessible
        println("I will access the views and change it's properties")
        val b = Button()
        b.setText("Gaurav")
        b.setText(25)
    }
    fun printVsize()
    {
        print("viewSize is $viewSize")
    }
    
}
