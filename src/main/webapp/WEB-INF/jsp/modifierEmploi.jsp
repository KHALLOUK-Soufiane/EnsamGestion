<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
      <div class="content">
        <div class="row">
          <div class="col-md-8">
            <div class="card">
              <div class="card-header">
                <h5 class="title">Modifier l'emploi</h5>
              </div>
              <div class="card-body">
                <form:form action="modifierEmploi" method="post" modelAttribute="demandeEmp">

                  
                  <div class="row">
                    <div class="col pr-1">
                      <div class="form-group">
                        <form:label path="creneau">Creneau</form:label>
                        <form:select path="creneau" class="form-control" placeholder="Salle...">
                        	<c:forEach var = "sean" items="${sea}">                
                        		<form:option value="${sean.id}">${sean.creneau.daytime}</form:option>
                        	</c:forEach>
                        </form:select>
                      </div>
                    </div>
                  </div> 
                   
                  <div class="row">
                    <div class="col pr-1">
                      <div class="form-group">
                        <form:label path="matiere">Matiere</form:label>
                        <form:select path="matiere" class="form-control" placeholder="Salle...">
                        	<c:forEach var = "sean" items="${sea}">                
                        		<form:option value="${sean.id}">${sean.matiere.name}</form:option>
                        	</c:forEach>
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