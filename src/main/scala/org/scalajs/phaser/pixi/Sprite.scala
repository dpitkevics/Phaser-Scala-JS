package org.scalajs.phaser.pixi

import org.scalajs.phaser.Point

import scala.scalajs.js
import js.annotation._

@js.native
@JSName("PIXI.Sprite")
class Sprite protected () extends js.Object {
  var visible: Boolean = js.native
  val scale: Point = js.native

  def kill(): DisplayObject = js.native
}