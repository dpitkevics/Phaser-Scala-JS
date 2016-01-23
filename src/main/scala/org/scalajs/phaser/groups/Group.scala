package org.scalajs.phaser.groups

import org.scalajs.phaser.{Sprite, Point, Game}
import org.scalajs.phaser.types.DisplayObject

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("Phaser.Group")
class Group(game: Game, parent: js.Any = null, name: String = "group", addToStage: Boolean = false, var enableBody: Boolean = false, physicsBodyType: Int = 0) extends DisplayObject {

  def create(x: Double, y: Double, key: String = null, frame: String = null, exists: Boolean = true): Sprite = js.native

}
