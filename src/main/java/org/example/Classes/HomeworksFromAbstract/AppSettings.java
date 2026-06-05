package org.example.Classes.HomeworksFromAbstract;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class AppSettings {
    private String appName;
    private int appVersion;
    private int appMaxUsers;
    private String dbUrl;
    private String bdUsername;
    public AppSettings(@Value("${app.name}") String appName,@Value("${app.version}") int appVersion,@Value("${app.max-users}") int appMaxUsers,@Value("${db.url}") String dbUrl,@Value("${db.username}") String bdUsername) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.appMaxUsers = appMaxUsers;
        this.dbUrl = dbUrl;
        this.bdUsername = bdUsername;
    }
    @PostConstruct
    public void printSettings(){

    }


    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(int appVersion) {
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
        return bdUsername;
    }

    public void setBdUsername(String bdUsername) {
        this.bdUsername = bdUsername;
    }

}
