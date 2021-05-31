package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = 0
        for ( i in 0..bill.size - 1 ) {
            if (i != k) {
                sum += bill[i]
            }
        }
        var result = sum/2
        return if (result == b) "Bon Appetit" else (b - result).toString();
    }
}
