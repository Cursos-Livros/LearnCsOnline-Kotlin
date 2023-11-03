package Practice

fun main() {
    println("Exemples of Nested Collections:")
    var favoriteIceCreams = mutableMapOf<String, String>("me" to "Peanut Butter Fudge")
    favoriteIceCreams["Gracie"] = "Human food yummy"
    favoriteIceCreams["Xyz"] = "Yick"
    println(favoriteIceCreams)

    var tasks = mutableMapOf<String, MutableList<String>>()
    addTask(tasks, "Xyz", "Sleep")
    addTask(tasks, "Xyz", "More sleeping")
    addTask(tasks, "Gracie", "Play with ball")
    println(tasks)


}

fun addTask(tasks: MutableMap<String, MutableList<String>>, name: String, task: String) {
    var currentTasks = mutableListOf<String>()
    currentTasks += task
    tasks[name] = currentTasks
}