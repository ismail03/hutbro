package com.ismail.hutbro;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.ismail.hutbro.controller.Index;
import com.ismail.hutbro.controller.ProductController;

@Configuration
public class JerseyConfig extends ResourceConfig  {
public  JerseyConfig() {
	register(Index.class);
	register(ProductController.class);
	register(CORSResponseFilter.class);

}
}
