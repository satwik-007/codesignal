def almostEqualNumbers(nums):
    seenNumbers = {}
    ret = 0
    for num in nums:
        digits = 0
        findDigits = num
        while findDigits > 0:
            digits += 1
            findDigits //= 10

        power = 10**(digits - 1)
        prev = 0
        first = True
        originalNum = num
        for _ in range(digits):
            d = num // power
            rem = num - d*power
            for rep in range(0 + first, 10):
                if rep != d:
                    replaced = prev + (rep * power) + rem
                    ret += seenNumbers.get(replaced, 0)

            prev += d*power
            num = rem
            power //= 10
            first = False

        seenNumbers[originalNum] = seenNumbers.get(originalNum, 0) + 1

    return ret

nums = [1, 151, 241, 1, 9, 22, 351]
print(almostEqualNumbers(nums))