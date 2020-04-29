

Flow 1. Login Servlet -> GET -> login.jsp
Flow 2. Login Servlet -> POST (Success) -> welcome.jsp
Flow 3. Login Servlet -> POST (Failure) -> login.jsp (with error message)


//Flow of MVC

1.Dispatcher Servlet
2./login->Login Controller
3.return Response i.e Himanshu Kumar


Note : Dispatcher Servlet is also called Front Controller

//Full Flow : 

Request from Client --> Request received by Dispatcher Servlet --> Search for the Controller which contain URI i.e /login ---> Execute the method --> Return Response


-------------------------------------------------------------------


Explanation of the below  snippet : 
===================================
	 <bean
        class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix">
            <value>/WEB-INF/views/</value>
        </property>
        <property name="suffix">
            <value>.jsp</value>
        </property>
    </bean>
    
   Here, prefix means ==> /WEB-INF/views/
   
   and suffix means ===> .jsp
   
   so what happens here if we suppose return "login" from a method of a Controller
   then it will behave as :	/WEB-INF/views/login.jsp 
   
   So in this way whatever the .jsp will contain it will be responded back to the client
 ----------------------------------------------------------------------------------------------------  
   
Spring MVC Request Flow:

-DispatcherServlet receives HTTP Request.
-DispatcherServlet identifies the right Controller based on the URL.
-Controller executes Business Logic.
-Controller returns a) Model b) View Name Back to DispatcherServlet.
-DispatcherServlet identifies the correct view (ViewResolver).
-DispatcherServlet makes the model available to view and executes it.
-DispatcherServlet returns HTTP Response Back.
-Flow : http://docs.spring.io/spring-framework/docs/2.0.8/reference/images/mvc.png


==============================================================================================================================================================================


## What we want to do:
- Understand importance of DispatcherServlet.
- Add Logging Framework Log4j to understand the flow much more. 

## Spring MVC Request Flow
- DispatcherServlet receives HTTP Request. 
- DispatcherServlet identifies the right Controller based on the URL.
- Controller executes Business Logic.
- Controller returns a) Model b) View Name Back to DispatcherServlet.
- DispatcherServlet identifies the correct view (ViewResolver).
- DispatcherServlet makes the model available to view and executes it.
- DispatcherServlet returns HTTP Response Back.
- Flow : http://docs.spring.io/spring-framework/docs/2.0.8/reference/images/mvc.png


```