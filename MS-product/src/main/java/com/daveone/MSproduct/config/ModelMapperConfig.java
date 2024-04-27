package com.daveone.MSproduct.config;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * Configuration class for ModelMapper Bean
 * In Utils.Converter you can find the implementation of this Library
 */

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper(){ return new ModelMapper(); }
}
