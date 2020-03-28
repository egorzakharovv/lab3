package data

data class Student (
    val surname: String,
    val firstname: String
)

val studentList =
    arrayListOf(
        Student("Дарья", "Бутырская"),
        Student("Егор", "Захаров"),
        Student("Вячеслав", "Золотых"),
        Student("Владислав", "Краус"),
        Student("Ксения", "Кригер"),
        Student("Дмитрий", "Овчинников"),
        Student("Вячеслав", "Погодаев"),
        Student("Елена", "Попова"),
        Student("Дмитрий", "Хайлов"),
        Student("Максим", "Шанин")
    )