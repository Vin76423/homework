package by.tms;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "by.tms")
public class WebConfiguration {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/pages/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }


    @Bean
    public ComboPooledDataSource dataSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/transport_compani_db?serverTimezone=UTC");
            dataSource.setUser("root");
            dataSource.setPassword("my76sql423ol28eg28a_");

            Properties properties = new Properties();
            properties.setProperty("user", "root");
            properties.setProperty("password", "my76sql423ol28eg28a_");
            properties.setProperty("useUnicode", "true");
            properties.setProperty("characterEncoding", "UTF8");
            dataSource.setProperties(properties);

            // set options:
            dataSource.setMaxStatements(180);
            dataSource.setMaxStatementsPerConnection(180);
            dataSource.setMinPoolSize(50);
            dataSource.setAcquireIncrement(10);
            dataSource.setMaxPoolSize(60);
            dataSource.setMaxIdleTime(30);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
