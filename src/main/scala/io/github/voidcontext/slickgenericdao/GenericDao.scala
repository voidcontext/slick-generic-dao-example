package io.github.voidcontext.slickgenericdao

import slick.driver.JdbcDriver
import slick.jdbc.JdbcBackend.Database
import slick.lifted.AbstractTable

abstract class GenericDao[T <: AbstractTable[_]](val driver: JdbcDriver,val db: Database) {
  import driver.api._

  def table: TableQuery[T]

  def getId(row: T): Rep[Long]

  def filterById(id: Long) = table filter (getId(_) === id)
  def findById(id: Long) = db run (filterById(id).result.head)
}


