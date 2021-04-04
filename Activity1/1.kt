package com.example.kotlinproj

	import java.util.*

fun main(){
  var sc = Scanner(System.`in`)
  print("Enter num1:")
  var num1=sc.nextInt()
  print("Enter num2:")
  val num2=sc.nextInt()
  val c=num1+num2
  val c1=num1-num2
  val c2=num1*num2
  val c3=num1/num2
  println("The addition of two number is=$c")
  println("The subtraction of two number is=$c1")
  println("The Multiplication of two number is=$c2")
  println("The division of two number is=$c3")
}
