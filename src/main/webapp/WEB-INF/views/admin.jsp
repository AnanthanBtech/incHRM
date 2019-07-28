<!doctype html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="What gets measured, gets managed">
<meta name="author" content="Ananthan, Sathish, Anish">
<meta name="docsearch:language" content="en">
<meta name="docsearch:version" content="4.3">

<title>Welcome to Incipere Application</title>
<!-- Bootstrap core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
<style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
</head>
<body>
   <div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
  <h5 class="my-0 mr-md-auto font-weight-normal">Incipere</h5>
  <nav class="my-2 my-md-0 mr-md-3">
    <a class="p-2 text-dark" href="#">Features</a>
    <a class="p-2 text-dark" href="#">Enterprise</a>
    <a class="p-2 text-dark" href="#">Support</a>
    <a class="p-2 text-dark" href="#">Pricing</a>
  </nav>
  <a class="btn btn-outline-primary" href="login">Sign up</a>
</div>


<div class="container">
     <div class="row align-items-center">
      
      <div class="col-md-12 order-md-1 text-center text-md-left pr-md-5">
        <h1 class="mb-3 bd-text-purple-bright">Incipere</h1>
        <p class="lead">
        Incipere is a great starting point for businesses who want to start tracking vital metrics with KPI tools. As the name would suggest, the software is designed to be incredibly simple and easy to use.<br>

		Don't mistake that simplicity for lack of power, though. Incipere is capable of tracking a wide range of metrics including financial metrics, marketing metrics, operational metrics, and service metrics.<br>

		It is a complete package, and suitable for businesses in almost any industry.<br>

		Incipere integrates with a number of popular software packages and offers 24/7 support to their customers. Like Geckoboard, SimpleKPI also features a full-screen option for you to display KPIs to your teams in real-time.
        </p>
        <p class="lead mb-4">
          Visualize and analyze your data with dashboards. Create insightful KPI dashboards to track your key performance indicators. With our KPI dashboard tool, share the dashboards you create with your colleagues for easier data analysis and collaboration.
        </p>
        <p class="lead mb-4">
        Most business owners know that they should be doing a better job of tracking their internal metrics. One of the biggest roadblocks to doing so is knowing what tools to use to make this daunting task easier. The software suites listed in this article are an excellent starting point for businesses of any size.
        </p>
         <h1>Name : ${name}</h1>
    <h1>Description : ${description}</h1>
 
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <h2>
            Welcome : ${user} | <a
                href="<c:url value="/j_spring_security_logout" />"> Logout</a>
        </h2>
    </c:if>
      </div>
    </div>
    

  <footer class="pt-4 my-md-5 pt-md-5 border-top">
    <div class="row">
      <div class="col-12 col-md">
        <img class="mb-2" src="/docs/4.3/assets/brand/bootstrap-solid.svg" alt="" width="24" height="24">
        <small class="d-block mb-3 text-muted">&copy; 2018-2019</small>
      </div>
      <div class="col-6 col-md">
        <h5>Features</h5>
        <ul class="list-unstyled text-small">
          <li><a class="text-muted" href="#">Cool stuff</a></li>
          <li><a class="text-muted" href="#">Random feature</a></li>
          <li><a class="text-muted" href="#">Team feature</a></li>
          <li><a class="text-muted" href="#">Stuff for developers</a></li>
          <li><a class="text-muted" href="#">Another one</a></li>
          <li><a class="text-muted" href="#">Last time</a></li>
        </ul>
      </div>
      <div class="col-6 col-md">
        <h5>Resources</h5>
        <ul class="list-unstyled text-small">
          <li><a class="text-muted" href="#">Resource</a></li>
          <li><a class="text-muted" href="#">Resource name</a></li>
          <li><a class="text-muted" href="#">Another resource</a></li>
          <li><a class="text-muted" href="#">Final resource</a></li>
        </ul>
      </div>
      <div class="col-6 col-md">
        <h5>About</h5>
        <ul class="list-unstyled text-small">
          <li><a class="text-muted" href="#">Team</a></li>
          <li><a class="text-muted" href="#">Locations</a></li>
          <li><a class="text-muted" href="#">Privacy</a></li>
          <li><a class="text-muted" href="#">Terms</a></li>
        </ul>
      </div>
    </div>
  </footer>
  
</div>
   

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="/docs/4.3/assets/js/vendor/jquery-slim.min.js"><\/script>')</script><script src="/docs/4.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o" crossorigin="anonymous"></script><script src="/docs/4.3/assets/js/docs.min.js"></script>
  </body>
</html>





























<!--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
    <h1>Name : ${name}</h1>
    <h1>Description : ${description}</h1>
 
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <h2>
            Welcome : ${user} | <a
                href="<c:url value="/j_spring_security_logout" />"> Logout</a>
        </h2>
    </c:if>
</body>
</html>-->
