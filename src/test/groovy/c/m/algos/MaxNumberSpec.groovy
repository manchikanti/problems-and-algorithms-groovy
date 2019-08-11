package c.m.algos

import spock.lang.Specification
import spock.lang.Unroll

class MaxNumberSpec extends Specification {
    MaxNumber sut = new MaxNumber()

    @Unroll
    def 'Using max so far: #scenario'() {
        when:
        Double max = sut.findMax(inputs)
        then:
        max == expectedResult
        where:
        scenario           | inputs                            | expectedResult
        'Null input'       | null                              | null
        'Empty input'      | []                                | null
        'Positive numbers' | [4, 5, 2, 89, 10]                 | 89
        'Negative numbers' | [-4, -5, -2, -89, -10]            | -2
        'Mixed Numbers'    | [null, 4, 5, -2, 89, 0, null, 10] | 89
    }
}
