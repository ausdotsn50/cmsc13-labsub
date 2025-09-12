# Title: Sum of Integers
# Instruction: Write a program that computes the sum of all integers from 1 to N, where N is entered by the user.

def main():
    # Checks for value error
    while True:
        try:
            integer = int(input("Enter an integer: "))
            # Allowed values N (≥ 1)
            # Not allowed: N (< 1)
            if integer < 1:
                raise ValueError
            break
        except ValueError:
            continue
    
    # Prints the factorial 
    print(f"The sum of all integers from 1 to {integer} is {sum(integer)}.")

def sum(N):
    if N == 1:
        return 1
    else:
        return N + sum(N - 1)
    
if __name__ == "__main__":
    main()