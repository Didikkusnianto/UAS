package com.example.data;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DataRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Data(101011L, "Tapak Jejak","Fiersa Besari",
                    "2019", "50", 430000L )));
            log.info("Preloading" + repository.save(new Data(101012L, "Catatan Juang", "Fiersa Besari",
                    "2013", "40", 350000L )));
            log.info("Preloading" + repository.save(new Data(10101011L, "Titik Nol", "Agustinus Wibowo",
                    "2017", "275", 250000L )));
        };
    }
}
