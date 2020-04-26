

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