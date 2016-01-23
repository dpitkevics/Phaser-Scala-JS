package org.scalajs.phaser.inputs

import org.scalajs.phaser.Game

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("Phaser.Input")
class Input(game: Game) extends js.Object {

  val keyboard: Keyboard = js.native

}

object Input extends js.Object {

  val MAX_POINTERS: Int = js.native
  val MOUSE_OVERRIDES_TOUCH: Double = js.native
  val MOUSE_TOUCH_COMBINE: Double = js.native
  val TOUCH_OVERRIDES_MOUSE: Double = js.native

}
