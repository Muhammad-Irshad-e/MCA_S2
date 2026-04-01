read -p "Enter 3 numbers: " a b c
if [ $a -gt $b ] && [ $a -gt $c ]
then
    echo "The largest number is: $a"
elif [ $b -gt $a ] && [ $b -gt $c ]
then
    echo "The largest number is: $b"
else
    echo "The largest number is: $c"
fi