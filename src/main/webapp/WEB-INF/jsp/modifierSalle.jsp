<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
      <div class="content">
        <div class="row">
          <div class="col-md-8">
            <div class="card">
              <div class="card-header">
                <h5 class="title">Modifier une salle</h5>
              </div>
              <div class="card-body">
                <form:form action="modifierSalle" method="post" modelAttribute="salle">
                <form:input type="hidden" class="form-control" path="id" value="${salleExistante.id}"/>
                  <div class="row">
                    <div class="col pr-1">
                      <div class="form-group">
                        <form:label path="libelle">Libellé</form:label>
                        <form:input path="libelle" type="text" class="form-control" placeholder="Libellé..." value="${salleExistante.libelle}"/>
                      </div>
                    </div>                  
                  </div>
                  
                  <div class="row">
                    <div class="col-md-6 pr-1">
                      <div class="form-group">
                        <form:label path="etage">Etage</form:label>
                        <form:input path="etage" type="text" class="form-control" placeholder="Etage..." value="${salleExistante.etage}"/>
                      </div>
                    </div>
                    <div class="col-md-6 pl-1">
                      <div class="form-group">
                        <form:label path="capacite">Capacité</form:label>
                        <form:input path="capacite" type="text" class="form-control" placeholder="Capacité..." value="${salleExistante.capacite}"/>
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