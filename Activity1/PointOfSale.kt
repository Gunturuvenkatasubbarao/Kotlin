import java.util.Scanner;

class PointOfSale
{
	
	constructor(name:String,mob_num:Int,address:String,items:Int)
	{
		
	    
		println("The Customer Name is : ${name}")
		println("The Customer Mobile Number is : ${mob_num}")
		println("The Customer Address is : ${address}")
				
					
				
	}
}
	
	
   
	

fun main()
{
	var sc = Scanner(System.`in`)
	println("Customer Name: ")
	val name = sc.nextLine()
	println("Customer Mob Num: ")
	var mob_num:Int = sc.nextInt()
	println("Customer Address: ")
	val address = sc.next()
	println("Enter Number Of Items: ")
	var items = sc.nextInt()
	println("Enter Poduct Details:  ")
	var array = ArrayList<Any>()
	var bill = 0
	for(i in 1..items)
		{
			println("Enter Product Id: ")
				var pro_id = Integer.valueOf(readLine())
		     	array.add(pro_id)
				println("Enter Product Name: ")
				val pro_name = readLine()!!
			    array.add(pro_name)
				println("Enter Product Price: ")
				var pro_price = Integer.valueOf(readLine())
			    array.add(pro_price)
				println("Enter Product Quantity: ")
				var pro_quant = Integer.valueOf(readLine())
			    array.add(pro_quant)
			    bill = bill+(pro_quant*pro_price)
		}
	var obj = PointOfSale(name,mob_num,address,items)
	println()
	println("Product Details")
	var j=0
	for(i in 1..items)
		{
			println("Product Id is : ${array.get(j)}")
			j++
			println("product Name is : ${array.get(j)}")
			j++
			println("Product Price is : ${array.get(j)}")
			j++
			println("Product Quant is : ${array.get(j)}")
			j++
			
		}
	println()
	
	println("The Total bill is ${bill}")
	println("--------------------")
	println("Thanks For Shopping!")
}
