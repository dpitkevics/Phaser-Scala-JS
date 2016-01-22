package org.scalajs.phaser.animations

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("Phaser.AnimationManager")
class AnimationManager extends js.Object {

  def add(name: String, frames: List[String] = null, frameRate: Int = 60, loop: Boolean = false, useNumericIndex: Boolean = true): Animation = js.native

}
