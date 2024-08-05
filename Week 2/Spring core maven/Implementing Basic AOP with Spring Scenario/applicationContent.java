<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd
       http://www.springframework.org/schema/aop
       http://www.springframework.org/schema/aop/spring-aop.xsd">

    <!-- Enable component scanning -->
    <context:component-scan base-package="com.library" />

    <!-- Enable AspectJ auto-proxying -->
    <aop:aspectj-autoproxy/>

    <!-- Define BookService bean with constructor injection -->
    <bean id="bookService" class="com.library.service.BookService">
        <constructor-arg ref="bookRepository"/>
    </bean>

    <!-- Define BookRepository bean -->
    <bean id="bookRepository" class="com.library.repository.BookRepository"/>
</beans>
