## Micronaut 4.6.1 Documentation

- [User Guide](https://docs.micronaut.io/4.6.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/4.6.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/4.6.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)

## GraalVM staff

- [handling-reflection](https://guides.micronaut.io/latest/micronaut-graalvm-reflection-maven-java.html#handling-reflection)
- reelection config file: `src/main/resources/META-INF/native-image/dev.itrust.sample/micronaut-sample-graal/reflect-config.json` 
---

## Build native image

````shell
mvn package -Dpackaging=docker-native -Pgraalvm -Dmaven.test.skip=true
````

## Build CRaC Image

````shell
./mvnw package -Dpackaging=docker-crac -Dmaven.test.skip=true
````



