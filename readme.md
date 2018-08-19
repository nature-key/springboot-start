日志

  1.logging默认配置是info
  
  2.通过logging.level配置等级
  
   TRACE, DEBUG, INFO, WARN, ERROR, FATAL, OFF(关闭)
  
  3.配置详解
  
    logging.file=/Users/anfu/my.log文件地址
    
    logging.path=/Users/anfu/log 文件路径
    //文件格式
    logging.pattern.file=%boldMagenta(%d{yyyy-MM-dd HH:mm:ss})  [%p]  %highlight(%C:%L)  : %m %n
    //控制台格式
    logging.pattern.console=%boldMagenta(%d{yyyy-MM-dd HH:mm:ss})  [%p]  %highlight(%C:%L)  : %m %n
  
  4。默认支持logback
  
    只要在classpath下配置logback.xml 或logback-spring.xml可定制日志输出
  
  5.使用其他日志
    
    排除默认日志
     <exclusions>
        <exclusion>
            <artifactId>spring-boot-starter-logging</artifactId>
            <groupId>org.springframework.boot</groupId>
        </exclusion>
     </exclusions>
     
     加入组件日志依赖
     <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-log4j2</artifactId>
        <version>2.0.4.RELEASE</version>
     </dependency>
     配置文件的放到fclasspath log4j2.xml
      