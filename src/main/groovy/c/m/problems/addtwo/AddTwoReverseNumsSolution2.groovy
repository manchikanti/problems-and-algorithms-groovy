package c.m.problems.addtwo

//This solution works if leading zeroes should be ignored.
class AddTwoReverseNumsSolution2 {

    LinkNode getTwoSum(LinkNode list1, LinkNode list2) {
        println LinkNode.toString(list1)
        println LinkNode.toString(list2)
        LinkNode list3 = toReverseLinkNode(toNumber(list1) + toNumber(list2))
        println LinkNode.toString(list3)
        return list3
    }

    Integer toNumber(LinkNode linkNode) {
        Integer number = 0
        LinkNode currentNode = linkNode
        Integer digitPositionMultiple = 0
        while (currentNode) {
            if (digitPositionMultiple == 0) {
                number = currentNode.number
                digitPositionMultiple = 10
            } else {
                number = digitPositionMultiple * currentNode.number + number
                digitPositionMultiple *= 10
            }
            currentNode = currentNode.next
        }
        return number
    }

    LinkNode toReverseLinkNode(Integer number) {
        if (number >= 0 && number <= 9) {
            return new LinkNode(number)
        }
        Integer temp = number
        LinkNode startNode
        LinkNode prevNode = null
        while (temp != 0) {
            Integer n = temp % 10
            temp = temp / 10
            LinkNode linkNode = new LinkNode(n)
            if (prevNode) {
                prevNode.next = linkNode
            } else {
                startNode = linkNode
            }
            prevNode = linkNode
        }
        return startNode
    }

}
