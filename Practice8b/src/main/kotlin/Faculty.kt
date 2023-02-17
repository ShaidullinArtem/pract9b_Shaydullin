

class Faculty constructor(var title: String, var direction: String, var freePlaces: Int) {
    fun getInfo(): String {
        return "Факультет $title, имеет направление $direction с количеством мест: $freePlaces";
    }
}