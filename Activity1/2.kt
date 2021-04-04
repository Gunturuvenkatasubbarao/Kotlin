import java.util.Scanner

class A
{
	constructor(num:Int)
	{
		var area = num*num*3.14
		var peri = 2*3.14*num
		var side = peri/4
		println("The area of Circle is ${area}")
		println("The Perimeter of Circle is ${peri}")
		println("The side of the square is ${side}")
	}
}
fun main()
{
	var sc = Scanner(System.`in`)
	var rad = sc.nextInt()
	var obj = A(rad)
	
}
