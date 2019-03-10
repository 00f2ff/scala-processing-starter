import processing.core._


/**
  * This is a Scala port of Kevin Workman's answer on this StackOverflow post:
  * https://stackoverflow.com/questions/34716460/java-error-cannot-cast-to-java-applet-applet-in-eclipse
  */
object MyProcessingSketch {
  def main(args: Array[String]): Unit = {
    val pArgs = Array("MyProcessingSketch ")
    val mp = new MyProcessingSketch
    PApplet.runSketch(pArgs, mp)
  }
}

class MyProcessingSketch extends PApplet {
  override def settings(): Unit = {
    size(200, 100)
  }

  override def draw(): Unit = {
    background(255)
    fill(0)
    ellipse(100, 50, 10, 10)
  }
}