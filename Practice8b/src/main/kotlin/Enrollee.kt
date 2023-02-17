import person.Person

class Enrollee constructor(fullName: String, age: Int) : Person(fullName, age) {

    fun register(faculty: Faculty): String {
        return "Абитуриент $fullName зарегетрировался на факультет ${faculty.title}";
    }

    fun passExam(exam: Exam): String {
        return "Абитуриент $fullName сдаёт экзамен по предмету ${exam.subject}"
    }
}