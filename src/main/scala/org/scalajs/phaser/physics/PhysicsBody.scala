package org.scalajs.phaser.physics

import org.scalajs.phaser.physics.arcade.Body

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


@js.native
@JSName("Phaser.Component.PhysicsBody")
trait PhysicsBody {

  var body: Body = js.native
  var x: Double = js.native
  var y: Double = js.native

}
