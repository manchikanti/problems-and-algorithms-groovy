package c.m.problems.addtwo

import spock.lang.Specification
import spock.lang.Unroll

class AddTwoReverseNumsSolution2Spec extends Specification {

    AddTwoReverseNumsSolution2 sut = new AddTwoReverseNumsSolution2()

    @Unroll
    def 'Number should be converted to linkNode and linkNode should be converted back to number #scenario'() {
        when:
        LinkNode linkNode = sut.toReverseLinkNode(number)
        then:
        LinkNode.toString(linkNode) == expectedResult
        sut.toNumber(linkNode) == number
        where:
        scenario       | number | expectedResult
        'Single digit' | 0      | '0'
        'Multi Digit'  | 298    | '8 -> 9 -> 2'
    }

    @Unroll
    def 'Two Sum Solution 2: #scenario'() {
        when:
        String result = LinkNode.toString(sut.getTwoSum(LinkNode.toLinkNode(list1), LinkNode.toLinkNode(list2)))
        then:
        result == expectedResult
        where:
        scenario           | list1     | list2     | expectedResult
        'Equal size'       | [1, 4, 3] | [2, 6, 1] | '3 -> 0 -> 5'
        'One list smaller' | [1, 3]    | [2, 6, 0] | '3 -> 9'
        'One list empty'   | []        | [7, 8, 6] | '7 -> 8 -> 6'
    }
}

