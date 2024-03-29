<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    ENSAM CASABLANCA GESTION
  </title>
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <!--     Fonts and icons     -->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css">
  <!-- CSS Files -->
  <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
  <link href="assets/css/now-ui-dashboard.css?v=1.5.0" rel="stylesheet" />

</head>

<body class="">
  <div class="wrapper ">
    <div class="sidebar" data-color=blue>
      <!--
        Tip 1: You can change the color of the sidebar using: data-color="blue | green | orange | red | yellow"
    -->
      <div class="logo">
        <a href="" class="simple-text logo-mini">
          EG
        </a>
        <a href="/" class="simple-text logo-normal">
          <img style="width:100%" src="assets/img/logoapp.png">
        </a>
      </div>
      <div class="sidebar-wrapper" id="sidebar-wrapper">
        <ul class="nav">
           <c:if test="${user.appUserRole == 'ADMIN'}">
        
          <li>
            <a href="/dashboard">
            
              <i class="now-ui-icons design_app"></i>
              
              <p>Dashboard</p>
            </a>
          </li>
			</c:if>


         
           <li>
            <a href="emplois">
              <i class="now-ui-icons files_single-copy-04"></i>
              <p>Liste des emplois</p>
            </a>
          </li>
          
          <c:if test="${user.appUserRole != 'STUDENT'}">
          
          <li>
            <a href="etudiants">
              <i class="now-ui-icons education_hat"></i>
              <p>Liste des étudiants</p>
            </a>
          </li>
                    <li>
            <a href="salles">
              <i class="now-ui-icons tech_mobile"></i>
              <p>Liste des salles</p>
            </a>
          </li>
          </c:if>
          <c:if test="${user.appUserRole == 'ADMIN'}">
          
         <li>
            <a href="professeurs">
              <i class="now-ui-icons design_bullet-list-67"></i>
              <p>Liste des professeurs</p>
            </a>
          </li>
          
          </c:if>
            <li>
            <a href="reserverSalle">
              <i class="now-ui-icons tech_mobile"></i>
              <p>Reserver des salles</p>
            </a>
          </li>
          <c:if test="${user.appUserRole == 'PROFESSOR'}">
            <li>
            <a href="modifierEmploi">
              <i class="now-ui-icons tech_mobile"></i>
              <p>Demande Modification Emploi</p>
            </a>
          </li>
          </c:if>
        </ul>
      </div>
    </div>
        <div class="main-panel" id="main-panel">
      <!-- Navbar -->
      <nav class="navbar navbar-expand-lg navbar-transparent  bg-primary  navbar-absolute">
        <div class="container-fluid">
          <div class="navbar-wrapper">
            <div class="navbar-toggle">
              <button type="button" class="navbar-toggler">
                <span class="navbar-toggler-bar bar1"></span>
                <span class="navbar-toggler-bar bar2"></span>
                <span class="navbar-toggler-bar bar3"></span>
              </button>
            </div>
            <a class="navbar-brand" href=""></a>
          </div>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
          </button>
          <div class="collapse navbar-collapse justify-content-end" id="navigation">
                            <p>BONJOUR ${user.firstName}</p>

            <ul class="navbar-nav">
              <li class="nav-item">
                <a class="nav-link" href="">
                  <i class="now-ui-icons media-2_sound-wave"></i>
                  <p>
                    <span class="d-lg-none d-md-block">Stats</span>
                  </p>
                </a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="now-ui-icons users_single-02"></i>
                </a>
                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                  <a class="dropdown-item" href="#">${user.firstName} ${user.lastName}</a>
                  <a class="dropdown-item" href="/logout">Logout</a>
                </div>
              </li>
              
            </ul>
          </div>
        </div>
      </nav>
      <!-- End Navbar -->
                 
      
            <div class="panel-header panel-sm">
             <img src="assets/img/waves.png" style="width:100%;height:150px">
      </div>
    
