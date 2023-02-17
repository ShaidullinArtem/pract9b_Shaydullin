

class Mark constructor(var enrollee: Enrollee, var teacher: Teacher, var mark: Int, var exam: Exam) {
    fun pass() {
        println("Преподаваттель ${teacher.fullName} поставил абитуриенту ${enrollee.fullName} оценку $mark за эказамен по предмету ${exam.subject}")
        if (mark > 2) println("Абитуриент ${enrollee.fullName} сдал экзамен")
        else println("Абитуриент ${enrollee.fullName} не сдал экзамен")
    }
}