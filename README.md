# incHRM

Code coverage plugins

There are two code coverage report generated

1) Cobertura

Html report - mvn cobertura:cobertura

Xml report - mvn cobertura:cobertura -Dcobertura.report.format=xml


2) Jacoco

mvn jacoco:prepare-agent test jacoco:report

3) Build command

mvn clean install



Reference
---------
1) http://tdongsi.github.io/blog/2017/09/23/jacoco-in-maven-project/
2) https://mkyong.com/qa/maven-cobertura-code-coverage-example/
