e(fx)clipse samples for Wuff
======================
[![Build Status](https://travis-ci.org/mcmil/wuff-efxclipse-samples.svg)](https://travis-ci.org/mcmil/wuff-efxclipse-samples)
[![Wuff Compatibility](https://img.shields.io/badge/wuff-0.0.13--efxclipse--alpha3-47b31f.svg)](https://github.com/mcmil/wuff/tree/efxclipse)

The samples presented in this repository are built against the latest snapshot build of [Wuff-efxclipse](https://github.com/mcmil/wuff/tree/efxclipse - fork of - https://github.com/akhikhl/wuff). Currently version `0.0.13-efxclipse-alpha3` is supported. Initially [Contacts-Griffon](https://github.com/tschulte/contacts-griffon) sample application was used as base for their creation.

The samples are created to work with [Wuff IntelliJ plugin](https://github.com/mcmil/wuff-intellij-plugin).

##Samples
This sample is used to ilustrate the idea of multi-module efxclipse projects with wuff. It contains two elements: 

* [pl.cmil.wuff.sample.main](pl.cmil.wuff.sample.main) A startup module which renders a simple JavaFX part.
* [pl.cmil.wuff.sample.services](pl.cmil.wuff.sample.services) A simple POJO service.

Wuff configuration is available in the [build.gradle](build.gradle) file in the root project.

If you are looking for a barebone, simple application see the [wuff-skeleton](https://github.com/mcmil/wuff-skeleton) sample.

### Starting the samples

To run the application simply download the repository to a desired directory, and run `gradlew run` in it.

##Requirements
JDK 1.8.0_u20 or later is required to run the samples.
