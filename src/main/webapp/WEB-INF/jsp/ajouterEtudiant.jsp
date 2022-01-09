<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
      <div class="content">
        <div class="row">
          <div class="col-md-8">
            <div class="card">
              <div class="card-header">
                <h5 class="title">Ajouter un etudiant</h5>
              </div>
              <div class="card-body">
                <form:form action="ajouterEtudiant" method="post" modelAttribute="etudiant">
                  <div class="row">
                    <div class="col pr-1">
                      <div class="form-group">
                        <form:label path="code_apogee">Code apogee</form:label>
                        <form:input type="text" class="form-control" placeholder="Apogee" path="code_apogee"/>
                      </div>
                    </div>                  
                  </div>
                  
                  <div class="row">
                    <div class="col-md-6 pr-1">
                      <div class="form-group">
                        <form:label path="nom" >Nom</form:label>
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
                    <div class="col pr-1">
                      <div class="form-group">
                        <form:label path="niveau">Filière</form:label>
						<form:select path="niveau" class="form-select form-control">
	                        <optgroup label="Filiere">
	                            <form:option value="IAGI">IAGI</form:option>
	                            <form:option value="MSEI">MSEI</form:option>
	                            <form:option value="GEM">GEM</form:option>
	                            <form:option value="GI">GI</form:option>
	                            <form:option value="GM">GM</form:option>
	                        </optgroup>
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