/*Скопируйте класс MainActivity, который найдете ниже. Допишите код,
для того чтобы получить в панели LogCat результат, который указан ниже.
У нас есть интервалы, которые обозначают качество оценки: bad, normal, nice, excellent.
Еще у нас есть массив с оценками gradeArray и массив с учениками nameArray.
Ваша задача используя цикл отсортировать учеников с оценками по группам,
в результате выход в панели LogCat должен получится такой:

Плохие оценки: Ученик: Маша – 3
Плохие оценки: Ученик: Семен – 2
Нормальные оценки: Ученик: Антон – 4
Нормальные оценки: Ученик: Светлана – 6
Хорошие оценки: Ученик: Егор – 7
Отличные оценки: Ученик: Юля – 10*/

fun main(args: Array<String>) {
    var bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10
    var gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()

    for ((index, name) in nameArray.withIndex()) {

        if (gradeArray[index] in bad) {
            badArray.add("Плохие оценки: Ученик: $name - ${gradeArray[index]}")
        }
        if (gradeArray[index] in normal) {
            normalArray.add("Нормальные оценки: Ученик: $name - ${gradeArray[index]}")
        }
        if (gradeArray[index] in nice) {
            niceArray.add("Хорошие оценки: Ученик: $name - ${gradeArray[index]}")
        }
        if (gradeArray[index] == excellent) {
            excellentArray.add("Отличные оценки: Ученик: $name - ${gradeArray[index]}")
        }
    }

    badArray.forEach {
        println(it)
    }

    normalArray.forEach {
        println(it)
    }

    niceArray.forEach {
        println(it)
    }

    excellentArray.forEach {
        println(it)
    }
}
