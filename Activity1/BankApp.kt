import java.util.Scanner

data class AddAccount(val acc_num:Int,val acc_name:String,val acc_type:String)
{
	
	
	override fun toString(): String{
		val to2Str = "{acc_num = ${acc_num}, name = ${acc_name} , Type = ${acc_type}}"
		return to2Str
	
}
	
}



class Display
{
	
}

open class BankMain
{
	var acc_num = 1
	var array = ArrayList<AddAccount>()
	fun add_account()
	{
		println("Enter Account Holder Name: ")
		var name = readLine()!!
		println("Enter Type of Account: ")
		var acc_type = readLine()!!
		println("Basic 500 amount added to the bank account!!")
		
		var obj = AddAccount(acc_num,name,acc_type)
		
		
		var array = ArrayList<AddAccount>()
		array.add(AddAccount(acc_num,name,acc_type))
		var arr = array.toString()
		println(arr)
		
		
	}
	fun display_accnum()
	{
		println("Enter Account Number: ")
		var acc_num = Integer.valueOf(readLine())
		
			
    
		
	}
}

fun main()
{
   var sc = Scanner(System.`in`)
	println("Bank Application")
	println("1.Open New Account")
	println("2.Deposit Amount")
	println("3.Withdraw Amount")
	println("4.Search by A/C no")
	println("5.Search by Name")
	println("6.CLose Account")
	println("7.Exit")
	while(true)
		{
	println("Enter Your Choice: ")
	var choice = sc.nextInt()
	
	var numberProvided = when(choice) {  
        1 ->  BankMain().add_account()
        2 -> "Two"  
        3 -> "Three"  
        4 -> BankMain().display_accnum()
		  
        5 -> "Five"  
        else -> "invalid number"  
    }
		}
}
