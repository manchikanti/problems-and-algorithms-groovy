package c.m.problems.addtwo

class AddTwoReverseNumsSolution1 {

    LinkNode getTwoSum(LinkNode list1, LinkNode list2) {
        println LinkNode.toString(list1)
        println LinkNode.toString(list2)

        LinkNode list1Current = list1
        LinkNode list2Current = list2
        LinkNode list3
        LinkNode list3Current
        Integer carryOver = 0
        while (list1Current || list2Current) {
            Integer number1 = list1Current?.number ?: 0
            Integer number2 = list2Current?.number ?: 0
            Integer sum = number1 + number2 + carryOver
            Integer number3
            if (sum >= 10) {
                carryOver = 1
                number3 = sum - 10
            } else {
                carryOver = 0
                number3 = sum
            }
            LinkNode linkNode3 = new LinkNode(number3)
            if (list3Current) {
                list3Current.appendLink(linkNode3)
                list3Current = linkNode3
            } else {
                list3Current = linkNode3
                list3 = list3Current
            }
            list1Current = list1Current?.next
            list2Current = list2Current?.next
        }
        if (carryOver) {
            list3Current.appendLink(new LinkNode(1))
        }
        println LinkNode.toString(list3)
        return list3
    }

}
