# input a page profile to yourself, copy it into other existing file
read -p "Enter a file name: " file1
echo "Enter the content of $file1 : "
cat > $file1
read -p "Enter another file name to copy the content: " file2
echo "displaying copy of contents from $file1 to $file2 : "
cp $file1 $file2
cat $file2