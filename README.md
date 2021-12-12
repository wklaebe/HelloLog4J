# A "Hello World" for Log4J

and a demonstration of CVE-2021-44228

(which will not work anymore when you upgrade log4j-core from 2.14.1 to 2.15.0 in build.gradle)

```
$ sh gradlew run --args="foo \${env:JAVA_HOME} bar"

> Task :compileJava NO-SOURCE
> Task :compileGroovy UP-TO-DATE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE

> Task :run
foo ${env:JAVA_HOME} bar
20:11:58.708 [main] ERROR HelloLog4J.App - foo /lib/jvm/default-java bar

BUILD SUCCESSFUL in 2s
2 actionable tasks: 1 executed, 1 up-to-date
```
