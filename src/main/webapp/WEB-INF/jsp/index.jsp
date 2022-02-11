<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    


      <div class="content">
        <div class="row">
          <div class="col-lg-4">
            <div class="card card-chart">
              <div class="card-header">
                <h4 class="card-title">Nombre d'étudiants</h4>
                
              </div>
              <div class="card-body">
                  <center> <h6 class="card-title">${nbEtudiant}</h6> </center>

              </div>
              <div class="card-footer">
                <div class="stats">
                  <i class="now-ui-icons arrows-1_refresh-69"></i> Just Updated
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-4 col-md-6">
            <div class="card card-chart">
              <div class="card-header">
                <h4 class="card-title">Nombre de professeurs</h4>
                
              </div>
              <div class="card-body">
                     <center>  <h6 class="card-title">${nbProf}<h6></center>

              </div>
              <div class="card-footer">
                <div class="stats">
                  <i class="now-ui-icons arrows-1_refresh-69"></i> Just Updated
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-4 col-md-6">
            <div class="card card-chart">
              <div class="card-header">
                <h4 class="card-title">Nombre de salles</h4>
              </div>
              <div class="card-body">
                 <center><h6 class="card-title">${nbSalle}</h6></center>

              </div>
              <div class="card-footer">
                <div class="stats">
                  <i class="now-ui-icons arrows-1_refresh-69"></i> Just Updated
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-md-6">
            <div class="card  card-tasks">
              <div class="card-header ">
                <h4 class="card-title">DEMANDES DE RESERVATIONS DE SALLES</h4>
              </div>
              <div class="card-body ">
                <div class="table-full-width table-responsive">
                  <table class="table">
                    <thead class=" text-primary">
                      <th>
                        User
                      </th>
                      <th>
                        Creneau
                      </th>
                      <th>
                        Salle
                      </th>
                    </thead>
                    <tbody>
                    <c:forEach var="res" items="${reservations}">
                    <tr>
                        <td>
                         	${res.appuser.firstName} ${res.appuser.lastName}
                        </td>
                        <td>
                        	${res.creneau.daytime}
                        </td>
                        <td>
                        	${res.salle.libelle}
                        </td>
                   	</tr>
                    </c:forEach>
                    </tbody>
                  </table>
                </div>
              </div>
              <div class="card-footer ">
                <hr>
                <div class="stats">
                  <i class="now-ui-icons loader_refresh spin"></i> A Jour
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-6">
            <div class="card">
              <div class="card-header">
                <h4 class="card-title"> DEMANDES DE MODIFICATION D'EMPLOI</h4>
              </div>
              <div class="card-body">
                <div class="table-responsive">
                  <table class="table">
                    <thead class=" text-primary">
                      <th>
                        Professeur
                      </th>
                      <th>
                        Matiere
                      </th>
                      <th>
                        Creneau
                      </th>
                    </thead>
                    <tbody>
                    <c:forEach var="dem" items="${demandes}">
                    <tr>
                        <td>
                         	${dem.appuser.firstName} ${dem.appuser.lastName}
                        </td>
                        <td>
                        	${dem.matiere.name}
                        </td>
                        <td>
                        	${dem.creneau.daytime}
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