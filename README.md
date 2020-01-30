### Java Agents demo


Please read blogpost [https://devolution.tech/introduction-to-java-agents/(opens in a new tab)](here) and come back again.


#### Building

```bash
git@github.com:jakon89/java-agents-demo.git
```

```bash
./gradlew build
```

```bash
java -javaagent:tracer/build/libs/java-agent-demo.jar -jar business-app/build/libs/java-agent-demo.jar 
```