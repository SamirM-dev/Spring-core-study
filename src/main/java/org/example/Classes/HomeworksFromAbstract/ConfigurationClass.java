package org.example.Classes.HomeworksFromAbstract;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@EnableAspectJAutoProxy
@PropertySource("classpath:app.properties")
@ComponentScan("org.example")
public class ConfigurationClass {
    @Bean
    public static PropertySourcesPlaceholderConfigurer configurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    @Bean @Profile("dev")
    public DevMessageService devMessageService(){
        return new DevMessageService();
    }

    @Bean@Profile("prod")
    public ProdMessageService prodMessageService(){
        return new ProdMessageService();
    }
    @Bean
    public UserService userService(ApplicationEventPublisher applicationEventPublisher){
        return new UserService(applicationEventPublisher);
    }
    @Bean
    public EmailService emailService(){
        return new EmailService();
    }

}
