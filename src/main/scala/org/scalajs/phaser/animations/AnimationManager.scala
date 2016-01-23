package org.scalajs.phaser.animations

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("Phaser.AnimationManager")
class AnimationManager extends js.Object {

  def add(name: String, frames: js.Array[Int] = null, frameRate: Int = 60, loop: Boolean = false, useNumericIndex: Boolean = true): Animation = js.native

  def play(name: String, frameRate: Int = 60, loop: Boolean = false, killOnComplete: Boolean = false): Animation = js.native

  def stop(name: String = null, resetFrame: Boolean = false): Unit = js.native

}
