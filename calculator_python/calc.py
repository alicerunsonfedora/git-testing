import sys

def main():
    """Runs the main program loop."""
    
    if len(sys.argv) != 2:
        print("Error: required argument <number> not specified")
        return
        
    number = sys.argv[1]
    
    if not number.isdigit():
        print (f"Error: specified argument '{number}' is not a number")
        return 1
    
    value = int(number)
    
    double = value * 2 # Multiply value by 2
    
    print(f"Your doubled value is {double}!")
    
if __name__ == "__main__":
    main()
