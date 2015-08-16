package io.github.voidcontext.slickgenericdao

import slick.jdbc.JdbcBackend.Database

trait DatabaseComponent {
  val db: Database
}