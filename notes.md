**Executable Jar**

`less app.groovy(浏览，Q退出)`

`spring jar my-app.jar app.groovy`

`jar tf my-app.jar.original`(该命令会显示文件中包含的所有目录和文件名列表)

`java -jar my-app.jar`运行jar



**DevTools&Live Reload**

help—Find Action—Registry—Compiler.automake.allow.when.app.running ✅

preference—build—build project automatically

Chrome extension—livereload(Allow access to file URLs)



**Bean Configurations**

@Scope("session")

property based injection(try to avoid)

Setter Based Injection

Constructor Based Injection(maybe Best way to go)



@Configuration(class here is a bean defination for the application context)

@Components()



