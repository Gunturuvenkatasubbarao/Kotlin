import java.util.Scanner;

class PointOfSale
{
	
	constructor(name:String,mob_num:Int,address:String,items:Int)
	{
		println("The Details are: ")
		println("Customer Name : ${name}")
		println("Customer Mob_Num : ${mob_num}")
		println("Customer Address: ${address}")
		println("-------------------------------")
		println("Item Details")
		println(" ")
		
		for(i in 1..items)
			{
				var pro_id = Integer.valueOf(readLine())
				val pro_name = readLine()!!
				var pro_price = Integer.valueOf(readLine())
				var pro_quant = Integer.valueOf(readLine())
				
				var obj = PointOfSale(pro_id,pro_name,pro_price,pro_quant)
				
		
				
				
			}
	}
	constructor(pro_id:Int,pro_name:String,pro_price:Int,pro_quant:Int)
	{
		println("The Product Id is : ${pro_id}")
		println("The Product Name is : ${pro_name}")
		println("The Product Price is : ${pro_price}")
		println("The Product Quant is : ${pro_quant}")
		
		var bill = pro_price*pro_quant
		println("")
		println("The Total Bill is : ${bill}")
	}
	
   
	
}
fun main()
{
	var sc = Scanner(System.`in`)
	val name = sc.nextLine()
	var mob_num:Int = sc.nextInt()
	val address = sc.next()
	var items = sc.nextInt()
	var obj = PointOfSale(name,mob_num,address,items)
}
