read -p "Enter a string to reverse: " str
l=${#str}
rev=""
for i in $(seq $l -1 1)
do
    a=${str:$((i-1)):1}
    rev="$rev$a"
done
echo "Reversed string: $rev"
