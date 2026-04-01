read -p "Enter the number of Fibonacci terms to display: " n
a=0
b=1
for i in $(seq 1 $n)
do
    c=$((a + b))
    echo $a 
    a=$b
    b=$c
done
