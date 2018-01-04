package com.bruce.test

/**
  * Created by 10082H on 2018/1/4.
  */
object ScalaTest {
  def main(args:Array[String]): Unit ={
      println("Hello Scala===============");
      //数据类型 Byte Short Int Long Float Double Boolean Char String
      //特有的类型 Unit Null Nothing Any AnyRef
      var name:String = "zxl";
      println(name);
      //for 循环
      var a:Int=333;
      for (a<- 1 to 10){
        println("To a="+a);
      }
      //或者
      for(a <- 1 until 10){
        println("Until a="+a);
      }

      //循环list
      var myList = List(7,-1,3,4,5,6);
      for(a <- myList){
        println("List a="+a);
      }
      //带条件的循环
      for(a <- myList;if a != -1; if a>5){
          println("Condition a="+a);
      }
      //yield
      var retVal = for{ a <- myList
                        if a != 3; if a < 8
      }yield a
      for(a <- retVal){
          println("yield a="+a);
      }
      println(sum(1,3))
      println(getBoolean(10));

      //object 与 class 的区别
  }
  //定义匿名函数
  var sum = (x:Int,y:Int) => x+y;

  def getBoolean(x:Int):Boolean = true;
}
