package c.m.problems.addtwo

import spock.lang.Specification
import spock.lang.Unroll

class AddTwoReverseNumsSolution1Spec extends Specification {

    AddTwoReverseNumsSolution1 sut = new AddTwoReverseNumsSolution1()

    @Unroll
    def 'Two Sum Solution 1: #scenario'() {
        when:
        String result = LinkNode.toString(sut.getTwoSum(LinkNode.toLinkNode(list1), LinkNode.toLinkNode(list2)))
        then:
        result == expectedResult
        where:
        scenario           | list1     | list2     | expectedResult
        'Equal size'       | [1, 4, 3] | [2, 6, 1] | '3 -> 0 -> 5'
        'One list smaller' | [1, 3]    | [2, 6, 0] | '3 -> 9 -> 0'
        'One list empty'   | []        | [7, 8, 6] | '7 -> 8 -> 6'
    }
}
