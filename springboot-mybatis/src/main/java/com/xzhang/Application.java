package com.xzhang;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * desc : springboot启动
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@MapperScan("com.xzhang.mapper")  //表示Mybatis的映射路径（package路径）
public class Application {
    private static Logger logger = Logger.getLogger(Application.class);


    /**
     * desc : 获取到数据源
     * @return
     * 表示将根据前缀“spring.datasource”从application.properties中匹配相关属性值
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(){
        return new org.apache.tomcat.jdbc.pool.DataSource();
    }

    /**
     * desc : 获取到SqlSessionFactory对象
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }


    /**
     * 获取到spring事务的实现接口PlatformTransactionManager
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }

    /**
     * desc : 项目启动
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
        logger.info("SpringBoot Start");
    }


}
