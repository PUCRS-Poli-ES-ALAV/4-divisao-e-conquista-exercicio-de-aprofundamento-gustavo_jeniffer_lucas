count = 0

def mergeSort(arr):
    global count
    count += 1
    if len(arr) <= 1:
        return arr
    corte = (len(arr)//2)
    min = mergeSort(arr[:corte])
    max = mergeSort(arr[corte:])

    result = []
    while (len(max) >= 1 and len(min) >= 1):
        if (min[0] < max[0]):
            result.append(min.pop(0))
        else:
            result.append(max.pop(0))
    return result + min + max

print(mergeSort([2,6,3,12,65,23,54,12,321,2]), count)

def MULTIPLY(x, y, n): 
    global count
    count += 1
    if (n == 1):
        return x * y

    m = n // 2
    a = x // (2 ** m)
    b = x % (2 ** m)
    c = y // (2 ** m)
    d = y % (2 ** m)

    e = MULTIPLY(a, c, m)
    f = MULTIPLY(b, d, m)
    g = MULTIPLY(b, c, m)
    h = MULTIPLY(a, d, m)

    return (2 ** (2 * m) * e) + (2 ** m * (g + h)) + f

count = 0
# teste-o para os 3 casos de valores inteiros: com 4 bits, com 16 bits e com 64 bits. Nestes testes, contabilize o número de iterações que o algoritmo executa, e o tempo gasto.
print(MULTIPLY(15, 15, 4), count)
count = 0
print(MULTIPLY(65535, 65535, 16), count)
count = 0
print(MULTIPLY(18446744073709551615, 18446744073709551615, 64), count)