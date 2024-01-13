import sys
def factorial(number: int):
    if number == 1 or number == 0:
        return 1
    else:
        return number * factorial(number - 1)
  

if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Provide the number to calculate the factorail and rerun the job")
        exit(1)
    print(factorial(int(sys.argv[1])))
