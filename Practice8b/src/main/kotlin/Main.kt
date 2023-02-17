

fun main(args: Array<String>) {
    var enrollee: Enrollee = Enrollee("Артём", 18);
    var teacher: Teacher = Teacher("Жапражак", 45);

    var faculty: Faculty = Faculty("Востоковедение и африканистика", "Культура стран", 40)
    var exam: Exam = Exam("История")

    println(enrollee.register(faculty))
    println(enrollee.passExam(exam))

    var examMark = teacher.rate(5);
    var mark: Mark = Mark(enrollee, teacher, examMark, exam);

    mark.pass()

}