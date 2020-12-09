/* inheritance in kotlin */
// driver code. First see how classes are working
fun main() {
	val tul = tulsi()
    tul.getEnergy()
    tul.move()
    val li = lion()
    li.getEnergy()
    li.move()
    // test class human here
    
}
open class living_things{
    open val legs = 4
    open fun getEnergy() { println("Search for food") }
    fun move() {
        if(legs == 0)	{ println("Cannot move") } 
        else			{ println("Moving with speed ${2*legs}")} 
    }
}
class tulsi : living_things(){
    override val legs = 0
    override fun getEnergy() { println("Do photosynthesis") }
}
class lion : living_things(){
    override fun getEnergy() { 
        super.getEnergy()
        println("Eat the food") }
}
/* create a class human. set it's legs to 2. And implemenent getEnergy
 * to print "Search for food" followed by "cook food" */
