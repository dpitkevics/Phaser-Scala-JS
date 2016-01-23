package org.scalajs.phaser

import org.scalajs.phaser.animations.AnimationManager
import org.scalajs.phaser.groups.Group
import org.scalajs.phaser.inputs.Input
import org.scalajs.phaser.physics.{PhysicsBody, Physics}
import org.scalajs.phaser.texts.Text
import org.scalajs.phaser.worlds.World

import scala.scalajs.js
import js.annotation._
import js.|
import org.scalajs.dom.html

@js.native
object Phaser extends js.Object {
  val AUTO: Int = js.native
}

@js.native
@JSName("Phaser.Game")
class Game(
            width: Double | String = 800,
            height: Double | String = 600,
            renderer: Int = Phaser.AUTO,
            parent: String | html.Element = "") extends js.Object {

  val state: StateManager = js.native

  val add: GameObjectFactory = js.native

  val physics: Physics = js.native

  val world: World = js.native

  val input: Input = js.native
}

@js.native
@JSName("Phaser.StateManager")
class StateManager(val game: Game) extends js.Object {
  def add(key: String, state: State | js.Dynamic,
          autoStart: Boolean = false): Unit = js.native

  def start(key: String): Unit = js.native
}

@js.native
@JSName("Phaser.State")
abstract class State extends js.Object {
  protected final def game: Game = js.native

  protected final def load: Loader = js.native

  def preload(): Unit = js.native

  def create(): Unit = js.native

  def update(): Unit = js.native
}

@js.native
@JSName("Phaser.Loader")
class Loader extends js.Object {
  def image(key: String, url: String = js.native,
            overwrite: Boolean = false): this.type = js.native

  def spritesheet(key: String,
                  url: String = js.native,
                  frameWidth: Double,
                  frameHeight: Double,
                  frameMax: Double = -1,
                  margin: Double = 0,
                  spacing: Double = 0): this.type = js.native
}

@js.native
@JSName("Phaser.GameObjectFactory")
class GameObjectFactory(game: Game) extends js.Object {

  def sprite(x: Double = 0, y: Double = 0,
             key: String = js.native): Sprite = js.native

  def graphics(x: Double = 0, y: Double = 0): Graphics = js.native

  def group(parent: js.Any = null, name: String = "group", addToStage: Boolean = false, enableBody: Boolean = false, physicsBodyType: Int = 0): Group = js.native

  def text(x: Double = 0, y: Double = 0, text: String = "", style: js.Dictionary[String] = null, group: Group = null): Text = js.native

}

@js.native
@JSName("Phaser.Sprite")
class Sprite(game: Game, x: Double, y: Double, key: String, frame: String) extends pixi.Sprite
  with ComponentCore with InputEnabled with PhysicsBody {
}

@js.native
trait ComponentCore extends js.Object {
  val animations: AnimationManager = js.native
  val events: Events = js.native

  var frame: Int = js.native
}

@js.native
trait InputEnabled extends js.Object {
  def inputEnabled: Boolean = js.native

  def inputEnabled_=(value: Boolean): Unit = js.native
}

@js.native
@JSName("Phaser.Events")
class Events(sprite: Sprite) extends js.Object {
  val onInputDown: Signal[js.Function1[Sprite, _]] = js.native
}

@js.native
@JSName("Phaser.Signal")
class Signal[ListenerType <: js.Function] extends js.Object {
  def add(listener: ListenerType): Unit = js.native
}

@js.native
@JSName("Phaser.Graphics")
class Graphics protected() extends js.Object {
  def clear(): Unit = js.native

  def beginFill(color: Int): Unit = js.native

  def endFill(): Unit = js.native

  def drawPolygon(path: js.Array[PointLike]): Unit = js.native
}

@ScalaJSDefined
trait PointLike extends js.Object {
  def x: Double

  def y: Double
}

@js.native
@JSName("Phaser.Point")
class Point(var x: Double = 0, var y: Double = 0) extends js.Object {

  def setTo(x: Double, y: Double = null.asInstanceOf[Double]): this.type = js.native

}