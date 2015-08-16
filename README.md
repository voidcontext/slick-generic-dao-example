# slick-generic-dao-example
Generic DAO example implementation for Slick 3.0

### Preface
This issue came up during coding a hobby project. I tried to find an example, but wasn't easy. 
Most of the forum threads, blog posts used Slick 2.0, and the difference between version 2.x and 3.x
was too huge to apply the old rules. I've found a fairly convenient implementation in 
[active-slick](https://github.com/strongtyped/active-slick), but it didn't work in my case.

At this point I decided to seperate the problem from the project, and implement it in a different repo.
Maybe it will be useful later, for someone.

### Used Ideas

- [Slick multidb examples - Cake Pattern](https://github.com/typesafehub/activator-slick-multidb/tree/slick-3.0/src/main/scala/cake)
- [active-slick implementation](https://github.com/strongtyped/active-slick)

### Notice

This example doesn't compile right now, it gives the following error:

```
[info] Compiling 4 Scala sources to /home/pgee/dev/slick-generic-dao-example/target/scala-2.11/classes...
[error] /home/pgee/dev/slick-generic-dao-example/src/main/scala/io/github/voidcontext/slickgenericdao/User.scala:25: overriding type EntityTable in class GenericDao with bounds <: io.github.voidcontext.slickgenericdao.UsersFactory.Users.driver.api.Table[io.github.voidcontext.slickgenericdao.UsersFactory.Users.Entity];
[error]  type EntityTable has incompatible type
[error]     type EntityTable = UserTable
[error]          ^
[error] one error found
[error] (compile:compileIncremental) Compilation failed
```

### License

The MIT License (MIT)

Copyright (c) 2015 Gabor Pihaj

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
