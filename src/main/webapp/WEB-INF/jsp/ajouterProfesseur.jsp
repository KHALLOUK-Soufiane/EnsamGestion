<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
      <div class="content">
        <div class="row">
          <div class="col-md-8">
            <div class="card">
              <div class="card-header">
                <h5 class="title">Ajouter un professeur</h5>
              </div>
              <div class="card-body">
                <form>
                  <div class="row">
                    <div class="col pr-1">
                      <div class="form-group">
                        <label>CIN</label>
                        <input type="text" class="form-control" placeholder="CIN...">
                      </div>
                    </div>                  
                  </div>
                  
                  <div class="row">
                    <div class="col-md-6 pr-1">
                      <div class="form-group">
                        <label>Nom</label>
                        <input type="text" class="form-control" placeholder="Nom...">
                      </div>
                    </div>
                    <div class="col-md-6 pl-1">
                      <div class="form-group">
                        <label>Prenom</label>
                        <input type="text" class="form-control" placeholder="Prenom...">
                      </div>
                    </div>
                  </div>
                  
                   <div class="row">
                    <div class="col-md-6 pr-1">
                      <div class="form-group">
                        <label>E-mail</label>
                        <input type="text" class="form-control" placeholder="Email ...">
                      </div>
                    </div>
                    <div class="col-md-6 pl-1">
                      <div class="form-group">
                        <label>Telephone</label>
                        <input type="text" class="form-control" placeholder="Telephone ...">
                      </div>
                    </div>
                  </div>
                  
                   
                  <button class="btn btn-primary d-block btn-user w-100">Ajouter</button>
                </form>
              </div>
            </div>
          </div>
          </div>
          </div>
        
 <jsp:include page="footer.jsp"></jsp:include>