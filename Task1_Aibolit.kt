fun main() {
    
    val Sharik = Dog("meat","doghouse")
    val Matroskin = Cat("fish","cat carrier")
    val Ogonek = Horse("wheat","barn")
    
    val patients : Array<Animal> = arrayOf(Sharik, Matroskin, Ogonek)
    
    val Aibolit = Veterinar()
    
    patients.forEach {
        Aibolit.treatAnimal(it)
    }
}

open class Animal()
{
    open val food : String = ""
    open val location : String = ""
 
    open fun makeNoise(){
        println("Animal makes noise.")
    }
 
    open fun eat(){
        println("Animal eats $food")
    }
 
    open fun sleep() : String{
        return "Animal sleeps"
    }
}

open class Dog constructor(_food: String, _location : String) : Animal()
{
    override val food : String
    override val location: String
    
    init {
        food = _food
        location = _location
    }
 
    override
    fun makeNoise(){
        println("The dog makes noise: Woof!")
    }
 	
    override
    fun eat(){
        println("The dog eats $food")
    }
    
 	override
    fun sleep() : String{
        return "The dog sleeps"
    }
}

open class Cat constructor(_food: String, _location : String) : Animal()
{
    override val food : String
    override val location: String
    
    init {
        food = _food
        location = _location
    }
 
    override
    fun makeNoise(){
        println("The cat makes noise: Meow!")
    }
 	
    override
    fun eat(){
        println("The cat eats $food")
    }
    
 	override
    fun sleep() : String{
        return "The cat sleeps"
    }
}


open class Horse constructor(_food: String, _location : String) : Animal()
{
    override val food : String
    override val location: String
    
    init {
        food = _food
        location = _location
    }
 
    override
    fun makeNoise(){
        println("The horse makes noise: Neigh!")
    }
 	
    override
    fun eat(){
        println("The horse eats $food")
    }
    
 	override
    fun sleep() : String{
        return "The horse sleeps"
    }
}

open class Veterinar()
{
    fun treatAnimal(animal: Animal)
    {
    	println("Current animal status: eats ${animal.food} ; now locates at the ${animal.location}")
    }
}