fun main (args:Array<String>){
    val car1 = Car()
    val ceo1 = Ceo()
    val Social = Social().Instagram()
    val person = Person("Jeff Bezo" , 45)
    val tony = Person("Tony Stark" , 50)
    val std1 = Student("Ms.Nalyn")
    val natcha = Animal()
    natcha.name = "Ms.Natcha" //Access Setter
    println(natcha.name) //Access Getter

    car1.brand = "Ford"
    car1.model = "Mustang"
    car1.year = 2003

    ceo1.name =  "Elon mask"
    ceo1.age = "145"
    ceo1.comp = "Facebook Company"
    ceo1.printCeo()


    println(Social.hi())
    println("${car1.brand}  ${car1.model}  ${car1.year}")
}