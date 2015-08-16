package io.github.voidcontext.slickgenericdao

import slick.driver.JdbcDriver
import slick.jdbc.JdbcBackend.Database

abstract class GenericDao(val driver: JdbcDriver,val db: Database) {
  import driver.api._

  type Entity
  type EntityTable <: Table[Entity]

  def table: TableQuery[EntityTable]

  def getId(row: EntityTable): Rep[Long]

  def filterById(id: Long) = table filter (getId(_) === id)
  def findById(id: Long) = db run (filterById(id).result.head)
}


