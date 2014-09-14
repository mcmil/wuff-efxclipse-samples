e(fx)clipse samples for Wuff
======================
[![Build Status](https://travis-ci.org/mcmil/wuff-efxclipse-samples.svg)](https://travis-ci.org/mcmil/wuff-efxclipse-samples)
[![Wuff Compatibility](http://img.shields.io/badge/wuff-0.0.13--SNAPSHOT-47b31f.svg)](https://github.com/akhikhl/wuff/releases/latest)

The samples presented in this repository are built against the latest snapshot release of [Wuff](https://github.com/akhikhl/wuff). Currently version `0.0.13-SNAPSHOT` is supported. Initially [Contacts-Griffon](https://github.com/tschulte/contacts-griffon) sample application was used as base for their creation.

The samples are created to work with [Wuff IntelliJ plugin](https://github.com/mcmil/wuff-intellij-plugin).

##Samples
- [efxclipse-skeleton](efxclipse-skeleton) Single module app which contains a window with Part rendered by Java FX. To start it use the following command: `gradlew :efxclipse-skeleton:pl.cmil.efxclipse.skeleton.app:run`

Wuff configuration is available in the [gradle directory](gradle) in the root project

##Requirements
JDK 1.8.0_u5 or later is required to run the samples.
