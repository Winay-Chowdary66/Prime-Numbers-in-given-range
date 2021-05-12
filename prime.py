#Prime numbers from 1 to 100

def isPrime(n):
    if n <= 1:
        return False
    for i in range(2, n):
        if n%i == 0:
            return False
    return True
    
start = 1
destiny = 100
for i in range(start, destiny+1):
    if isPrime(i):
        print(i)
