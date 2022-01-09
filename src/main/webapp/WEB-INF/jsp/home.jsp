    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    ENSAM GESTION
  </title>
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <!--     Fonts and icons     -->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css">
  <!-- CSS Files -->
  <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
  <link href="assets/css/now-ui-dashboard.css?v=1.5.0" rel="stylesheet" />
</head>

<body class="offline-doc">
  <!-- Navbar -->
  <nav class="navbar navbar-expand-lg navbar-transparent  bg-primary  navbar-absolute">
    <div class="container">
      <div class="navbar-wrapper">
        <div class="navbar-toggle">
          <button type="button" class="navbar-toggler">
            <span class="navbar-toggler-bar bar1"></span>
            <span class="navbar-toggler-bar bar2"></span>
            <span class="navbar-toggler-bar bar3"></span>
          </button>
        </div>
        <a class="navbar-brand" href="">ENSAM GESTION</a>
      </div>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-bar navbar-kebab"></span>
        <span class="navbar-toggler-bar navbar-kebab"></span>
        <span class="navbar-toggler-bar navbar-kebab"></span>
      </button>
      <div class="collapse navbar-collapse justify-content-end" id="navigation">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" href="login.jsp">
               Login
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">
              Have an issue?
            </a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <div class="page-header clear-filter" filter-color="orange">
    <div class="page-header-image" style="background-image: url('assets/img/header.jpg');"></div>
    <div class="container text-center">
      <div class="col-md-8 ml-auto mr-auto">
        <div class="brand">
          <h1 class="title">
            ENSAM GESTION
          </h1>
          <h3 class="description">Welcome to ENSAM GESTION</h3>
          <br />
          
          <div class="content">
          
        <div class="row">
        
          <div class="col-lg-4">
            <div class="card card-chart" style="background-color: rgba(0,0,0,0.7) ;">
              <div class="card-header">
                <h5 class="card-category">Combien d'etudiants ?</h5>
                <h4 class="card-title" style="color:red">1202</h4>
              </div>
              <div class="card-body">
                      <span class="now-ui-icons users_single-02"></span>
              </div>
              <div class="card-footer">
                <div class="stats">
                  <i class="now-ui-icons arrows-1_refresh-69"></i> Just Updated
                </div>
              </div>
            </div>
          </div>   
          
          <div class="col-lg-4">
            <div class="card card-chart" style="background-color: rgba(0,0,0,0.7) ;">
              <div class="card-header">
                <h5 class="card-category">Combien de filières ?</h5>
                <h4 class="card-title" style="color:red">5</h4>
              </div>
              <div class="card-body">
                      <span class="now-ui-icons files_single-copy-04"></span>
              </div>
              <div class="card-footer">
                <div class="stats">
                  <i class="now-ui-icons arrows-1_refresh-69"></i> Just Updated
                </div>
              </div>
            </div>
          </div>   
          
          <div class="col-lg-4">
            <div class="card card-chart" style="background-color: rgba(0,0,0,0.7) ;">
              <div class="card-header">
                <h5 class="card-category">Combien de salles ?</h5>
                <h4 class="card-title" style="color:red">76</h4>
              </div>
              <div class="card-body">
                                    <span class="now-ui-icons design-2_ruler-pencil"></span>
              
              </div>
              <div class="card-footer">
                <div class="stats">
                  <i class="now-ui-icons arrows-1_refresh-69"></i> Just Updated
                </div>
              </div>
            </div>
          </div>   
                 
          </div>
          
          <a href="" class="btn btn-primary btn-round btn-lg">LOGIN NOW</a>
        </div>
      </div>
    </div>
  </div>
  
 <jsp:include page="footer.jsp"></jsp:include>
 </div>