# Plugins
## Mybatis Generator Plugins
### Lombok Plugin
```
pom.xml:
<plugin>
    <groupId>org.mybatis.generator</groupId>
    <artifactId>mybatis-generator-maven-plugin</artifactId>
    <version>${mybatis-generator-maven-plugin.version}</version>
    <configuration>
        <verbose>true</verbose>
        <overwrite>true</overwrite>
    </configuration>
    <dependencies>
        
        ...
        
        <dependency>
            <groupId>com.github.ofofs</groupId>
            <artifactId>plugins</artifactId>
            <version>1.1.0.RELEASE</version>
        </dependency>
    </dependencies>
</plugin>


generatorConfig.xml:
<plugin type="com.github.ofofs.plugins.LombokPlugin"/>
```

### File Header Plugin
```
<plugin type="com.github.ofofs.plugins.FileHeaderPlugin">
    <property name="author" value="kangyonggan"/>
</plugin>
```


