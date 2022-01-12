<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <div class="content">
        <div class="row">
          <div class="col-md-12">
            <div class="card">
              <div class="card-header">
              <div class="row">
              <div class="col-8"><h4 class="card-title"> Liste des professeurs </h4></div>
              <div class="col-4"><a  href="ajouterProfesseur" class="btn btn-info">Ajouter un professeur</a></div>
               
              </div>
                
              </div>
              <div class="card-body">
                <div class="table-responsive">
                  <table class="table">
                    <thead class=" text-primary">
                      <th>
                        CIN
                      </th>
                      <th>
                        Nom
                      </th>
                      <th>
                        Prenom
                      </th>
                      <th>
                        Email
                      </th>
                      <th>
                      Telephone
                      </th>
                      <th></th>
                    </thead>
                    <tbody>
                      <c:forEach var="prof" items="${profs}">
                        <tr>
                        <td>
                          ${prof.CIN}
                        </td>
                        <td>
                          ${prof.nom}
                        </td>
                        <td>
                          ${prof.prenom}
                        </td>
                        <td>
                          ${prof.email}
                        </td>
                        <td>
                    	<button class="btn btn-primary">Modifier</button>
                    	<form action="/deleteProfesseur" method="post">
                    		<input type="hidden" value="${prof.id}" name="id">
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