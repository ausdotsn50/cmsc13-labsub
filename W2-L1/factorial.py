# Title: Factorial Calculator
# Instruction: Write a program that computes the factorial of a positive integer N entered by the user.

def main():
    # Checks for value error
    while True:
        try:
            integer = int(input("Enter an integer: "))
            # Allowed values N (≥ 0)
            # Not allowed: N (< 0)
            if integer < 0:
                raise ValueError
            break
        except ValueError:
            continue
    
    # Prints the factorial 
    print(f"The factorial of {integer} is {factorial(integer)}.")

def factorial(N):
    if N == 0 or N == 1:
        return 1
    else:
        return N * factorial(N - 1)
    
if __name__ == "__main__":
    main()