<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
      <div class="content">
        <div class="row">
          <div class="col-md-8">
            <div class="card">
              <div class="card-header">
                <h5 class="title">Reserver une salle</h5>
              </div>
              <div class="card-body">
                <form:form action="reserverSalle" method="post" modelAttribute="reservation">

                  
                  <div class="row">
                    <div class="col pr-1">
                      <div class="form-group">
                        <form:label path="creneau">Creneau</form:label>
                        <form:select path="creneau" class="form-control" placeholder="Salle...">
                        	<form:options items="${creneaux}" itemLabel="day" itemValue="id"></form:options>
                        </form:select>
                      </div>
                    </div>
                    <div class="">
                      <div class="form-group">
                        <form:input path="appuser" type="hidden" value="${user.id}"/>
                      </div>
                    </div>
                  </div>

                  <div class="row">
                    <div class="col pr-1">
                      <div class="form-group">
                        <form:label path="salle">Salle</form:label>
                        <form:select path="salle" class="form-control" placeholder="Salle...">
                        	<form:options items="${salles}" itemLabel="libelle" itemValue="id"></form:options>
                        </form:select>
                      </div>
                    </div>                  
                  </div>

                  
                  <button type="submit" class="btn btn-primary d-block btn-user w-100">Ajouter</button>
                </form:form>
              </div>
            </div>
          </div>
          </div>
          </div>
        
 <jsp:include page="footer.jsp"></jsp:include>