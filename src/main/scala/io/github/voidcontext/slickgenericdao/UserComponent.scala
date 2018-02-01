package io.github.voidcontext.slickgenericdao


trait UserComponent { this: DatabaseComponent with ProfileComponent =>

  import slick.lifted.Tag
  import profile.api._

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

  object UserRepository extends Repository[UserTable, Long](profile, db) {
    import this.profile.api._

    val table = TableQuery[UserTable]
    def getId(table: UserTable) = table.id
  }

}

