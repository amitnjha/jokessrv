package com.syl.jokessrv

import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits._

object Main extends IOApp {
  def run(args: List[String]) =
    JokessrvServer.stream[IO].compile.drain.as(ExitCode.Success)
}