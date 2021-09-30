1 + 1

val x = 42

x * x


def showPrice(paintingArea:Double,paintPrice:Double):String =
  val price = paintingArea * paintPrice
  if price > 100 then
    "This is too expensive"
  else
    price.toString

showPrice(10,5)

case class circle(radius:Double) :
  val area = radius*radius*3.14

circle(3).area

case class Rectangle(width:Int,height:Int):
  val area = width * height

val rectangle = Rectangle(3,4)

val largerRectangle = rectangle.copy(width = rectangle.width*2)

largerRectangle.area
