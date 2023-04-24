//package com.ipageon.nmsif;
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.mybatis.spring.SqlSessionFactoryBean;
//
//@Configuration
//@MapperScan(basePackages = { "com.ipageon.nmsif", "com.kt.bcn.adaptor.equip.server.service.as", "com.samsung.nms.agent.dataType", "ConfigService"}) //해당 패키지를 스캔
//public class MybatisConfiguration {
//
//
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory(@Autowired DataSource dataSource, ApplicationContext applicationContext) throws Exception{
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean(); //팩토리 빈 생성
//        factoryBean.setDataSource(dataSource); //미리 만들어 놓은 DataSource 빈을 주입하여 넣어준다.
//        factoryBean.setMapperLocations(applicationContext.getResources("classpath:query/mapper/*.xml"));
//        SqlSessionFactory factory = factoryBean.getObject();
//        factory.getConfiguration().setMapUnderscoreToCamelCase(true);
//        return factoryBean.getObject();
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(@Autowired SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory); //sqlSessionTemplate 에 만들어 놓은 팩토리 주입
//    }
//}