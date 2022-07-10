fun main() {
    val values = (1..100).toList()
//    println(values)
    val key = 70

    println("Linear Search result: " + linearSearch(values, key))
    println("Binary Search result: ${binarySearch(values, key)}")

}

fun linearSearch(values: List<Int>, key: Int): Int {
    var linRes = -1
    var stepCount = 0
    for (i in values.indices) {
        stepCount++
        if (values[i] == key) {
            linRes = i
            break
        }
    }

    println("Linear Search Steps = $stepCount")

    return linRes
}

fun binarySearch(values: List<Int>, key: Int): Int {
    var low = 0
    var high = values.size - 1
    var stepCount = 0
    while (low < high) {

        val mid = (low + high) / 2
        stepCount++
        if (values[mid] == key) {
            println("Binary search steps = $stepCount")
            return mid
        } else if (values[mid] < key) {
            low = mid + 1
        } else {
            high = mid

        }

    }

    return -1
}