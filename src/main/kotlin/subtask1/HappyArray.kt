package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val arr = sadArray.toMutableList()
        var length = arr.size-1;
//        println(length)
        var k = true
        while (k) {
            k = false
            for ( i in 0..length) {
                if ( i > 0 && i != length ) {
                    println("index " + i)
                    if ( arr[i] > (arr[i+1] + arr[i-1]) ) {
                        k = true;
                        arr.removeAt(i)
                        length = arr.size-1;
                    }
                }
            }
        }

        println(arr)
        return arr.toIntArray()
    }
}
