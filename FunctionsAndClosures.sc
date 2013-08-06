import java.util.Date

var increase = (x: Int) => x + 1

increase(4)

increase = (x: Int) => x + 9999

increase(4)
List(1, -2, 3, -5).filter((x) => x > 0)
List(1, -2, 3, -5).filter(x => x > 0)
List(1, -2, 3, -5).filter(_ > 0)
val f = (_ : Int) + (_ : Int)
f(1,2)
//Partially applied functions
def sum(a : Int, b : Int, c : Int) = a + b + c
val a = sum _
a(1, 2, 3)
val b = sum(1, _ : Int, 3)
b(2)

// Closures, closes around value of "more"

def makeIncreaser(more: Int) = (x : Int) => x + more
val i1 = makeIncreaser(1)
val i999 = makeIncreaser(999)
i1(10)
i999(10)

//Repeated parameters

def echo(args: String*) = args.foreach(println)
echo()
echo("one")
echo("one", "two")


val arr = Array("three", "four", "five")
// echo(arr) <- Not valid even though args is an array
echo(arr : _*) //Valid



def printDate(date : java.util.Date = new Date()) = println(date)

printDate(new Date())

printDate()



