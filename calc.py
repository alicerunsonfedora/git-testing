import sys

def main():
    """Runs the main program loop."""
    print("Hello! Please enter a number and I will double it.")
    
    # FIXME: Can we replace this by grabbing args?
    value = int(input("What is your number?\n"))
    double = value * 2 # Multiply value by 2
    
    print(f"Your doubled value is {double}!")
    
if __name__ == "__main__":
    main()
