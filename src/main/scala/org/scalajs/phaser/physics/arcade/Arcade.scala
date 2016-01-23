package org.scalajs.phaser.physics.arcade

import org.scalajs.phaser.groups.Group
import org.scalajs.phaser.{Sprite, Game}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import js.|

@js.native
@JSName("Phaser.Physics.Arcade")
class Arcade(game: Game) extends js.Object {

  def collide(object1: Sprite | Group, object2: Sprite | Group, collideCallback: js.Function = null, processCallback: js.Function = null, callbackContext: js.Object = null): Boolean = js.native

  def overlap(object1: Sprite | Group, object2: Sprite | Group, overlapCallback: js.Function = null, processCallback: js.Function = null, callbackContext: js.Object = null): Boolean = js.native

}
