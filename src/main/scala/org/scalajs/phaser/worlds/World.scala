package org.scalajs.phaser.worlds

import org.scalajs.phaser.Game

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("Phaser.World")
class World(game: Game) extends js.Object {

  val height: Double = js.native

}
