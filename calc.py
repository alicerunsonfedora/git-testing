import sys

def main():
    """Runs the main program loop."""
    
    if len(sys.argv) != 2:
        print("Error: required argument <number> not specified")
        return
    
    if not sys.argv[1].isdigit():
        first_arg = sys.argv[1]
        print (f"Error: specified argument '{first_arg}' is not a number")
        return 1
    value = int(sys.argv[1])
    double = value * 2 # Multiply value by 2
    
    print(f"Your doubled value is {double}!")
    
if __name__ == "__main__":
    main()
