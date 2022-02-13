import sys

def main():
    """Runs the main program loop."""
    print("Hello! Please enter a number and I will double it.")
    
    # FIXME: Can we replace this by grabbing args?
    value = input("What is your number?")
    double = value * 2 # Multiply value by 2
    
    print(f"Your doubled value is {double}!")
    
if __name__ == "__main__":
    main()