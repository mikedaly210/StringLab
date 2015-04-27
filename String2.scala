object Lab1 {
    def main(args: Array[String]) {
        println("Please enter a string")
        var firstString : String = readLine()
        var len = firstString.length()
        println("You typed in: "+"""""""+firstString+""""""")
        println("Your sentence is " + len + " characters.")
        
        var z = firstString takeRight 1 
        if (z=="?") println("Your sentence is a interrogatory sentence.")
        else if (z==".") println("Your sentence is a declarative sentence.")
        else if (z=="!") println("Your sentence is an exclamation.")
        else println("This is not a sentence")
        
        println("Please enter a name: ")
        var name1 : String = readLine()
        val boo = name1.contains(",")
        if (boo == true) {
            println("Reformatted name: " +name1)
        }
        else if (boo == false) {
            val boo1 = name1.contains(" ") 
                if (boo1 == true) {
                val Array(x, y) = name1.split(" ")
                println("Reformatted name: "+y+", "+x)
                }
                if (boo1 == false) {
                println("Reformatted name: " + name1)
                }                          
        }
               
    }
    
}