package io.github.voidcontext.slickgenericdao


trait UserActiveRecord { this: DatabaseComponent with DriverComponent =>

  import slick.lifted.Tag
  import driver.api._

  case class User(
    id: Option[Long],
    firstName: String,
    lastName: String
  )

  class UserTable(tag: Tag) extends Table[User](tag, "user") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def firstName = column[String]("first_name")
    def lastName = column[String]("last_name")

    def * = (id.?, firstName, lastName) <> (User.tupled, User.unapply)
  }

  object Users extends GenericDao[UserTable, Long](driver, db) {
    import this.driver.api._

    val table = TableQuery[UserTable]
    def getId(table: UserTable) = table.id
  }

}

