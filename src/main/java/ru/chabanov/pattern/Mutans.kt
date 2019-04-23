package ru.chabanov.pattern

interface CatableK{
    var name: String
    fun mew()
    fun climb()
}

class CatK (override var name: String): CatableK {

    override fun mew() {
               println("Кот $name может мяукать")
    }

    override fun climb() {
        println("Кот $name может лазить по деревьям")
    }
}

interface DogableK{
    var name: String
    fun bark()
    fun guard()
}
class DogK( override var name: String) : DogableK {
    override fun bark() {
            println("Пес $name может лаять")
    }

    override fun guard() {
        println("Пес $name может охранять")
    }
}

class CatAdapterK( val dog: DogableK) : CatableK {
    override var name: String
        get() = dog.name
        set(value) {}

    val mutant = "Кот мутант ${dog.name} он же -"

    override fun mew() {
        print(mutant)
        dog.bark()
    }

    override fun climb() {
        print(mutant)
      dog.guard()
    }
}

fun main() {
    val cat = CatK("Барсик")
    cat.mew()
    cat.climb()
    val dog = DogK("Бобик")
     dog.bark()
    dog.guard()
    val mutant = CatAdapterK(dog)
        mutant.climb()
        mutant.mew()


}