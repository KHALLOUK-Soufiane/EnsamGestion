<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <div class="content">
        <div class="row">
          <div class="col-md-12">
            <div class="card">
              <div class="card-header">
              <div class="row">
              <div class="col-8"><h4 class="card-title"> Liste des salles </h4></div>
              <div class="col-4"><a href="ajouterSalle" class="btn btn-info">Ajouter une salle</a></div>
               
              </div>
                
              </div>
              <div class="card-body">
                <div class="table-responsive">
                  <table class="table">
                    <thead class=" text-primary">
                      <th>
                        Libelle
                      </th>
                      <th>
                        Etage
                      </th>
                      <th>
                      Capacité
                      </th>
                      
                      <th></th>
                    </thead>
                    <tbody>
                        <c:forEach var="salle" items="${salles}">
                        <tr>
                        <td>
                          ${salle.libelle}
                        </td>
                        <td>
                          ${salle.etage}
                        </td>
                        <td>
                          ${salle.capacite}
                        </td>
                        <td>
                    	<button class="btn btn-primary">Modifier</button>
                    	<form action="/deleteSalle" method="post">
                    		<input type="hidden" value="${salle.id}" name="id">
                    		<input type="submit" class="btn btn-danger" value="Supprimer">
                    	</form>
                    	
                    	</td>
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