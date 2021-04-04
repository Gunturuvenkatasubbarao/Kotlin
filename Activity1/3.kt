//. Write a program to input marks of three subjects of a student calculate and display total and percentage of student
fun main()
{
	var num1 = Integer.valueOf(readLine())
	var num2 = Integer.valueOf(readLine())
	var num3 = Integer.valueOf(readLine())
	
	var res = {x:Int,y:Int,z:Int ->
		var sum = x+y+z
		
		
	println("The Total is ${x+y+z}")
		println("The Percentage is ${(sum/3)}")
	}
	res(num1,num2,num3)
	
	
}
