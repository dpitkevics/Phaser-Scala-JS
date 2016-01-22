package test.states

import org.scalajs.phaser.State
import org.scalajs.phaser.physics.Physics

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
class GameState extends State {

  @js.native
  def getImageUrl(path: String): String = {
    s"target/scala-2.11/classes/assets/images/$path"
  }

  override def preload(): Unit = {
    println("Preloading")

    load.image("star", getImageUrl("star.png"))
  }

  override def create(): Unit = {
    println("Creating")

    val star = game.add.sprite(0, 0, "star")

    star.body.bounce.y = 0.2
    star.body.gravity.y = 300
    star.body.collideWorldBounds = true

    //  Our two animations, walking left and right.
    star.animations.add("left", List(0, 1, 2, 3), 10, true)
    star.animations.add("right", List(5, 6, 7, 8), 10, true)

    game.physics.startSystem(Physics.ARCADE)
    game.physics.enable(star)
  }

  override def update(): Unit = {

  }

}
