package test

import org.scalajs.phaser.{Phaser, Game}
import test.states.GameState

import scala.scalajs.js

object PhaserApp extends js.JSApp {

  val game = new Game(800, 600, Phaser.AUTO, "game-container")

  def main(): Unit = {
    game.state.add("game", new GameState)
    game.state.start("game")
  }

}
