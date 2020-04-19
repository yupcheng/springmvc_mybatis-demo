# springmvc_mybatis-demo
ssm测试
主要测试时间转换注解 必要的配置
@DateTimeFormat(pattern =  "yyyy-MM-dd HH:mm:ss")
@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")


1.maven导入依赖的jar包
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>2.5.3</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.5.3</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
            <version>2.5.3</version>
        </dependency>
        
 2.mvc必要配置
  <mvc:annotation-driven/>
    <!-- 导入属性配置文件 -->
    <context:property-placeholder location="classpath:jdbc.properties" />
    <bean id="handlerMapping" class="org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping" />
    <bean id="handlerAdapter" class="org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter">
        <property name="messageConverters">
            <list>
                <bean class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter" />
            </list>
        </property>
    </bean>
    
  3.实体类使用注解（两个注解可以同时使用在同一个属性上）
  @DateTimeFormat(pattern =  "yyyy-MM-dd HH:mm:ss")  -->前端传入参数 字符串转Date
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8") --->后端返回前端数据 Date转字符串
