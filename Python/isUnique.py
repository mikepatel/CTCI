# Determines whether a string consists of all unique characters

# Input: string
# Output: boolean

# Time: O(n)
# Space: O(n)

#################################################################
# IMPORTs
import sys

#################################################################


def check_if_unique(s):
    chars = {}  # dictionary

    for char in s:
        if char in chars:  # have I seen this char before?
            return False  # yes, seen before, so string cannot be comprised of all unique chars

        chars[char] = True  # mark that I have now seen this char

    return True


if __name__ == "__main__":
    string = sys.argv[-1]
    result = check_if_unique(string)
    print("Does '%s' have all unique characters?" % string)
    print(result)
