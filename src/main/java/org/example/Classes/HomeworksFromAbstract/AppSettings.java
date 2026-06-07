package org.example.Classes.HomeworksFromAbstract;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class AppSettings {
    private String appName;
    private String appVersion;
    private int appMaxUsers;
    private String dbUrl;
    private String dbUsername;
    public AppSettings(@Value("${app.name}") String appName,@Value("${app.version:1.0.1}") String appVersion, @Value("${app.max-users}") int appMaxUsers,
                       @Value("${db.url}") String dbUrl,@Value("${db.username}") String dbUsername) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.appMaxUsers = appMaxUsers;
        this.dbUrl = dbUrl;
        this.dbUsername = dbUsername;
    }
    @PostConstruct
    public void printSettings(){
        System.out.println("=== Конфигурация приложения ===");
        System.out.println("Имя: " + appName);
        System.out.println("Версия: " + appVersion);
        System.out.println("Макс. пользователей: " + appMaxUsers);
        System.out.println("БД URL: " + dbUrl);
        System.out.println("БД пользователь: " + dbUsername);
        System.out.println();

    }


    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public int getAppMaxUsers() {
        return appMaxUsers;
    }

    public void setAppMaxUsers(int appMaxUsers) {
        this.appMaxUsers = appMaxUsers;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getBdUsername() {
        return dbUsername;
    }

    public void setBdUsername(String bdUsername) {
        this.dbUsername = bdUsername;
    }

}
