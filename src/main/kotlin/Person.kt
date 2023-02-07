//1.Primary Constructor
class Person constructor(val fname:String,age:Int) {
    val firsName:String
    val parage:Int

    //initials block
    init {
        firsName = fname
        parage = age

        println("First Name = $firsName Age = $age")
    }
}