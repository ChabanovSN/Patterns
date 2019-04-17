package ru.chabanov.pattern

fun main(args: Array<String>) {
    val list = listOf("Solder", "Solder", "Solder", "ru.chabanov.pattern.Medic", "ru.chabanov.pattern.Priest")

    for (s: String in list) {
        println(EnglishArmyFactory().getPerson(s)!!.action())
    }
}


class EnglishArmyFactory {
    val solder = "Solder"
    val medic = "ru.chabanov.pattern.Medic"
    val priest = "ru.chabanov.pattern.Priest"

    fun getPerson(kindOfPerson: String): Army_Person? = when {
        solder.equals(kindOfPerson) -> SolderImpl("Рядовой")
        medic.equals(kindOfPerson) -> MedicImpl("лекарь 1-го ранга")
        priest.equals(kindOfPerson) -> PriestImpl("Прислужник")
        else -> null
    }
}

interface Army_Person {
    fun action()
}

abstract class Soldier : Army_Person {
    override fun action() {
        println("Призыв солдата")
    }
}

class SolderImpl(range: String) : Soldier() {
    var range1 = range
    override fun action() {
        super.action()
        println(" $range1 готов воевать")
    }
}

abstract class Medic : Army_Person {
    override fun action() {
        println("Призыв медика")
    }
}

class MedicImpl(range: String) : Medic() {
    var range1 = range
    override fun action() {
        super.action()
        println(" $range1 готов лечить")
    }
}

abstract class Priest : Army_Person {
    override fun action() {
        println("Призыв священика")
    }
}

class PriestImpl(range: String) : Priest() {
    var range1 = range
    override fun action() {
        super.action()
        println(" $range1 готов поднять боевой дух")
    }
}
