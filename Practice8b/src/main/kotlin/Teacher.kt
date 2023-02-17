import person.Person

class Teacher constructor(fullName: String, age: Int) : Person(fullName, age) {

    fun rate(mark: Int): Int {
        return mark;
    }
}