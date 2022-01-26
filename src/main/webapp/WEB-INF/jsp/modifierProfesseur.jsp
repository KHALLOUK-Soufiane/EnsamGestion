<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
      <div class="content">
        <div class="row">
          <div class="col-md-8">
            <div class="card">
              <div class="card-header">
                <h5 class="title">Modifier un professeur</h5>
              </div>
              <div class="card-body">
                <form:form action="modifierProfesseur" method="post" modelAttribute="professeur">
                <form:input type="hidden" class="form-control" path="id" value="${professeurExistant.id}"/>
                  <div class="row">
                    <div class="col pr-1">
                      <div class="form-group">
                        <form:label path="CIN">CIN</form:label>
                        <form:input path="CIN" type="text" class="form-control" placeholder="CIN..." value="${professeurExistant.CIN}"/>
                      </div>
                    </div>                  
                  </div>
                  
                  <div class="row">
                    <div class="col-md-6 pr-1">
                      <div class="form-group">
                        <form:label path="nom">Nom</form:label>
                        <form:input path="nom" type="text" class="form-control" placeholder="Nom..." value="${professeurExistant.nom}"/>
                      </div>
                    </div>
                    <div class="col-md-6 pl-1">
                      <div class="form-group">
                        <form:label path="prenom">Prenom</form:label>
                        <form:input path="prenom" type="text" class="form-control" placeholder="Prenom..." value="${professeurExistant.prenom}"/>
                      </div>
                    </div>
                  </div>
                  
                   <div class="row">
                    <div class="col-md-6 pr-1">
                      <div class="form-group">
                        <form:label path="email">E-mail</form:label>
                        <form:input path="email" type="text" class="form-control" placeholder="Email ..." value="${professeurExistant.email}"/>
                      </div>
                    </div>
                    <div class="col-md-6 pl-1">
                      <div class="form-group">
                        <form:label path="tel">Telephone</form:label>
                        <form:input path="tel" type="text" class="form-control" placeholder="Telephone ..." value="${professeurExistant.tel}"/>
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