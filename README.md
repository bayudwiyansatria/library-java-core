<p align="center">
    <a href="https://bayudwiyansatria.github.io/Development-And-Operations/">
        <img src="https://cdn.bayudwiyansatria.com/assets/logo-full.png" width="100%" />
    </a>
    <br>
</p>
<p align="center">
	<a href="#">
		<img src="https://img.shields.io/badge/%20Platforms-Java-blue.svg?style=flat-square" alt="Platforms" />
	</a>
    <a href="https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/LICENSE">
		<img src="https://img.shields.io/badge/%20Licence-MIT-green.svg?style=flat-square" alt="license" />
	</a>
</p>
<p align="center">
	<a href="https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/CODE_OF_CONDUCT.md">
		<img src="https://img.shields.io/badge/Community-Code%20of%20Conduct-orange.svg?style=flat-squre" alt="Code of Conduct" />
	</a>
    <a href="https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/SUPPORT.md">
		<img src="https://img.shields.io/badge/Community-Support-red.svg?style=flat-square" alt="Support" />
	</a>
    <a href="https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/CONTRIBUTING.md">
		<img src="https://img.shields.io/badge/%20Community-Contribution-yellow.svg?style=flat-square" alt="Contribution" />
	</a>
</p>
<hr>

# Bayu Dwiyan Satria - Core

Core of Bayu Dwiyan Satria Project Framework.

|   Key     |   Description |
|   ------  |   ------      |
| Name      |   Bayu Dwiyan Satria - Core   |
| Description | Core Of Bayu Dwiyan Satria Dependency. |
| Site | [Site Page](https://bayudwiyansatria.github.io/Library-Java-Core) |

## Table of Contents

- [Dependencies](#dependencies)
- [Installation](#installation)
- [Development](#development)
- [Contributing](#contributing)
- [License](#license)

## Dependencies

Dependencies Repository : https://search.maven.org/

**Maven Central** :

|  Name     |   Group   | Artifact  | Version   |
| -----     |   -----   | -----     | -----     |
| [JUnit](https://search.maven.org/artifact/junit/junit)                        | junit         | junit         | 4.12
| [Slf4j](https://search.maven.org/artifact/org.slf4j/slf4j-simple)             | org.slf4j     | slf4j-simple  | 1.7.25
| [Slf4j](https://search.maven.org/artifact/org.slf4j/slf4j-api)                | org.slf4j     | slf4j-api     | 1.7.25
| [Ham Crest](https://search.maven.org/artifact/org.hamcrest/hamcrest-core)     | org.hamcrest  | hamcrest-core | 1.3
| [Ham Crest](https://search.maven.org/artifact/org.hamcrest/hamcrest-library)  | org.hamcrest  | hamcrest-library | 1.3

## Installation

Install the dependencies :

**Maven** :

Configure the following dependency in the pom file:

```xml
<dependency>
  <groupId>com.bayudwiyansatria</groupId>
  <artifactId>core</artifactId>
  <version>${bayudwiyansatria.core.version}</version>
</dependency>
```

**Gradle** :

Configure the following dependency in the build.gradle file:

```properties
implementation 'com.bayudwiyansatria:core:${bayudwiyansatria.core.version}'
```

SBT

```properties
libraryDependencies += "com.bayudwiyansatria" % "core" % "${bayudwiyansatria.core.version}"
```

**Important** ! This will update from to your local repository . Be sure to swap out `${bayudwiyansatria.core.version}` with the actual version of Core Libraries.

For more information see : [The Central Repository](https://search.maven.org/artifact/com.bayudwiyansatria/core/).

## Development

- *Release 1.0* : **2019, Jul**.
- *RC1 1.1* : **2019, Jul**.
- *M1 1.1.1* : **2019, Sept**. (Available On Maven Central)
- *M2 1.1.2* : **2019, Jul**. (Available On Maven Central)
- *M3 1.1.3* : **2019, Jul**.(Available On Maven Central)
- *M4 1.1.4* : **2019, Sept**. (Available On Maven Central)
- *M2 1.1.5* : **2019, Sept**. (Available On Maven Central)
- *RC2 1.1.6* : **2019, Sept**. (Available On Maven Central)
- *GA 1.1.7* : **2019, Sept**. (Available On Maven Central)

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

Looking to contribute to our code but need some help? There's a few ways to get information:

- Connect with us on [Twitter](https://twitter.com/bayudsatria)
- Like us on [Facebook](https://facebook.com/PBayuDSatria)
- Follow us on [LinkedIn](https://linkedin.com/in/bayudwiyansatria)
- Subscribe us on [Youtube](https://youtube.com/channel/UCihxWj1rtheK73mGdrf0OiA)
- Log an issue here on github

## License

[MIT](https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/LICENSE) | [BAYU DWIYAN SATRIA](https://www.bayudwiyansatria.com)

Copyright &copy; 2017 - 2019 Bayu Dwiyan Satria. All Rights Reserved.
