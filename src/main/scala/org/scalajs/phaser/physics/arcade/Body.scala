package org.scalajs.phaser.physics.arcade

import org.scalajs.phaser.physics.types.Touching
import org.scalajs.phaser.{Point, Sprite}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


@js.native
@JSName("Phaser.Physics.Arcade.Body")
class Body(sprite: Sprite) extends js.Object {

  var bounce: Point = js.native
  var gravity: Point = js.native
  var collideWorldBounds: Boolean = js.native
  var velocity: Point = js.native
  var immovable: Boolean = js.native

  val touching: Touching = js.native

}
