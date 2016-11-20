package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document
import scala.scalajs.js.annotation.JSExport
import org.scalajs.dom.html

object TutorialApp extends JSApp {
  

  
  def appendPar(targetNode: dom.Node, text: String): Unit = {
  val parNode = document.createElement("p")
  val textNode = document.createTextNode(text)
  parNode.appendChild(textNode)
  targetNode.appendChild(parNode)
}

 def appendListItem(targetNode: dom.Node, text: String): Unit = {
  val liNode = document.createElement("li")
  val textNode = document.createTextNode(text)
  liNode.appendChild(textNode)
  targetNode.appendChild(liNode)
}



    @JSExport
def addClickedMessage(): Unit = {
  var ul = document.getElementById("myul")
   val content = document.getElementById("myinput").asInstanceOf[html.Input].value
  appendListItem(ul, content)
}

    @JSExport
def keyUpMessage(): Unit = {
    val content = document.getElementById("myinput").asInstanceOf[html.Input].value
    val mydiv = document.getElementById("contentdiv")
    mydiv.innerHTML = content
 
}


  def main(): Unit = {
   appendPar(document.body, "Hello World")
   
   
  }

  
}