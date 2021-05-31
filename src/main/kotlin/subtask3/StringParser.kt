package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var openBrackets: Array<Char> = arrayOf('<','(','[')
        var closeBrackets: Array<Char> = arrayOf('>',')',']')
        val list: MutableList<String> = mutableListOf()
        var openBracket = ' '
        var closeBracket = ' '
        var m = 0
        for ( i in 0..inputString.length-1) {
            if ( inputString[i] in openBrackets) {
                m = 0
                openBracket = inputString[i];
                var openBracketIndex = openBrackets.indexOf(openBracket)
                closeBracket = closeBrackets[openBracketIndex]
                for (j in i..inputString.length-1) {
                    if (inputString[j] == closeBracket && m == 1) {
                        list.add(inputString.slice(i+1..j-1))
                        break
                    } else if (inputString[j] == openBracket) {
                        m++;
                    } else if (inputString[j] == closeBracket) {
                        list.add(inputString.slice(i+1..j-1))
                    }
                }
            }
        }
        println(list)
        return list.toTypedArray()
    }
}
