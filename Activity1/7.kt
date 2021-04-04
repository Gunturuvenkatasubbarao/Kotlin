//Writ	e a program to input a number n and display first n terms of Fibonacci series. E.g. if n = 8 then output should be 0 1 1 2 3 5 8 13.

fun main()
{
	var range = Integer.valueOf(readLine())
	var x = 0
	var y = 1
	print(x)
	print(" ")
	print(y)
	print(" ")
	for(i in 1..range-2)
		{   var z = x+y
			print(z)
			print(" ")
			x=y
			y=z
		}
}
