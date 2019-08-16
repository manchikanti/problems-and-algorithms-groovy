package c.m.problems.addtwo

import spock.lang.Specification
import spock.lang.Unroll

class LinkNodeSpec extends Specification {

    @Unroll
    def 'LinkNode should accept single digit positive number #scenario'() {
        when:
        LinkNode linkNode = new LinkNode(number)
        then:
        number == linkNode.number
        where:
        scenario         | number | expectedException
        'Single digit 1' | 1      | false
        'Single digit 0' | 0      | false
    }

    @Unroll
    def 'LinkNode should not accept non single digit positive number #scenario'() {
        when:
        LinkNode linkNode = new LinkNode(number)
        then:
        thrown(IllegalArgumentException)
        where:
        scenario                | number
        'Null'                  | null
        'Single digit negative' | -1
        'Two digit number 10'   | 10
    }
}
