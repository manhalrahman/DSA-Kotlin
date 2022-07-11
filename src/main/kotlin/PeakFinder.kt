fun main() {
    val arr = (10 downTo 1).toList()
    val x = InitOrderDemo(name = "manhal")


}


fun sortedState(num: Int) {

}

fun findPeak(values : List<Int>): Int {
    if(values.isEmpty()) {
        return 0
    }

    return (values.size-1)
}

fun isSorted(values: List<Int>): Int {

    // reverse sorted = -1
    // not sorted = 0
    // right sorted = 1
    var sortedValue = 1
    for(i in 1 until values.size-1) {
        if(values[i] < values[i-1]) {
            sortedValue = -1
            break
        }
    }

    if(sortedValue != 1) {
        for(i in values.size-1 downTo 1) {
            if (values[i] > values[i - 1]) {
                sortedValue = 0
                break
            }
        }
    }

    return sortedValue


}

