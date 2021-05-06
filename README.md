# hashtable

Which is a better hash function:
x % n where n is a large number with several factors
x % n where n is a large prime number

The prime number because it will minimize collisions. It's output is more likely to be unique.


Is char values summed % 599 a good hash function for strings? Why or why not?

No it will result in the function returning the same index for every string. 

Take a look at Java's HashMap class and how it produces hashed values. 

It stores values in key/value pairs. 

According to this thread: https://stackoverflow.com/questions/1959948/how-does-the-hashcode-method-of-java-works
The Object class generates a hashcode based off the memory address of the object?

