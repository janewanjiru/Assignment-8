fun main() {
   number()
   println(names("Jackline","Veronicah","Jane","Harriet"))
    robot(6)
    robot(15)
    robot(20)
    checkNumbers()



}
fun number(){
    for(num in 1..100){
        if (num%2 !=0)
            println(num)
    }
}
fun names(name1:String,name2:String,name3:String,name4:String):Int {
    var names = arrayOf(name1, name2, name3, name4)
     var sum =0
    for (letter in names)
        if (letter.length > 5) {
            sum++
        }
        return sum

}
fun robot(age:Int){
    if(age<=6 ) {
        println("A glass of milk")
    }
    else{
        if(age<=15){
            println("A bottle of fanta orange")
        }

        else {
            println("A bottle of cocacola")
        }
    }
}
fun checkNumbers(){
    for (m in 1..100){
        if(m%3==0 && m%5==0) {
            println("FizzBuzz")
        }
        else if (m%3==0){
            println("Fizz")
        }
        else if(m%5==0){
            println("Buzz")
            }
            else{
              println(m)

            }


    }
}






