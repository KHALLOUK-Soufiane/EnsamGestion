<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <div class="content">
        <div class="row">
          <div class="col-md-12">
            <div class="card">
              <div class="card-header">
              <div class="row">
              <div class="col-8"><h4 class="card-title"> Liste des emplois </h4></div>
              <div class="col-4"><a href="genererEmploi.jsp" class="btn btn-info">Generer un emplois</a></div>
               
              </div>
              
               <div class="row">
                <div class="col pr-1">
                      <div class="form-group">
                        <label>Filière:</label>
						<select class="form-select form-control" name="filiere">
                                        <optgroup label="Filiere">
                                            <option value="IAGI1">IAGI 1</option>
                                            <option value="IAGI2">IAGI 2</option>
                                            <option value="IAGI3">IAGI 3</option>
                                            <option value="GEM1">GEM 1</option>
                                            <option value="GEM2">GEM 2</option>
                                            <option value="GEM3">GEM 3</option>
                                            <option value="MSEI1">MSEI 1</option>
                                            <option value="MSEI2">MSEI 2</option>
                                            <option value="MSEI3">MSEI 3</option>
                                        </optgroup>
                                    </select>                      
                     </div>
                    </div>    
               
               </div>
               
              </div>
              
              <div class="card-body">
                <div class="table-responsive">
                  <table class="table">
                    <thead class="text-primary">
                      <th></th>
                      <th>
                        8h00-10h00
                      </th>
                      <th>
                        10h15-12h15
                      </th>
                      <th></th>
                      <th>
                        14h00-16h00
                      </th>
                      <th>
                        16h15-18h15
                      </th>
                      <th></th>
                    </thead>
                    <tbody>
                      
                        <tr>
                        <td style="color:red">
                          Lundi
                        </td>
                        <c:forEach var="sea" items="${seancesL}">
	                        <c:if test="${sea.heurDeb == 1400}">
	                        <td></td>
	                        </c:if>
	                        <td>
	                        
	                        
	                          ${sea.matiere.name}
	                        </td>
						</c:forEach>
                      </tr>
                      
                      <tr>
                      
                        <td style="color:red">
                          Mardi
                        </td>
                        <c:forEach var="sea" items="${seancesM}">
	                        <c:if test="${sea.heurDeb == 1400}">
	                        <td></td>
	                        </c:if>
	                        <td>
	                        
	                        
	                          ${sea.matiere.name}
	                        </td>
						</c:forEach>
                      </tr>
                      
                      <tr>
                        <td style="color:red">
                          Mercredi
                        </td>
                        <c:forEach var="sea" items="${seancesMe}">
	                        <c:if test="${sea.heurDeb == 1400}">
	                        <td></td>
	                        </c:if>
	                        <td>
	                        
	                        
	                          ${sea.matiere.name}
	                        </td>
						</c:forEach>
                      </tr>
                      <tr>
                        <td style="color:red">
                          Jeudi
                        </td>
                        <c:forEach var="sea" items="${seancesJ}">
	                        <c:if test="${sea.heurDeb == 1400}">
	                        <td></td>
	                        	                     
	                        
	                        </c:if>
	                        <td>
	                        
	                        
	                          ${sea.matiere.name}
	                        </td>
						</c:forEach>
                      </tr>
                      <tr>
                        <td style="color:red">
                          Vendredi
                        </td>
                        <c:forEach var="sea" items="${seancesV}">
	                        <c:if test="${sea.heurDeb == 1400}">
	                        <td></td>
	                        </c:if>
	                        <td>
	                        
	                        
	                          ${sea.matiere.name}
	                        </td>
						</c:forEach>
                      </tr>


                    </tbody>
                  </table>
                </div>  
                                     <div class="text-center"><button class="btn btn-primary">Modifier</button></div> 
                   
              </div>
            </div>
            
          </div>
          
              </div>
            </div>

    
 
 <jsp:include page="footer.jsp"></jsp:include>