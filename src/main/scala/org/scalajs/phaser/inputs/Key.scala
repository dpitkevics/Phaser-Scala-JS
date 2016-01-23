package org.scalajs.phaser.inputs

import org.scalajs.phaser.Game

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("Phaser.Key")
class Key(game: Game, keycode: Int) extends js.Object {

  val isDown: Boolean = js.native

}
