# spring-boot-06-data-jdbc
SpringData第一章

<dependency>
<groupId>org.springframework.boot</groupId>            
<artifactId>spring‐boot‐starter‐jdbc</artifactId>            
</dependency>        
<dependency>        
<groupId>mysql</groupId>            
<artifactId>mysql‐connector‐java</artifactId>            
<scope>runtime</scope>            
</dependency>

spring:
  datasource:
    username: root
    password: 123456
    url: jdbc:mysql://192.168.15.22:3306/jdbc
    driver‐class‐name: com.mysql.jdbc.Driver
    
效果：
默认是用org.apache.tomcat.jdbc.pool.DataSource作为数据源；
数据源的相关配置都在DataSourceProperties里面；
自动配置原理：
org.springframework.boot.autoconfigure.jdbc：
1、参考DataSourceConfiguration，根据配置创建数据源，默认使用Tomcat连接池；可以使用spring.datasource.type指定自定义的数据源类型；
2、SpringBoot默认可以支持；
org.apache.tomcat.jdbc.pool.DataSource、HikariDataSource、BasicDataSource、

2、整合Druid数据源


