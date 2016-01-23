package org.scalajs.phaser.physics

import org.scalajs.phaser.physics.arcade.Arcade

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("Phaser.Physics")
class Physics() extends js.Object {

  val arcade: Arcade = js.native

  def startSystem(system: Int): Unit = js.native

  def enable(gameObject: js.Object, system: Int = Physics.ARCADE, debug: Boolean = false): Unit = js.native

}

@js.native
@JSName("Phaser.Physics")
object Physics extends js.Object {

  val ARCADE: Int = js.native
  val BOX2D: Int = js.native
  val CHIPMUNK: Int = js.native
  val MATTERJS: Int = js.native
  val NINJA: Int = js.native
  val P2JS: Int = js.native

}
