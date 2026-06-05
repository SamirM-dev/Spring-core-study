package org.example.Classes.HomeworksFromAbstract;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan("org.example.Classes.HomeworksFromAbstract")
public class ConfigurationClass {

}
