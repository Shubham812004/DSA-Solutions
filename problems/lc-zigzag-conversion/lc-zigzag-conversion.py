class Solution(object):
    def convert(self, s, numrows):
        if numrows == 1 or numrows >= len(s):
            return s

        rows = [""] * numrows
        curr_row = 0
        going_down = False

        for c in s:
            rows[curr_row] += c

            if curr_row == 0 or curr_row == numrows -1:
                going_down = not going_down
            curr_row +=1 if going_down else -1
        return "".join(rows)        