# Remove Duplicate characters from string using Hash tables

def remove_duplicates(s):
    # we should create hash dict for all 26 lower case letters by filling with zeros
    hash_arr = [0 for _ in range(26)]
    ns = "" # new result string
    for i in s:
        # if we meet a letter, reassign hash value by index to 1
        # append to result string
        if (hash_arr[ord(i) - 96] == 0):
            hash_arr[ord(i) - 96] = 1
            ns += i
    return ns

if __name__ == '__main__':
    
    s = input()

    # s = 'aabbbbccdef'

    result = remove_duplicates(s)
    
    print(result)
