package org.scalajs.phaser.inputs

import org.scalajs.phaser.Game
import org.scalajs.phaser.inputs.types.CursorKeys

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("Phaser.Keyboard")
class Keyboard(game: Game) extends js.Object {

  def createCursorKeys(): CursorKeys = js.native

}
