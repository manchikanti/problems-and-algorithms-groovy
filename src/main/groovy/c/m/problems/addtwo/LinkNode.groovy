package c.m.problems.addtwo

class LinkNode {
    Integer number
    LinkNode next

    LinkNode(Integer n) {
        if (n > 9 || n < 0) {
            throw new IllegalArgumentException('Number should <10 and >0')
        }
        this.number = n
    }

    LinkNode appendLink(LinkNode linkNode) {
        this.next = linkNode
    }

    static String toString(LinkNode linkNode) {
        StringBuilder sb = new StringBuilder()
        LinkNode currentNode = linkNode
        while (currentNode?.next) {
            sb.append("${currentNode.number} -> ")
            currentNode = currentNode.next
        }
        if (currentNode) {
            sb.append(currentNode.number)
        }
        return sb.toString()
    }

    static LinkNode toLinkNode(List l) {
        LinkNode startLinkNode = null
        LinkNode prevLinkNode = null
        l.each { Integer number ->
            LinkNode ln = new LinkNode(number)
            if (prevLinkNode) {
                prevLinkNode.appendLink(ln)
            } else {
                startLinkNode = ln
            }
            prevLinkNode = ln
        }
        return startLinkNode
    }
}
