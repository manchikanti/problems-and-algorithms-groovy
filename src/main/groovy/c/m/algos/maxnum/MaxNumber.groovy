package c.m.algos.maxnum

class MaxNumber {

    Integer findMax(List numbers) {
        Integer maxSoFar = null
        numbers?.each { Integer number ->
            if (number != null && number > maxSoFar) {
                maxSoFar = number
            }
        }
        return maxSoFar
    }
}
