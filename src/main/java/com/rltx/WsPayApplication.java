package com.rltx;


import com.rltx.framework.FrameworkConfig;
import com.rltx.framework.FrameworkShiroConfig;
import com.rltx.framework.config.MybatisConfig;
import com.rltx.framework.registry.annoation.EnableFrameworkRegistryClient;
import com.rltx.framework.resource.FrameworkResourceConfig;
import com.rltx.wspay.config.EnableWsPay;
import com.rltx.wspay.config.FrameworkSupportConfig;
import com.wl.framework.event.EventConfig;
import com.wl.framework.solr.FrameworkSolrConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableWsPay
@Import({FrameworkConfig.class, FrameworkShiroConfig.class, MybatisConfig.class, FrameworkSolrConfig.class, FrameworkResourceConfig.class, EventConfig.class, FrameworkSupportConfig.class})
@EnableFeignClients
@EnableTransactionManagement
public class WsPayApplication {
	public static void main(String[] args) {
		SpringApplication.run(WsPayApplication.class, args);
	}
}
