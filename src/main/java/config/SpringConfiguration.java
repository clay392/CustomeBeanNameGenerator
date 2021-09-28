package config;

import com.itheima.customer.CustomeBeanNameGenerator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 *  spring的配置类
 */
@Configuration
@ComponentScan(basePackages = "com.itheima",nameGenerator = CustomeBeanNameGenerator.class,
resourcePattern = "**/*.class",excludeFilters = @ComponentScan.Filter(value = Service.class))
public class SpringConfiguration {
}
