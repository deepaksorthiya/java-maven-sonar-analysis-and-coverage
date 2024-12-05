# Basic Maven Example

This simple Maven project is importing JaCoCo's coverage report.

## Usage

* Build the project, execute all the tests and analyze the project with SonarScanner for Maven (from the root of the
  project):

```bash
mvn clean verify sonar:sonar
```

```bash
mvn clean verify sonar:sonar -D"sonar.token=<your token>" -D"sonar.host.url=https://sonarcloud.io" -D"sonar.organization=deepaksorthiya" -D"sonar.projectKey=deepaksorthiya_java-maven-sonar-analysis-and-coverage"
```

## Documentation

[SonarScanner for Maven](https://docs.sonarsource.com/sonarqube/latest/analyzing-source-code/scanners/sonarscanner-for-maven/)
