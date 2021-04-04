//Write a program to display first n Prime numbers.
fun main(){
	print("Enter the n value:")
	var num=Integer.valueOf(readLine())
	for(i in 1..num){
		var count = 0
		for(j in 1..i)
			{
				if(i%j==0)
					{
						count++
					}
			}
		if(count==2)
			{
				print(i)
				print(" ")
			}
	}
}
