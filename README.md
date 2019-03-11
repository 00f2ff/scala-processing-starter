# scala-processing-starter

This project provides the tools required to get started with Processing 3.x.x, and is
intended to run in **IntelliJ**.
Generally, figuring out how to either run Processing in IntelliJ or run
Processing with Scala can be a huge pain, so hopefully this project helps
elucidate some things.

## Getting Started

The `lib` folder currently contains the JARs needed to run Processing 3.5.3.
If you wish to run a different version of Processing, follow each of the steps
below. If you're cool with running the current version, skip right to step #4.

1. Download [Processing](https://processing.org/download/)
2. Delete the contents of the `lib` directory
3. Copy the contents of `Java/core/library` to the `lib` directory. On OSX
you can find this by extracting Processing from the zip, right clicking on the
application, and Pressing _Show Package Contents_
4. In IntelliJ, right click on `lib` and press _Add as Library_. When prompted
for the library name, keep it as the default (IntelliJ will automagically
sort out the package names for you)

You should now be able to run `MyProcessingSketch` by any of IntelliJ's
usual means. Additionally, `build.sbt` is configured to run its `main` function
upon `sbt run` in the terminal.
