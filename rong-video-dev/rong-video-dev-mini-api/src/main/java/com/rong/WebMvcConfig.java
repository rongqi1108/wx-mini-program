package com.rong;

import com.rong.controller.interceptor.MiniInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**")
		        .addResourceLocations("classpath:/META-INF/resources/")
				.addResourceLocations("file:/Users/rong/rong-video-dev/");
	}

	@Bean(initMethod="init")
	public com.rong.ZKCuratorClient zkCuratorClient() {
		return new com.rong.ZKCuratorClient();
	}
	
	@Bean
	public MiniInterceptor miniInterceptor() {
		return new MiniInterceptor();
	}


	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(miniInterceptor()).addPathPatterns("/user/**")
				       .addPathPatterns("/video/upload", "/video/uploadCover",
				    		   			"/video/userLike", "/video/userUnLike",
				    		   			"/video/saveComment")
                      .addPathPatterns("/bgm/**")
                      .excludePathPatterns("/user/queryPublisher");

	}


}
