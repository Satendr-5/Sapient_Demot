package com.sapient.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

	@Bean
	public RouteLocator GatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes().
				route(p -> p.path("/budget-calculator/**").uri("lb://budget-calculator")).
//				route(p -> p.path("/currency-exchange/**").uri("lb://currency-exchange")).
//				route(p -> p.path("/currency-conversion/**").uri("lb://currency-conversion")).
//				route(p -> p.path("/currency-conversion-feign/**").uri("lb://currency-conversion-feign")).
				build();
	}
}
