# JABAI

A template for creating an executable `jar` project.

* If you create a project using `gradle init`, the generated setup is outdated.
* Setting up and running Gradle can be cumbersome.

## Before opening in an IDE

Before opening this project in an IDE, please do the following:

### Update `group` and `jabai.Main` in `build.gradle`

* `jabai.Main` is the class used as the entry point.

### Update `rootProject.name` in `settings.gradle`

* This is the project name displayed in Eclipse's Package Explorer and other IDEs.
* Don't forget to rename the folder containing this README.md file accordingly.

### Rename the folder and update the package name

It may be easier to do this after opening the project in an IDE.

* Change the `jabai` part in `src/main/java/jabai` and `src/test/java/jabai`.
* Update the package name in the `.java` files inside these folders.

## Creating a library instead of an executable

If you want to create a regular library instead of an executable JAR, remove the `jar {...}` block in `build.gradle`.

----

That's all.
