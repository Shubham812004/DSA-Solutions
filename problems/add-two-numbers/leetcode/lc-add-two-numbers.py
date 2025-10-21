class Solution(object):
    def addTwoNumbers(self, l1, l2):
        dummy = ListNode()
        curr = dummy
        carry = 0

        while l1 or l2 or carry:
            c = carry

            if l1:
                c += l1.val
                l1 = l1.next

            if l2:
                c += l2.val
                l2 = l2.next

            curr.next = ListNode(c % 10)
            curr = curr.next
            carry = c // 10   

        return dummy.next   