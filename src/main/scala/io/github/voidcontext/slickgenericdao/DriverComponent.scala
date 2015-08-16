package io.github.voidcontext.slickgenericdao

import slick.driver.JdbcDriver

trait DriverComponent {
  val driver: JdbcDriver
}
