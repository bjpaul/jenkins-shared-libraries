
def factorial(number: int):
  if number == 1 or number == 0:
    return 1
  else:
    return number * factorial(number - 1)
  

if __name__ == "__main__":
  print(factorial(5))
