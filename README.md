## Micronaut 4.6.1 Documentation

- [User Guide](https://docs.micronaut.io/4.6.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/4.6.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/4.6.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)

## GraalVM staff

- [handling-reflection](https://guides.micronaut.io/latest/micronaut-graalvm-reflection-maven-java.html#handling-reflection)
- reelection config file: `src/main/resources/META-INF/native-image/dev.itrust.sample/micronaut-sample-graal/reflect-config.json` 
---

## CRaC staff

- https://foojay.io/today/how-to-run-a-java-application-with-crac-in-a-docker-container/
- https://docs.azul.com/core/crac/crac-guidelines.html#running-crac-in-a-virtualized-environment-docker

## Build native image

````shell
mvn package -Dpackaging=docker-native -Pgraalvm -Dmaven.test.skip=true
````

## Build CRaC Image

````shell
./mvnw package -Dpackaging=docker-crac -Dmaven.test.skip=true
````

## Native vs JDK

### Native
stating 337ms / 280ms
first endpoint call (Micronaut lazy loading and cache initialization): 109ms
next calls (no database): 9ms
reading from database: 10ms

### JDK
starting: 2533ms
first endpoint call (Micronaut lazy loading and cache initialization): 712ms
next calls (no database, cache only): 21ms / 16ms / 14 ms
reading from database: 22ms


