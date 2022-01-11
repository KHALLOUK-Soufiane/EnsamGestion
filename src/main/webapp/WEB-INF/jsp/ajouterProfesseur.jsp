<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
      <div class="content">
        <div class="row">
          <div class="col-md-8">
            <div class="card">
              <div class="card-header">
                <h5 class="title">Ajouter un professeur</h5>
              </div>
              <div class="card-body">
                <form:form action="ajouterProfesseur" method="post" modelAttribute="professeur">
                  <div class="row">
                    <div class="col pr-1">
                      <div class="form-group">
                        <form:label path="CIN">CIN</form:label>
                        <form:input path="CIN" type="text" class="form-control" placeholder="CIN..."/>
                      </div>
                    </div>                  
                  </div>
                  
                  <div class="row">
                    <div class="col-md-6 pr-1">
                      <div class="form-group">
                        <form:label path="nom">Nom</form:label>
                        <form:input path="nom" type="text" class="form-control" placeholder="Nom..."/>
                      </div>
                    </div>
                    <div class="col-md-6 pl-1">
                      <div class="form-group">
                        <form:label path="prenom">Prenom</form:label>
                        <form:input path="prenom" type="text" class="form-control" placeholder="Prenom..."/>
                      </div>
                    </div>
                  </div>
                  
                   <div class="row">
                    <div class="col-md-6 pr-1">
                      <div class="form-group">
                        <form:label path="email">E-mail</form:label>
                        <form:input path="email" type="text" class="form-control" placeholder="Email ..."/>
                      </div>
                    </div>
                    <div class="col-md-6 pl-1">
                      <div class="form-group">
                        <form:label path="tel">Telephone</form:label>
                        <form:input path="tel" type="text" class="form-control" placeholder="Telephone ..."/>
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