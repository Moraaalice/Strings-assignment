import java.time.Year

fun main(){

    println(rec("Alice","24"))

    var stringlength1=stringlength("anitab")
    println(stringlength1.length)

val text = "akirachix"
    println(text[1]+""+text[3]+text[4])

    println(name("Moraa"))
}
fun rec(name:String, age:String):String{
    var sentence = "Hi,my name is $name and am $age years old"
    return sentence
}
fun stringlength(name:String):String{
    var stringlength1= name
    return stringlength1
}
fun name (name1:String){
    val call = "Moraa"
    if (name1==call){
        println("Thats me")
    }
    else{
        println("I don't know who that is")
    }

}

