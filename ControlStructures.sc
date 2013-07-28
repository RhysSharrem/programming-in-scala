import java.io.{IOException, FileNotFoundException, FileReader}

//for expressions
for (i <- 1 to 4) println("Iteration " + i)



for (i <- 1 until 4) println("Iteration " + i)


for (i <- 1 to 4 if i % 2 == 0) println("Iteration " + i)

val filesHere = new java.io.File(".").listFiles


def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList
def isScalaFile(file: java.io.File): Boolean =
  file.getName.endsWith(".scala") || file.getName.endsWith(".sc")

def grep(pattern: String) =
  for(
    file <- filesHere
    if isScalaFile(file);
    line <- fileLines(file);
    trimmed = line.trim
    if trimmed.matches(pattern)
  ) println(file + ": " + trimmed)
// Could use curly braces, which means we don't need the semi colon

grep(".*gcd.*")




def scalaFiles =
  for {
    file <- filesHere
    if isScalaFile(file)
  } yield file
for (file <- scalaFiles) println(file.getName)

//try catch
/*
try {
  val file = new FileReader(("input.txt"))
  //Use the file
}
catch {
  case ex: FileNotFoundException =>
  case ex: IOException =>
}
finally{
  //file.close()
}
*/






def usingMatch(toMatch: String) =
  toMatch match {
    case "salt" => "pepper"
    case "fish" => "chips"
    case "eggs" => "bacon"
    case _ => "huh?"
  }
println(usingMatch("salt"))
println(usingMatch("fish"))
println(usingMatch("jelly"))

//Scope

val a = 1;
{
  val a = 2
  println(a)
}
println(a)

//functional multiplication table

//Returns a sequence of rows
def makeRowSeq(row: Int) =
  for (col <- 1 to 12) yield {
    val prod = (row * col).toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }

//Returns a row as a string
def makeRow(row: Int) = makeRowSeq(row).mkString

//Returns a table as a string with one row per line
def multiTable = {
  val tableAsSeq =
  for(row <- 1 to 12)
    yield makeRow(row)

  tableAsSeq.mkString("\n")
}

println(multiTable)































