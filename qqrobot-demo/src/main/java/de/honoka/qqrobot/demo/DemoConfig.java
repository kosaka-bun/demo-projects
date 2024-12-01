package de.honoka.qqrobot.demo;

import de.honoka.qqrobot.framework.api.Framework;
import jakarta.annotation.Resource;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig implements ApplicationRunner {

    @Resource
    private Framework<?> framework;

    @Override
    public void run(ApplicationArguments args) {
        framework.boot();
    }
}
