def mergeSort(arr):
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

print(mergeSort([2,6,3,12,65,23,54,12,321,2]))