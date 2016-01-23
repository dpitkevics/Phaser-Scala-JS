package test.states

import org.scalajs.phaser.groups.Group
import org.scalajs.phaser.inputs.types.CursorKeys
import org.scalajs.phaser.{Sprite, State}
import org.scalajs.phaser.physics.Physics

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.Dynamic.global

@ScalaJSDefined
class GameState extends State {

  var platforms: Group = null
  var player: Sprite = null
  var cursors: CursorKeys = null
  var stars: Group = null

  @js.native
  def getImageUrl(path: String): String = {
    s"target/scala-2.11/classes/assets/images/$path"
  }

  override def preload(): Unit = {
    load.image("sky", getImageUrl("sky.png"))
    load.image("ground", getImageUrl("platform.png"))
    load.image("star", getImageUrl("star.png"))
    load.spritesheet("dude", getImageUrl("dude.png"), 32, 48)
  }

  override def create(): Unit = {
    game.physics.startSystem(Physics.ARCADE)

    game.add.sprite(0, 0, "sky")

    platforms = game.add.group()
    platforms.enableBody = true

    val ground = platforms.create(0, game.world.height - 64, "ground")
    ground.scale.setTo(2, 2)
    ground.body.immovable = true

    var ledge: Sprite = platforms.create(400, 400, "ground")
    ledge.body.immovable = true

    ledge = platforms.create(-150, 250, "ground")
    ledge.body.immovable = true

    cursors = game.input.keyboard.createCursorKeys()

    player = game.add.sprite(32, game.world.height - 150, "dude")

    game.physics.enable(player)

    player.body.bounce.y = 0.2
    player.body.gravity.y = 300
    player.body.collideWorldBounds = true

    player.animations.add("left", js.Array(0, 1, 2, 3), 10, loop = true)
    player.animations.add("right", js.Array(5, 6, 7, 8), 10, loop = true)

    stars = game.add.group()
    stars.enableBody = true

    for (i <- 1 to 12) {
      val star = stars.create(i * 70, 0, "star")
      star.body.gravity.y = 6
      star.body.bounce.y = 0.7 + Math.random() * 0.2
    }
  }

  override def update(): Unit = {
    game.physics.arcade.collide(player, platforms)
    game.physics.arcade.collide(stars, platforms)
    game.physics.arcade.overlap(player, stars, collectStar _)

    player.body.velocity.x = 0

    if (cursors.left.isDown) {
      player.body.velocity.x = -150

      player.animations.play("left")
    } else if (cursors.right.isDown) {
      player.body.velocity.x = 150

      player.animations.play("right")
    } else {
      player.animations.stop()

      player.frame = 4
    }

    if (cursors.up.isDown && player.body.touching.down) {
      player.body.velocity.y = -350
    }
  }

  @js.native
  def collectStar(player: Sprite, star: Sprite): Unit = {
    star.kill()
  }

}
