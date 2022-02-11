<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <div class="content">
        <div class="row">
          <div class="col-md-12">
            <div class="card">
              <div class="card-header">
              <div class="row">
	              <div class="col-8"><h4 class="card-title"> Liste des étudiants </h4></div>
	              <c:if test="${user.appUserRole == 'ADMIN'}">
	              <div class="col-4"><a  href="ajouterEtudiant" class="btn btn-info">Ajouter un étudiant</a></div>
	              </c:if>
             
              </div>
                
              </div>
              <div class="card-body">
                <div class="table-responsive">
                  <table class="table">
                    <thead class=" text-primary">
                    <tr>
                      <th>
                        Apogee
                      </th>
                      <th>
                        Nom
                      </th>
                      <th>
                        Prenom
                      </th>
                      <th>
                        Niveau
                      </th>
                      <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="etu" items="${etudiants}">
                        <tr>
                        <td>
                          ${etu.code_apogee}
                        </td>
                        <td>
                          ${etu.nom}
                        </td>
                        <td>
                          ${etu.prenom}
                        </td>
                        <td>
                          ${etu.niveau}
                        </td>
                        <c:if test="${user.appUserRole == 'ADMIN'}">
                        <td>
                        <form action="/modifierEtudiant" method="get">
                    		<input type="hidden" value="${etu.id}" name="id">
                    		<input type="submit" class="btn btn-primary" value="Modifier">
                    	</form>
                    	<form action="/deleteEtudiant" method="post">
                    		<input type="hidden" value="${etu.id}" name="id">
                    		<input type="submit" class="btn btn-danger" value="Supprimer">
                    	</form>
                    	
                    	</td>
                    	</c:if>
                      </tr>
                      </c:forEach>
                    </tbody>
                    
                  </table>
                </div>
              </div>
            </div>
          </div>
          
          
              </div>
            </div>

    
 
 <jsp:include page="footer.jsp"></jsp:include>