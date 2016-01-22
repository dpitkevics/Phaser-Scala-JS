package org.scalajs.phaser.animations

import org.scalajs.phaser.frames.FrameData
import org.scalajs.phaser.{Sprite, Game}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("Phaser.Animation")
class Animation(game: Game, parent: Sprite, name: String, frameData: FrameData, frames: List[Int], frameRate: Int = 60, loop: Boolean = false) extends js.Object {

}
