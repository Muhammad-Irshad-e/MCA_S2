while true
do
    read -p "Enter two numbers: " a b
    read -p "Enter an operator (+, -, *, /): " op
    case $op in
        "+") result=$((a + b)) ;;
        "-") result=$((a - b)) ;;
        "*") result=$((a * b)) ;;
        "/")
            if [ $b -ne 0 ]; then
                result=$((a / b))
            else
                echo "Error: Division by zero is not allowed."
                continue
            fi
            ;;
        *) echo "Invalid operator. Please try again." ;;
    esac
    echo "Result: $result"
    read -p "Do you want to perform another calculation? (y/n): " choice
    if [[ "$choice" != "y" ]]; then
        break
    fi
done