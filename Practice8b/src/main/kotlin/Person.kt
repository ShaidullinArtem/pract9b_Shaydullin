
package person
open class Person constructor(var fullName: String, var age: Int) {
    open fun getInfo(): String {
        return "$fullName, $age лет";
    }
}