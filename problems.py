

#Code for fun for problem number 5.23
def modulo16(n):
    print ("{} has remainder {} when divided by 16".format((5**n - 4*n - 1), (5**n - 4*n - 1) % 16))
    return (5**n - 4*n - 1) % 16 == 0


def test(n):
    i = 0
    while i < n:
        if modulo16(i) != True:
            print('FLAG')
        i = i++
test(5)
